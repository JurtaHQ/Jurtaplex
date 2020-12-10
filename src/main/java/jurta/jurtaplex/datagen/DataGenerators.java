package jurta.jurtaplex.datagen;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.datagen.client.ModBlockStateProvider;
import jurta.jurtaplex.datagen.client.ModItemModelProvider;
import jurta.jurtaplex.datagen.loot.ModLootTableProvider;
import jurta.jurtaplex.datagen.recipes.ModRecipesProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Jurtaplex.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);

		if (event.includeServer()) {
			gen.addProvider(new ModLootTableProvider(gen));
			gen.addProvider(new ModRecipesProvider(gen));
			gen.addProvider(blockTags);
			gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
		}
        if (event.includeClient()) {
        	gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
    		gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
		}
	}
}
