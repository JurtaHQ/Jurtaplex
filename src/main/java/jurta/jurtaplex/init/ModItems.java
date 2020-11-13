package jurta.jurtaplex.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	public static final RegistryObject<Item> VANADINITE = Registration.ITEMS.register("vanadinite", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	public static final RegistryObject<Item> ZOISITE = Registration.ITEMS.register("zoisite", () ->
			new Item(new Item.Properties().group(ModTabGroups.JURTAPLEX)));
	
	static void register() {}
}
