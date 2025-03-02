package net.omegacat9999.chemistrymod.item.custom.compounds;

import net.omegacat9999.chemistrymod.item.custom.ModItem;

import java.util.ArrayList;

public class CompoundItem extends ModItem {

    public CompoundItem(Settings settings, String state,  String type, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R) {
        super(settings, boiling_point, melting_point, density);
        composition_init(C_P,C_R);
        this.state = state;
        this.type = type;
    }
    String state;
    String type;
    @Override
    public String getModItemName() {
        return "compound_" + super.getModItemName();
    }
}