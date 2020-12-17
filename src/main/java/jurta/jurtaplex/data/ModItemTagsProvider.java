package jurta.jurtaplex.data;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModItems;
import jurta.jurtaplex.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, Jurtaplex.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		copy(ModTags.Blocks.ORES_FLINT, ModTags.Items.ORES_FLINT);
		copy(ModTags.Blocks.ORES_GARNET, ModTags.Items.ORES_GARNET);
		copy(ModTags.Blocks.ORES_AMBER, ModTags.Items.ORES_AMBER);
		copy(ModTags.Blocks.ORES_ARAGONITE, ModTags.Items.ORES_ARAGONITE);
		copy(ModTags.Blocks.ORES_DIOPSIDE, ModTags.Items.ORES_DIOPSIDE);
		copy(ModTags.Blocks.ORES_VANADINITE, ModTags.Items.ORES_VANADINITE);
		copy(ModTags.Blocks.ORES_ZOISITE, ModTags.Items.ORES_ZOISITE);
		
		copy(ModTags.Blocks.STORAGE_BLOCKS_FLINT, ModTags.Items.STORAGE_BLOCKS_FLINT);
		copy(ModTags.Blocks.STORAGE_BLOCKS_GARNET, ModTags.Items.STORAGE_BLOCKS_GARNET);
		copy(ModTags.Blocks.STORAGE_BLOCKS_AMBER, ModTags.Items.STORAGE_BLOCKS_AMBER);
		copy(ModTags.Blocks.STORAGE_BLOCKS_ARAGONITE, ModTags.Items.STORAGE_BLOCKS_ARAGONITE);
		copy(ModTags.Blocks.STORAGE_BLOCKS_DIOPSIDE, ModTags.Items.STORAGE_BLOCKS_DIOPSIDE);
		copy(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE, ModTags.Items.STORAGE_BLOCKS_VANADINITE);
		copy(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE, ModTags.Items.STORAGE_BLOCKS_ZOISITE);
		
		copy(Tags.Blocks.ORES, Tags.Items.ORES);
		copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
		copy(Tags.Blocks.STONE, Tags.Items.STONE);
		
		getOrCreateBuilder(ModTags.Items.GEMS_GARNET).add(ModItems.GARNET.get());
		getOrCreateBuilder(ModTags.Items.GEMS_AMBER).add(ModItems.AMBER.get());
		getOrCreateBuilder(ModTags.Items.GEMS_ARAGONITE).add(ModItems.ARAGONITE.get());
		getOrCreateBuilder(ModTags.Items.GEMS_DIOPSIDE).add(ModItems.DIOPSIDE.get());
		getOrCreateBuilder(ModTags.Items.GEMS_VANADINITE).add(ModItems.VANADINITE.get());
		getOrCreateBuilder(ModTags.Items.GEMS_ZOISITE).add(ModItems.ZOISITE.get());
		
		getOrCreateBuilder(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_GARNET).addTag(ModTags.Items.GEMS_AMBER).addTag(ModTags.Items.GEMS_ARAGONITE).addTag(ModTags.Items.GEMS_DIOPSIDE).addTag(ModTags.Items.GEMS_VANADINITE).addTag(ModTags.Items.GEMS_ZOISITE);
		getOrCreateBuilder(ItemTags.SLABS).add(ModBlocks.LIMESTONE_SLAB.get().asItem()).add(ModBlocks.LIMESTONE_BRICK_SLAB.get().asItem()).add(ModBlocks.SLATE_SLAB.get().asItem()).add(ModBlocks.SLATE_BRICK_SLAB.get().asItem()).add(ModBlocks.BASANITE_SLAB.get().asItem()).add(ModBlocks.BASANITE_BRICK_SLAB.get().asItem());
		getOrCreateBuilder(ItemTags.STAIRS).add(ModBlocks.LIMESTONE_STAIRS.get().asItem()).add(ModBlocks.LIMESTONE_BRICK_STAIRS.get().asItem()).add(ModBlocks.SLATE_STAIRS.get().asItem()).add(ModBlocks.SLATE_BRICK_STAIRS.get().asItem()).add(ModBlocks.BASANITE_STAIRS.get().asItem()).add(ModBlocks.BASANITE_BRICK_STAIRS.get().asItem());
		getOrCreateBuilder(ItemTags.WALLS).add(ModBlocks.LIMESTONE_WALL.get().asItem()).add(ModBlocks.LIMESTONE_BRICK_WALL.get().asItem()).add(ModBlocks.SLATE_WALL.get().asItem()).add(ModBlocks.SLATE_BRICK_WALL.get().asItem()).add(ModBlocks.BASANITE_WALL.get().asItem()).add(ModBlocks.BASANITE_BRICK_WALL.get().asItem());
	}
}
