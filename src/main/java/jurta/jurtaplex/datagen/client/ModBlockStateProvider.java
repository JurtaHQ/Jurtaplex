package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Jurtaplex.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.LIMESTONE.get());
		slabBlock((SlabBlock) ModBlocks.LIMESTONE_SLAB.get(), modLoc("block/limestone"), modLoc("block/limestone"));
		stairsBlock((StairsBlock) ModBlocks.LIMESTONE_STAIRS.get(), modLoc("block/limestone"));
		wallBlock((WallBlock) ModBlocks.LIMESTONE_WALL.get(), modLoc("block/limestone"));
		simpleBlock(ModBlocks.LIMESTONE_BRICKS.get());
		slabBlock((SlabBlock) ModBlocks.LIMESTONE_BRICK_SLAB.get(), modLoc("block/limestone_bricks"), modLoc("block/limestone_bricks"));
		stairsBlock((StairsBlock) ModBlocks.LIMESTONE_BRICK_STAIRS.get(), modLoc("block/limestone_bricks"));
		wallBlock((WallBlock) ModBlocks.LIMESTONE_BRICK_WALL.get(), modLoc("block/limestone_bricks"));
		simpleBlock(ModBlocks.SHALE.get());
		simpleBlock(ModBlocks.SLATE.get());
		simpleBlock(ModBlocks.BASANITE.get());
		slabBlock((SlabBlock) ModBlocks.BASANITE_SLAB.get(), modLoc("block/basanite"), modLoc("block/basanite"));
		stairsBlock((StairsBlock) ModBlocks.BASANITE_STAIRS.get(), modLoc("block/basanite"));
		wallBlock((WallBlock) ModBlocks.BASANITE_WALL.get(), modLoc("block/basanite"));
		simpleBlock(ModBlocks.BASANITE_BRICKS.get());
		slabBlock((SlabBlock) ModBlocks.BASANITE_BRICK_SLAB.get(), modLoc("block/basanite_bricks"), modLoc("block/basanite_bricks"));
		stairsBlock((StairsBlock) ModBlocks.BASANITE_BRICK_STAIRS.get(), modLoc("block/basanite_bricks"));
		wallBlock((WallBlock) ModBlocks.BASANITE_BRICK_WALL.get(), modLoc("block/basanite_bricks"));
		simpleBlock(ModBlocks.FLINT_ORE.get());
		simpleBlock(ModBlocks.FLINT_BLOCK.get());
		simpleBlock(ModBlocks.GARNET_ORE.get());
		simpleBlock(ModBlocks.GARNET_BLOCK.get());
		simpleBlock(ModBlocks.AMBER_ORE.get());
		simpleBlock(ModBlocks.AMBER_BLOCK.get());
		simpleBlock(ModBlocks.ARAGONITE_ORE.get());
		simpleBlock(ModBlocks.ARAGONITE_BLOCK.get());
		simpleBlock(ModBlocks.END_DIOPSIDE_ORE.get());
		simpleBlock(ModBlocks.DIOPSIDE_BLOCK.get());
		simpleBlock(ModBlocks.ALTERNIS_VANADINITE_ORE.get());
		simpleBlock(ModBlocks.VANADINITE_BLOCK.get());
		simpleBlock(ModBlocks.ALTERNIS_ZOISITE_ORE.get());
		simpleBlock(ModBlocks.ZOISITE_BLOCK.get());
	}

}
