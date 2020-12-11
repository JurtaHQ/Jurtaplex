package jurta.jurtaplex.init;

import java.util.function.Supplier;

import jurta.jurtaplex.block.ModOreBlock;
import jurta.jurtaplex.block.material.ModMaterial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	//Rocks
	public static final RegistryObject<Block> LIMESTONE = register("limestone", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.LIMESTONE).hardnessAndResistance(1.5f, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> SHALE = register("shale", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.SHALE).hardnessAndResistance(1.5f, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(ModSoundType.SHALE).setRequiresTool()));
	public static final RegistryObject<Block> SLATE = register("slate", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.SHALE).hardnessAndResistance(2, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(ModSoundType.SHALE).setRequiresTool()));
	public static final RegistryObject<Block> BASANITE = register("basanite", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.BASANITE).hardnessAndResistance(1.5f, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE).setRequiresTool()));
	//Ore Blocks
	public static final RegistryObject<Block> FLINT_ORE = register("flint_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(1, 0.5f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> GARNET_ORE = register("garnet_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(Material.SAND).hardnessAndResistance(1, 0.5f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SAND)));
	public static final RegistryObject<Block> AMBER_ORE = register("amber_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ARAGONITE_ORE = register("aragonite_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(ModMaterial.LIMESTONE).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> END_DIOPSIDE_ORE = register("end_diopside_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(ModMaterial.END_STONE).hardnessAndResistance(3, 9).harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ALTERNIS_VANADINITE_ORE = register("alternis_vanadinite_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(ModMaterial.BASANITE).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ALTERNIS_ZOISITE_ORE = register("alternis_zoisite_ore", () ->
			new ModOreBlock(AbstractBlock.Properties.create(ModMaterial.BASANITE).hardnessAndResistance(3, 3).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	//Storage Blocks
	public static final RegistryObject<Block> FLINT_BLOCK = register("flint_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.BASANITE).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> GARNET_BLOCK = register("garnet_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.GARNET).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> AMBER_BLOCK = register("amber_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.BASANITE).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> ARAGONITE_BLOCK = register("aragonite_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.GARNET).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> DIOPSIDE_BLOCK = register("diopside_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.DIOPSIDE).hardnessAndResistance(5, 18).harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> VANADINITE_BLOCK = register("vanadinite_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.VANADINITE).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> ZOISITE_BLOCK = register("zoisite_block", () ->
			new Block(AbstractBlock.Properties.create(ModMaterial.ZOISITE).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL).setRequiresTool()));
	//Bricks
	public static final RegistryObject<Block> LIMESTONE_BRICKS = register("limestone_bricks", () ->
			new Block(AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> BASANITE_BRICKS = register("basanite_bricks", () ->
			new Block(AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> SLATE_BRICKS = register("slate_bricks", () ->
			new Block(AbstractBlock.Properties.from(SLATE.get())));
	//Slabs
	public static final RegistryObject<Block> LIMESTONE_SLAB = register("limestone_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = register("limestone_brick_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> BASANITE_SLAB = register("basanite_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> BASANITE_BRICK_SLAB = register("basanite_brick_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> SLATE_SLAB = register("slate_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(SLATE.get())));
	public static final RegistryObject<Block> SLATE_BRICK_SLAB = register("slate_brick_slab", () ->
			new SlabBlock(AbstractBlock.Properties.from(SLATE.get())));
	//Stairs
	public static final RegistryObject<Block> LIMESTONE_STAIRS = register("limestone_stairs", () ->
			new StairsBlock(() -> LIMESTONE.get().getDefaultState(), AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = register("limestone_brick_stairs", () ->
			new StairsBlock(() -> LIMESTONE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> BASANITE_STAIRS = register("basanite_stairs", () ->
			new StairsBlock(() -> BASANITE.get().getDefaultState(), AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> BASANITE_BRICK_STAIRS = register("basanite_brick_stairs", () ->
			new StairsBlock(() -> BASANITE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> SLATE_STAIRS = register("slate_stairs", () ->
			new StairsBlock(() -> SLATE.get().getDefaultState(), AbstractBlock.Properties.from(SLATE.get())));
	public static final RegistryObject<Block> SLATE_BRICK_STAIRS = register("slate_brick_stairs", () ->
			new StairsBlock(() -> SLATE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(SLATE.get())));
	//Walls
	public static final RegistryObject<Block> LIMESTONE_WALL = register("limestone_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = register("limestone_brick_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(LIMESTONE.get())));
	public static final RegistryObject<Block> BASANITE_WALL = register("basanite_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> BASANITE_BRICK_WALL = register("basanite_brick_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(BASANITE.get())));
	public static final RegistryObject<Block> SLATE_WALL = register("slate_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(SLATE.get())));
	public static final RegistryObject<Block> SLATE_BRICK_WALL = register("slate_brick_wall", () ->
			new WallBlock(AbstractBlock.Properties.from(SLATE.get())));
	//Debug Blocks
	public static final RegistryObject<Block> PLACEHOLDER = registerNoItem("placeholder", () ->
			new Block(AbstractBlock.Properties.from(Blocks.WHITE_WOOL)));
	
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
