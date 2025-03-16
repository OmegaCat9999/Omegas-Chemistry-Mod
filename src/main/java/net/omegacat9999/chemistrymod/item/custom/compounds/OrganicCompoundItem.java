package net.omegacat9999.chemistrymod.item.custom.compounds;

import java.util.ArrayList;
import java.util.Objects;

public class OrganicCompoundItem extends CompoundItem{
    public OrganicCompoundItem(Settings settings,  String type, String state, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R, String S_F) {
        this(settings, type, state, -1, boiling_point, melting_point, density, C_P, C_R, S_F);
    }
    public OrganicCompoundItem(Settings settings,  String type, String state, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R) {
        this(settings, type, state, -1, boiling_point, melting_point, density, C_P, C_R, "");
    }
    public OrganicCompoundItem(Settings settings, String type, String state, int homologue, float boiling_point, float melting_point, float density, float[] C_P, ArrayList<String> C_R, String S_F) {
        super(settings, state, type, boiling_point, melting_point, density, C_P, C_R);
        this.homologue = homologue;
        if (!Objects.equals(S_F, ""))
            this.structural_formula = S_F;
        else {
            this.structural_formula = this.molecular_formula;
        }
    }
    int homologue;
}