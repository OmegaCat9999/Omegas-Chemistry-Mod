package net.omegacat9999.chemistrymod.item.custom.element_element;

import net.omegacat9999.chemistrymod.item.custom.ModItem;

public class Element_ElementItem extends ModItem {

    public Element_ElementItem(Settings settings, String isotope, int[] S_P_C, float boiling_point, float melting_point, float density) {
        super(settings, boiling_point, melting_point, density);
        this.proton_num = S_P_C[0];
        this.neutron_num = S_P_C[1];
        this.electron_num = S_P_C[2];
        this.isotope = isotope;
    }

    int proton_num;
    int neutron_num;
    int electron_num;
    String isotope = "";

    @Override
    public String getModItemName() {
        return super.getModItemName() + "_element";
    }

}