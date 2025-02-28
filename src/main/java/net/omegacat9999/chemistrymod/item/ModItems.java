package net.omegacat9999.chemistrymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omegacat9999.chemistrymod.OmegasChemistryMod;
import net.omegacat9999.chemistrymod.item.custom.compounds.CompoundItem;
import net.omegacat9999.chemistrymod.item.custom.compounds.CompoundItemArrayData;
import net.omegacat9999.chemistrymod.item.custom.compounds.InorganicCompoundItem;
import net.omegacat9999.chemistrymod.item.custom.compounds.OrganicCompoundItem;
import net.omegacat9999.chemistrymod.item.custom.element_element.Element_ElementItem;

public class ModItems {
    // Element_ELEMENT Items
    public static final Item CARBON_ELEMENT = registerItem("carbon_element", new Element_ElementItem(new Item.Settings()));
    public static final Item HYDROGEN_ELEMENT = registerItem("hydrogen_element", new Element_ElementItem(new Item.Settings()));
    public static final Item OXYGEN_ELEMENT = registerItem("oxygen_element", new Element_ElementItem(new Item.Settings()));
    public static final Item SODIUM_ELEMENT = registerItem("sodium_element", new Element_ElementItem(new Item.Settings()));
    public static final Item CHLORINE_ELEMENT = registerItem("chlorine_element", new Element_ElementItem(new Item.Settings()));
    // Element Items
    public static final Item CARBON = registerItem("carbon", new Item(new Item.Settings()));
    public static final Item HYDROGEN = registerItem("hydrogen", new Item(new Item.Settings()));
    // Compound Items
    // Organic
    public static final Item METHANE = registerItem("compound_methane",new OrganicCompoundItem(
            new Item.Settings(),  "alkane", "l",1, -162, -186, 0.657f,
            CompoundItemArrayData.METHANE_C_P, CompoundItemArrayData.METHANE_C_R));
    public static final Item ETHANE = registerItem("compound_ethane", new OrganicCompoundItem(
            new Item.Settings(),  "alkane", "l",2, -89, -183, 1.3562f,
            CompoundItemArrayData.ETHANE_C_P, CompoundItemArrayData.ETHANE_C_R));
    public static final Item WATER = registerItem("compound_water", new OrganicCompoundItem(
            new Item.Settings(),  "water", "l", -1, 100, 0, 1,
            CompoundItemArrayData.WATER_C_P, CompoundItemArrayData.WATER_C_R));
    // Inorganic
    public static final Item SODIUM_CHLORIDE = registerItem("compound_sodium_chloride", new InorganicCompoundItem(new Item.Settings(), CompoundItemArrayData.SODIUM_CHLORIDE_C_P, CompoundItemArrayData.SODIUM_CHLORIDE_C_R));
    // Add Item(s) to Vanilla Item Group (unused, may remove.)
    /*
    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }
    */

    // Register Item(s)
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OmegasChemistryMod.MOD_ID, name), item);
    }

    // Register All Mod Items
    public static void registerModItems() {
        // Log Item Register Indicator (Debugging)
        net.omegacat9999.chemistrymod.OmegasChemistryMod.LOGGER
                .info("Registering Mod Items for: " + net.omegacat9999.chemistrymod.OmegasChemistryMod.MOD_ID);

        // Call registerItem Method for INGREDIENTS Vanilla Item Group (directly)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
            entries.add(CARBON_ELEMENT);
            entries.add(HYDROGEN_ELEMENT);
        });
    }
}
