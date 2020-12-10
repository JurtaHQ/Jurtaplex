package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Items;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Jurtaplex.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		Registration.BLOCKS.getEntries().stream()
        .map(RegistryObject::get)
        .forEach(this::blockItemModel);
		
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
	
	private void blockItemModel(Block block) {
		String name = block.getRegistryName().getPath();
		if (block.asItem() != Items.AIR) {
            withExistingParent(name, modLoc("block/" + name));
        } else if (block == ModBlocks.BASANITE_BRICK_WALL.get()) {
			wallInventory("basanite_brick_wall", modLoc("block/basanite_bricks"));
		} else if (block == ModBlocks.BASANITE_WALL.get()) {
			wallInventory("basanite_wall", modLoc("block/basanite"));
		} else if (block == ModBlocks.LIMESTONE_BRICK_WALL.get()) {
			wallInventory("limestone_brick_wall", modLoc("block/limestone_bricks"));
		} else if (block == ModBlocks.LIMESTONE_WALL.get()) {
			wallInventory("limestone_wall", modLoc("block/limestone"));
		}
	}
	
	private ItemModelBuilder builder(ModelFile model, String name) {
        return getBuilder(name).parent(model).texture("layer0", modLoc("item/" + name));
    }

}
