package net.omegacat9999.chemistrymod.item.custom.compounds;

import java.util.ArrayList;
import java.util.Arrays;

public class CompoundItemData {
    // C_P stands for composition_percentage, C_R stands for composition_ratio, C_S_F stands for condensed structural formula.
    // ORGANIC
    // ALKANES
    public static float[] METHANE_C_P = {0.8f,0f,0f,0f,0f,0.2f};
    public static ArrayList<String> METHANE_C_R = new ArrayList<String>(Arrays.asList("C:1", "H:4"));
    public static String METHANE_C_S_F = "CH4";
    public static float[] ETHANE_C_P = {0.25f,0f,0f,0f,0f,0.75f};
    public static ArrayList<String> ETHANE_C_R = new ArrayList<String>(Arrays.asList("C:2", "H:6"));
    public static String ETHANE_C_S_F = "CH3CH3";
    public static float[] PROPANE_C_P = {((float) 8 / 11),0f,0f,0f,0f,((float) 3 / 11)};
    public static ArrayList<String> PROPANE_C_R = new ArrayList<String>(Arrays.asList("C:3", "H:8"));
    public static String PROPANE_C_S_F = "CH3CH2CH3";
    public static float[] BUTANE_C_P = {((float) 2 / 7),0f,0f,0f,0f,((float) 5 / 7)};
    public static ArrayList<String> BUTANE_C_R = new ArrayList<String>(Arrays.asList("C:4", "H:10"));
    public static String BUTANE_C_S_F = "CH3CH2CH2CH3";

    public static float[] PENTANE_C_P = {0.8f,0f,0f,0f,0f,0.2f};
    public static ArrayList<String> PENTANE_C_R = new ArrayList<String>(Arrays.asList("C:1", "H:4"));
    public static float[] HEXANE_C_P = {0.25f,0f,0f,0f,0f,0.75f};
    public static ArrayList<String> HEXANE_C_R = new ArrayList<String>(Arrays.asList("C:2", "H:6"));
    public static float[] HEPTANE_C_P = {((float) 8 / 11),0f,0f,0f,0f,((float) 3 / 11)};
    public static ArrayList<String> HEPTANE_C_R = new ArrayList<String>(Arrays.asList("C:3", "H:8"));
    public static float[] OCTANE_C_P = {((float) 2 / 7),0f,0f,0f,0f,((float) 5 / 7)};
    public static ArrayList<String> OCTANE_C_R = new ArrayList<String>(Arrays.asList("C:4", "H:10"));

    public static float[] WATER_C_P = {0.66f,0f,0f,0f,0f,0f,0f,0.33f};
    public static ArrayList<String> WATER_C_R = new ArrayList<String>(Arrays.asList("H:2", "O:1"));

    // INORGANIC
    public static ArrayList<String> SODIUM_CHLORIDE_C_R = new ArrayList<String>(Arrays.asList("Na:2", "Cl:1"));
    public static float[] SODIUM_CHLORIDE_C_P = {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.5f,0f,0f,0f,0f,0f,0.5f,0f};
}