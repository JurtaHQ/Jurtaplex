package jurta.jurtaplex.block;

import java.util.Random;

import jurta.jurtaplex.init.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

public class ModOreBlock extends OreBlock {

	public ModOreBlock(AbstractBlock.Properties properties) {
		super(properties);
	}
	
	protected int getExperience(Random rand) {
		if (this == ModBlocks.FLINT_ORE.get()) {
			return MathHelper.nextInt(rand, 0, 1);
		} else if (this == ModBlocks.GARNET_ORE.get()) {
			return MathHelper.nextInt(rand, 0, 1);
		} else if (this == ModBlocks.AMBER_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else if (this == ModBlocks.ARAGONITE_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
	    } else if (this == ModBlocks.END_DIOPSIDE_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else if (this == ModBlocks.ALTERNIS_VANADINITE_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else {
			return this == ModBlocks.ALTERNIS_ZOISITE_ORE.get() ? MathHelper.nextInt(rand, 3, 7) : 0;
		}
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? this.getExperience(RANDOM) : 0;
	}
}
