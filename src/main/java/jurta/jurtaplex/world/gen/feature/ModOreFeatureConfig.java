package jurta.jurtaplex.world.gen.feature;

import jurta.jurtaplex.init.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

public class ModOreFeatureConfig extends OreFeatureConfig {

	public ModOreFeatureConfig(RuleTest p_i241989_1_, BlockState state, int size) {
		super(p_i241989_1_, state, size);
	}
	
	public static final class FillerBlockType {
	      public static final RuleTest BASE_STONE_ALTERNIS = new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_ALTERNIS);
	}
}
