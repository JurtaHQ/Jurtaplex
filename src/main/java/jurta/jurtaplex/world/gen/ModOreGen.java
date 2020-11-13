package jurta.jurtaplex.world.gen;

import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.world.gen.feature.ModOreFeatureConfig;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGen {
    protected static ConfiguredFeature<?, ?> ORE_VANADINITE;

    public static boolean checkAndInitBiome(BiomeLoadingEvent event) {
        if (event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND)
        {
            initAlternisFeatures();
            return true;
        }
        return false;
    }
    
    protected static void initAlternisFeatures() {
        if (ORE_VANADINITE == null) {
            ORE_VANADINITE = Feature.ORE.withConfiguration(
                    new OreFeatureConfig(ModOreFeatureConfig.FillerBlockType.BASE_STONE_ALTERNIS, 
                            ModBlocks.ALTERNIS_VANADINITE_ORE.get().getDefaultState(), 20)).range(256).square().func_242731_b(20);
        }
    }
    
    public static void generateAlternisOres(BiomeLoadingEvent event) {
        event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, ModOreGen.ORE_VANADINITE);
    }

}