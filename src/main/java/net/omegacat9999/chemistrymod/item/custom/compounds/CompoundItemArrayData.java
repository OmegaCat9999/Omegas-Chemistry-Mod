package net.omegacat9999.chemistrymod.item.custom.compounds;

import java.util.ArrayList;
import java.util.Arrays;

public class CompoundItemArrayData {
    // C_P stands for composition_percentage, C_R stands for composition_ratio.
    // ORGANIC
    public static float[] METHANE_C_P = {0.8f,0f,0f,0f,0f,0.2f};
    public static ArrayList<String> METHANE_C_R = new ArrayList<String>(Arrays.asList("C:1", "H:4"));
    public static float[] ETHANE_C_P = {0.25f,0f,0f,0f,0f,0.75f};
    public static ArrayList<String> ETHANE_C_R = new ArrayList<String>(Arrays.asList("C:2", "H:6"));
    public static float[] WATER_C_P = {0.66f,0f,0f,0f,0f,0f,0f,0.33f};
    public static ArrayList<String> WATER_C_R = new ArrayList<String>(Arrays.asList("H:2", "O:1"));
    public static float[] SODIUM_CHLORIDE_C_P = {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.5f,0f,0f,0f,0f,0f,0.5f,0f};
    public static ArrayList<String> SODIUM_CHLORIDE_C_R = new ArrayList<String>(Arrays.asList("Na:2", "Cl:1"));

    // INORGANIC

}