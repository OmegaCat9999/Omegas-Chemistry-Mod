package net.omegacat9999.chemistrymod.item.custom.compounds;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class OrganicCompoundItem extends CompoundItem{
    public OrganicCompoundItem(Settings settings,  String type, String state, float density, float boiling_point, float melting_point, float[] C_P, ArrayList<String> C_R) {
        this(settings, type, state, -1, boiling_point, melting_point, density, C_P, C_R);
    }

    public OrganicCompoundItem(Settings settings, String type, String state, int homologue, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R) {
        super(settings, boiling_point, melting_point, density, C_P, C_R);
        this.type = type;
        this.homologue = homologue;
        this.state = state;
    }
    String type;
    String state;
    int homologue;

}