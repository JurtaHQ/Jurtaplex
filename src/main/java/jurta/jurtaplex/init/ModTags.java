package jurta.jurtaplex.init;

import jurta.jurtaplex.Jurtaplex;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
	public static final class Blocks {
		public static final ITag.INamedTag<Block> ORES_FLINT = forge("ores/flint");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_FLINT = forge("storage_blocks/flint");
		public static final ITag.INamedTag<Block> ORES_GARNET = forge("ores/garnet");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_GARNET = forge("storage_blocks/garnet");
		public static final ITag.INamedTag<Block> ORES_AMBER = forge("ores/amber");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_AMBER = forge("storage_blocks/amber");
		public static final ITag.INamedTag<Block> ORES_ARAGONITE = forge("ores/aragonite");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_ARAGONITE = forge("storage_blocks/aragonite");
		public static final ITag.INamedTag<Block> ORES_DIOPSIDE = forge("ores/diopside");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_DIOPSIDE = forge("storage_blocks/diopside");
		public static final ITag.INamedTag<Block> ORES_VANADINITE = forge("ores/vanadinite");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_VANADINITE = forge("storage_blocks/vanadinite");
		public static final ITag.INamedTag<Block> ORES_ZOISITE = forge("ores/zoisite");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_ZOISITE = forge("storage_blocks/zoisite");
		
		private static ITag.INamedTag<Block> forge(String path) {
			return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
		}
		
		private static ITag.INamedTag<Block> mod(String path) {
			return BlockTags.makeWrapperTag(new ResourceLocation(Jurtaplex.MOD_ID, path).toString());
		}
	}
	
	public static final class Items {
		public static final ITag.INamedTag<Item> ORES_FLINT = forge("ores/flint");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_FLINT = forge("storage_blocks/flint");
		public static final ITag.INamedTag<Item> ORES_GARNET = forge("ores/garnet");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_GARNET = forge("storage_blocks/garnet");
		public static final ITag.INamedTag<Item> ORES_AMBER = forge("ores/amber");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_AMBER = forge("storage_blocks/amber");
		public static final ITag.INamedTag<Item> ORES_ARAGONITE = forge("ores/aragonite");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_ARAGONITE = forge("storage_blocks/aragonite");
		public static final ITag.INamedTag<Item> ORES_DIOPSIDE = forge("ores/diopside");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_DIOPSIDE = forge("storage_blocks/diopside");
		public static final ITag.INamedTag<Item> ORES_VANADINITE = forge("ores/vanadinite");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_VANADINITE = forge("storage_blocks/vanadinite");
		public static final ITag.INamedTag<Item> ORES_ZOISITE = forge("ores/zoisite");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_ZOISITE = forge("storage_blocks/zoisite");
		
		public static final ITag.INamedTag<Item> GEMS_GARNET = forge("gems/garnet");
		public static final ITag.INamedTag<Item> GEMS_AMBER = forge("gems/amber");
		public static final ITag.INamedTag<Item> GEMS_ARAGONITE = forge("gems/aragonite");
		public static final ITag.INamedTag<Item> GEMS_DIOPSIDE = forge("gems/diopside");
		public static final ITag.INamedTag<Item> GEMS_VANADINITE = forge("gems/vanadinite");
		public static final ITag.INamedTag<Item> GEMS_ZOISITE = forge("gems/zoisite");
		
		private static ITag.INamedTag<Item> forge(String path) {
			return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
		}
		
		private static ITag.INamedTag<Item> mod(String path) {
			return ItemTags.makeWrapperTag(new ResourceLocation(Jurtaplex.MOD_ID, path).toString());
		}
	}
}
