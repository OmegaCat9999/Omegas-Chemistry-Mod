package net.omegacat9999.chemistrymod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModItem extends Item {
    public ModItem(Settings settings, float boiling_point, float melting_point, float density) {
        super(settings);
        this.boiling_point = boiling_point;
        this.melting_point = melting_point;
        this.density = density;
    }

    public float boiling_point;
    public float melting_point;
    public float density;
    public String molecular_formula;
    public String empirical_formula;
    public float[] composition_percent = new float[128];
    public ArrayList<String> composition_ratio = new ArrayList<String>();
    /* composition_ratio: {
        "carbon:1"
        "hydrogen:4"
    }
    */
    public void composition_init(float[] c_p, ArrayList<String> c_r){
        this.composition_percent = c_p;
        this.composition_ratio = c_r;
    }

    public String getModItemName (){
        return getName().getString().toLowerCase();
    }

    public int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    private void formula (String formula_type){
        if (Objects.equals(formula_type, "molecular")) {
            for (String s : composition_ratio) {
                molecular_formula += s.substring(0, s.indexOf(':'));
                molecular_formula += s.substring(s.indexOf(':') + 1);
            }

        } else if (Objects.equals(formula_type, "empirical")){
            ArrayList<String> amounts = new ArrayList<String>();
            for (String s : composition_ratio) {
                amounts.add(s.substring(s.indexOf(':') + 1));
            }
            int gcd = Integer.getInteger(amounts.getFirst());
            for (int i = 1; i < amounts.size(); i++) {
                gcd = gcd(gcd, Integer.getInteger(amounts.get(i)));
            }
            for (String s : composition_ratio) {
                empirical_formula += s.substring(0, s.indexOf(':'));
                empirical_formula += Integer.toString(Integer.getInteger(s.substring(s.indexOf(':') + 1))/gcd);
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".molecular_formula"));
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".advanced"));
        } else {
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".basic"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
