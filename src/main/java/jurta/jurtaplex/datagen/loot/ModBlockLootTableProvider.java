package jurta.jurtaplex.datagen.loot;

import java.util.stream.Collectors;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Items;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTableProvider extends BlockLootTables {
	@Override
    protected void addTables() {
		registerDropSelfLootTable(ModBlocks.LIMESTONE.get());
		registerLootTable(ModBlocks.LIMESTONE_SLAB.get(), (limestone_slab) -> {
			return droppingSlab(ModBlocks.LIMESTONE_SLAB.get());
		});
		registerDropSelfLootTable(ModBlocks.LIMESTONE_STAIRS.get());
		registerDropSelfLootTable(ModBlocks.LIMESTONE_WALL.get());
		registerDropSelfLootTable(ModBlocks.LIMESTONE_BRICKS.get());
		registerLootTable(ModBlocks.LIMESTONE_BRICK_SLAB.get(), (limestone_brick_slab) -> {
			return droppingSlab(ModBlocks.LIMESTONE_BRICK_SLAB.get());
		});
		registerDropSelfLootTable(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
		registerDropSelfLootTable(ModBlocks.LIMESTONE_BRICK_WALL.get());
		registerDropSelfLootTable(ModBlocks.SHALE.get());
		registerDropSelfLootTable(ModBlocks.SLATE.get());
		registerDropSelfLootTable(ModBlocks.BASANITE.get());
		registerLootTable(ModBlocks.BASANITE_SLAB.get(), (basanite_slab) -> {
			return droppingSlab(ModBlocks.BASANITE_SLAB.get());
		});
		registerDropSelfLootTable(ModBlocks.BASANITE_STAIRS.get());
		registerDropSelfLootTable(ModBlocks.BASANITE_WALL.get());
		registerDropSelfLootTable(ModBlocks.BASANITE_BRICKS.get());
		registerLootTable(ModBlocks.BASANITE_BRICK_SLAB.get(), (basanite_brick_slab) -> {
			return droppingSlab(ModBlocks.BASANITE_BRICK_SLAB.get());
		});
		registerDropSelfLootTable(ModBlocks.BASANITE_BRICK_STAIRS.get());
		registerDropSelfLootTable(ModBlocks.BASANITE_BRICK_WALL.get());
		registerDropSelfLootTable(ModBlocks.FLINT_BLOCK.get());
		registerLootTable(ModBlocks.FLINT_ORE.get(), (flint) -> {
			return droppingItemWithFortune(flint, Items.FLINT);
		});
		registerDropSelfLootTable(ModBlocks.GARNET_BLOCK.get());
		registerLootTable(ModBlocks.GARNET_ORE.get(), (garnet) -> {
			return droppingItemWithFortune(garnet, ModItems.GARNET.get());
		});
		registerDropSelfLootTable(ModBlocks.AMBER_BLOCK.get());
		registerLootTable(ModBlocks.AMBER_ORE.get(), (amber) -> {
			return droppingItemWithFortune(amber, ModItems.AMBER.get());
		});
		registerDropSelfLootTable(ModBlocks.ARAGONITE_BLOCK.get());
		registerLootTable(ModBlocks.ARAGONITE_ORE.get(), (aragonite) -> {
			return droppingItemWithFortune(aragonite, ModItems.ARAGONITE.get());
		});
		registerDropSelfLootTable(ModBlocks.DIOPSIDE_BLOCK.get());
		registerLootTable(ModBlocks.END_DIOPSIDE_ORE.get(), (diopside) -> {
			return droppingItemWithFortune(diopside, ModItems.DIOPSIDE.get());
		});
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
