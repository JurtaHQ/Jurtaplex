package jurta.jurtaplex.datagen;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, Jurtaplex.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		getOrCreateBuilder(ModTags.Blocks.BASE_STONE_ALTERNIS).add(ModBlocks.BASANITE.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_VANADINITE).add(ModBlocks.ALTERNIS_VANADINITE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE).add(ModBlocks.VANADINITE_BLOCK.get());
		
		getOrCreateBuilder(ModTags.Blocks.ORES_ZOISITE).add(ModBlocks.ALTERNIS_ZOISITE_ORE.get());
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE).add(ModBlocks.ZOISITE_BLOCK.get());
		
		getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE).addTag(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE);;
		getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_VANADINITE).addTag(ModTags.Blocks.ORES_ZOISITE);
	}
	
}
