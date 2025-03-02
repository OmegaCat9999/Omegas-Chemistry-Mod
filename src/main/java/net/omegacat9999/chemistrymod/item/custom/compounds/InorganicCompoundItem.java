package net.omegacat9999.chemistrymod.item.custom.compounds;

import java.util.ArrayList;

public class InorganicCompoundItem extends CompoundItem{
    public InorganicCompoundItem(Settings settings, String state,  String type, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R) {
        super(settings, state, type, boiling_point, melting_point, density, C_P, C_R);
    }
}
