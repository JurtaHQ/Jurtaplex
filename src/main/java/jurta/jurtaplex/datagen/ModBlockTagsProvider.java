package jurta.jurtaplex.datagen;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, Jurtaplex.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		getOrCreateBuilder(ModTags.Blocks.ORES_FLINT).add(ModBlocks.FLINT_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_FLINT).add(ModBlocks.FLINT_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_GARNET).add(ModBlocks.GARNET_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_GARNET).add(ModBlocks.GARNET_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_AMBER).add(ModBlocks.AMBER_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_AMBER).add(ModBlocks.AMBER_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_ARAGONITE).add(ModBlocks.ARAGONITE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ARAGONITE).add(ModBlocks.ARAGONITE_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_DIOPSIDE).add(ModBlocks.END_DIOPSIDE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_DIOPSIDE).add(ModBlocks.DIOPSIDE_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_VANADINITE).add(ModBlocks.ALTERNIS_VANADINITE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE).add(ModBlocks.VANADINITE_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_ZOISITE).add(ModBlocks.ALTERNIS_ZOISITE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE).add(ModBlocks.ZOISITE_BLOCK.get());
		
		getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_FLINT).addTag(ModTags.Blocks.STORAGE_BLOCKS_AMBER).addTag(ModTags.Blocks.STORAGE_BLOCKS_ARAGONITE).addTag(ModTags.Blocks.STORAGE_BLOCKS_GARNET).addTag(ModTags.Blocks.STORAGE_BLOCKS_DIOPSIDE).addTag(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE).addTag(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE);
		getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_FLINT).addTag(ModTags.Blocks.ORES_GARNET).addTag(ModTags.Blocks.ORES_AMBER).addTag(ModTags.Blocks.ORES_ARAGONITE).addTag(ModTags.Blocks.ORES_DIOPSIDE).addTag(ModTags.Blocks.ORES_VANADINITE).addTag(ModTags.Blocks.ORES_ZOISITE);
		getOrCreateBuilder(Tags.Blocks.STONE).add(ModBlocks.LIMESTONE.get()).add(ModBlocks.SHALE.get()).add(ModBlocks.SLATE.get());
		getOrCreateBuilder(BlockTags.BASE_STONE_OVERWORLD).add(ModBlocks.LIMESTONE.get()).add(ModBlocks.SHALE.get());
		getOrCreateBuilder(BlockTags.SLABS).add(ModBlocks.LIMESTONE_SLAB.get()).add(ModBlocks.LIMESTONE_BRICK_SLAB.get()).add(ModBlocks.SLATE_SLAB.get()).add(ModBlocks.SLATE_BRICK_SLAB.get()).add(ModBlocks.BASANITE_SLAB.get()).add(ModBlocks.BASANITE_BRICK_SLAB.get());
		getOrCreateBuilder(BlockTags.STAIRS).add(ModBlocks.LIMESTONE_STAIRS.get()).add(ModBlocks.LIMESTONE_BRICK_STAIRS.get()).add(ModBlocks.SLATE_STAIRS.get()).add(ModBlocks.SLATE_BRICK_STAIRS.get()).add(ModBlocks.BASANITE_STAIRS.get()).add(ModBlocks.BASANITE_BRICK_STAIRS.get());
		getOrCreateBuilder(BlockTags.WALLS).add(ModBlocks.LIMESTONE_WALL.get()).add(ModBlocks.LIMESTONE_BRICK_WALL.get()).add(ModBlocks.SLATE_WALL.get()).add(ModBlocks.SLATE_BRICK_WALL.get()).add(ModBlocks.BASANITE_WALL.get()).add(ModBlocks.BASANITE_BRICK_WALL.get());
	}
	
}
