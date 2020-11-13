package jurta.jurtaplex.datagen;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModItems;
import jurta.jurtaplex.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, Jurtaplex.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		copy(ModTags.Blocks.ORES_VANADINITE, ModTags.Items.ORES_VANADINITE);
		copy(ModTags.Blocks.ORES_ZOISITE, ModTags.Items.ORES_ZOISITE);
		
		copy(ModTags.Blocks.STORAGE_BLOCKS_VANADINITE, ModTags.Items.STORAGE_BLOCKS_VANADINITE);
		copy(ModTags.Blocks.STORAGE_BLOCKS_ZOISITE, ModTags.Items.STORAGE_BLOCKS_ZOISITE);
		
		copy(Tags.Blocks.ORES, Tags.Items.ORES);
		copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
		
		getOrCreateBuilder(ModTags.Items.GEMS_VANADINITE).add(ModItems.VANADINITE.get());
		getOrCreateBuilder(ModTags.Items.GEMS_ZOISITE).add(ModItems.ZOISITE.get());
		
		getOrCreateBuilder(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_VANADINITE).addTag(ModTags.Items.GEMS_ZOISITE);
	}
}
