package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Jurtaplex.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.BASANITE.get());
		simpleBlock(ModBlocks.ALTERNIS_VANADINITE_ORE.get());
		simpleBlock(ModBlocks.VANADINITE_BLOCK.get());
		simpleBlock(ModBlocks.ALTERNIS_ZOISITE_ORE.get());
		simpleBlock(ModBlocks.ZOISITE_BLOCK.get());
	}

}
