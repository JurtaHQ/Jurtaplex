package jurta.jurtaplex.datagen.loot;

import java.util.stream.Collectors;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTableProvider extends BlockLootTables {
	@Override
    protected void addTables() {
		registerDropSelfLootTable(ModBlocks.BASANITE.get());
		registerDropSelfLootTable(ModBlocks.VANADINITE_BLOCK.get());
		registerLootTable(ModBlocks.ALTERNIS_VANADINITE_ORE.get(), (vanadinite) -> {
			return droppingItemWithFortune(vanadinite, ModItems.VANADINITE.get());
		});
		registerDropSelfLootTable(ModBlocks.ZOISITE_BLOCK.get());
		registerLootTable(ModBlocks.ALTERNIS_ZOISITE_ORE.get(), (zoisite) -> {
			return droppingItemWithFortune(zoisite, ModItems.ZOISITE.get());
		});
	}
	
	@Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> Jurtaplex.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
}
