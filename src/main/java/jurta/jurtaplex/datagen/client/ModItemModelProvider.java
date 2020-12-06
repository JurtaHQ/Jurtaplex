package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Jurtaplex.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		withExistingParent("limestone", modLoc("block/limestone"));
		withExistingParent("limestone_slab", modLoc("block/limestone_slab"));
		withExistingParent("limestone_stairs", modLoc("block/limestone_stairs"));
		wallInventory("limestone_wall", modLoc("block/limestone"));
		withExistingParent("limestone_bricks", modLoc("block/limestone_bricks"));
		withExistingParent("limestone_brick_slab", modLoc("block/limestone_brick_slab"));
		withExistingParent("limestone_brick_stairs", modLoc("block/limestone_brick_stairs"));
		wallInventory("limestone_brick_wall", modLoc("block/limestone_bricks"));
		withExistingParent("shale", modLoc("block/shale"));
		withExistingParent("slate", modLoc("block/slate"));
		withExistingParent("basanite", modLoc("block/basanite"));
		withExistingParent("basanite_slab", modLoc("block/basanite_slab"));
		withExistingParent("basanite_stairs", modLoc("block/basanite_stairs"));
		wallInventory("basanite_wall", modLoc("block/basanite"));
		withExistingParent("basanite_bricks", modLoc("block/basanite_bricks"));
		withExistingParent("basanite_brick_slab", modLoc("block/basanite_brick_slab"));
		withExistingParent("basanite_brick_stairs", modLoc("block/basanite_brick_stairs"));
		wallInventory("basanite_brick_wall", modLoc("block/basanite_bricks"));
		withExistingParent("flint_ore", modLoc("block/flint_ore"));
		withExistingParent("flint_block", modLoc("block/flint_block"));
		withExistingParent("garnet_ore", modLoc("block/garnet_ore"));
		withExistingParent("garnet_block", modLoc("block/garnet_block"));
		withExistingParent("amber_ore", modLoc("block/amber_ore"));
		withExistingParent("amber_block", modLoc("block/amber_block"));
		withExistingParent("aragonite_ore", modLoc("block/aragonite_ore"));
		withExistingParent("aragonite_block", modLoc("block/aragonite_block"));
		withExistingParent("end_diopside_ore", modLoc("block/end_diopside_ore"));
		withExistingParent("diopside_block", modLoc("block/diopside_block"));
		withExistingParent("alternis_vanadinite_ore", modLoc("block/alternis_vanadinite_ore"));
		withExistingParent("vanadinite_block", modLoc("block/vanadinite_block"));
		withExistingParent("alternis_zoisite_ore", modLoc("block/alternis_zoisite_ore"));
		withExistingParent("zoisite_block", modLoc("block/zoisite_block"));
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		ModelFile toolGenerated = getExistingFile(mcLoc("item/handheld"));
		
		//Materials
		builder(itemGenerated, "garnet");
		builder(itemGenerated, "amber");
		builder(itemGenerated, "aragonite");
		builder(itemGenerated, "diopside");
		builder(itemGenerated, "vanadinite");
		builder(itemGenerated, "zoisite");
		//Tools
		builder(toolGenerated, "diopside_sword");
		builder(toolGenerated, "diopside_shovel");
		builder(toolGenerated, "diopside_pickaxe");
		builder(toolGenerated, "diopside_axe");
		builder(toolGenerated, "diopside_hoe");
		//Armour
		builder(itemGenerated, "diopside_helmet");
		builder(itemGenerated, "diopside_chestplate");
		builder(itemGenerated, "diopside_leggings");
		builder(itemGenerated, "diopside_boots");
	}
	
	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

}
