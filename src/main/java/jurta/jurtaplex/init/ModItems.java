package jurta.jurtaplex.init;

import jurta.jurtaplex.item.ModArmorMaterial;
import jurta.jurtaplex.item.ModToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	//Materials
	public static final RegistryObject<Item> GARNET = Registration.ITEMS.register("garnet", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> AMBER = Registration.ITEMS.register("amber", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> ARAGONITE = Registration.ITEMS.register("aragonite", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE = Registration.ITEMS.register("diopside", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> VANADINITE = Registration.ITEMS.register("vanadinite", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> ZOISITE = Registration.ITEMS.register("zoisite", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	//Tools
	public static final RegistryObject<Item> DIOPSIDE_SWORD = Registration.ITEMS.register("diopside_sword", () ->
			new SwordItem(ModToolMaterial.DIOPSIDE, 3, -2.4f, new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_SHOVEL = Registration.ITEMS.register("diopside_shovel", () ->
			new ShovelItem(ModToolMaterial.DIOPSIDE, 1.5F, -3.0F, new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_PICKAXE = Registration.ITEMS.register("diopside_pickaxe", () ->
			new PickaxeItem(ModToolMaterial.DIOPSIDE, 1, -2.8F, new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_AXE = Registration.ITEMS.register("diopside_axe", () ->
			new AxeItem(ModToolMaterial.DIOPSIDE, 5.0F, -3.0F, new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_HOE = Registration.ITEMS.register("diopside_hoe", () ->
			new HoeItem(ModToolMaterial.DIOPSIDE, -4, 0.0F, new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	//Armour
	public static final RegistryObject<Item> DIOPSIDE_HELMET = Registration.ITEMS.register("diopside_helmet", () -> 
			new ArmorItem(ModArmorMaterial.DIOPSIDE, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_CHESTPLATE = Registration.ITEMS.register("diopside_chestplate", () -> 
			new ArmorItem(ModArmorMaterial.DIOPSIDE, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_LEGGINGS = Registration.ITEMS.register("diopside_leggings", () -> 
			new ArmorItem(ModArmorMaterial.DIOPSIDE, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> DIOPSIDE_BOOTS = Registration.ITEMS.register("diopside_boots", () -> 
			new ArmorItem(ModArmorMaterial.DIOPSIDE, EquipmentSlotType.FEET, (new Item.Properties()).group(ModTabGroups.JURTAPLEX)));
	
	static void register() {}
}
