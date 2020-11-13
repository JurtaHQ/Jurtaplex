package jurta.jurtaplex.init;

import java.util.function.Supplier;

import jurta.jurtaplex.block.ModOreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	public static final RegistryObject<Block> BASANITE = register("basanite", () ->
			new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ALTERNIS_VANADINITE_ORE = register("alternis_vanadinite_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> VANADINITE_BLOCK = register("vanadinite_block", () ->
			new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> ALTERNIS_ZOISITE_ORE = register("alternis_zoisite_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ZOISITE_BLOCK = register("zoisite_block", () ->
			new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	
	static void register() {}
	
	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return Registration.BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		RegistryObject<T> ret = registerNoItem(name, block);
		Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ModTabGroups.JURTAPLEX)));
		return ret;
	}
}
