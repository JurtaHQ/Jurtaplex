package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.IItemProvider;
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
		withExistingParent("limestone_bricks", modLoc("block/limestone_bricks"));
		withExistingParent("limestone_brick_slab", modLoc("block/limestone_brick_slab"));
		withExistingParent("limestone_brick_stairs", modLoc("block/limestone_brick_stairs"));
		withExistingParent("shale", modLoc("block/shale"));
		withExistingParent("slate", modLoc("block/slate"));
		withExistingParent("slate_slab", modLoc("block/slate_slab"));
		withExistingParent("slate_stairs", modLoc("block/slate_stairs"));
		withExistingParent("slate_bricks", modLoc("block/slate_bricks"));
		withExistingParent("slate_brick_slab", modLoc("block/slate_brick_slab"));
		withExistingParent("slate_brick_stairs", modLoc("block/slate_brick_stairs"));
		withExistingParent("basanite", modLoc("block/basanite"));
		withExistingParent("basanite_slab", modLoc("block/basanite_slab"));
		withExistingParent("basanite_stairs", modLoc("block/basanite_stairs"));
		withExistingParent("basanite_bricks", modLoc("block/basanite_bricks"));
		withExistingParent("basanite_brick_slab", modLoc("block/basanite_brick_slab"));
		withExistingParent("basanite_brick_stairs", modLoc("block/basanite_brick_stairs"));
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
		
		withExistingParent("placeholder", modLoc("block/placeholder"));
		
		//Walls
		blockWithInventoryModel(ModBlocks.BASANITE_BRICK_WALL.get());
		blockWithInventoryModel(ModBlocks.BASANITE_WALL.get());
		blockWithInventoryModel(ModBlocks.LIMESTONE_BRICK_WALL.get());
		blockWithInventoryModel(ModBlocks.LIMESTONE_WALL.get());
		blockWithInventoryModel(ModBlocks.SLATE_BRICK_WALL.get());
		blockWithInventoryModel(ModBlocks.SLATE_WALL.get());
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		ModelFile toolGenerated = getExistingFile(mcLoc("item/handheld"));
		
		//Food
		builder(itemGenerated, "cooked_flesh");
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
	
	private String name(IItemProvider item) {
        return item.asItem().getRegistryName().getPath();
    }
	
	private ItemModelBuilder blockWithInventoryModel(Block block) {
        return withExistingParent(name(block), modLoc("block/" + name(block) + "_inventory"));
    }
	
	private ItemModelBuilder builder(ModelFile model, String name) {
        return getBuilder(name).parent(model).texture("layer0", modLoc("item/" + name));
    }

}
