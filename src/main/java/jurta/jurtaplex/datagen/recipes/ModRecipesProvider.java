package jurta.jurtaplex.datagen.recipes;

import java.util.function.Consumer;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class ModRecipesProvider extends RecipeProvider {

	public ModRecipesProvider(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.FLINT_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', Items.FLINT)
				.setGroup("flint_block")
				.addCriterion("has_item", hasItem(Items.FLINT))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(Items.FLINT, 9)
				.setGroup("flint")
				.addIngredient(ModBlocks.FLINT_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.FLINT_BLOCK.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "flint");
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.GARNET_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.GARNET.get())
				.setGroup("garnet_block")
				.addCriterion("has_item", hasItem(ModItems.GARNET.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.GARNET.get(), 9)
				.setGroup("garnet")
				.addIngredient(ModBlocks.GARNET_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.GARNET_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.VANADINITE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.VANADINITE.get())
				.setGroup("vanadinite_block")
				.addCriterion("has_item", hasItem(ModItems.VANADINITE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.VANADINITE.get(), 9)
				.setGroup("vanadinite")
				.addIngredient(ModBlocks.VANADINITE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.VANADINITE_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.ZOISITE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.ZOISITE.get())
				.setGroup("zoisite_block")
				.addCriterion("has_item", hasItem(ModItems.ZOISITE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.ZOISITE.get(), 9)
				.setGroup("zoisite")
				.addIngredient(ModBlocks.ZOISITE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.ZOISITE_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.DIOPSIDE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.DIOPSIDE.get())
				.setGroup("diopside_block")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.DIOPSIDE.get(), 9)
				.setGroup("diopside")
				.addIngredient(ModBlocks.DIOPSIDE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.DIOPSIDE_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_SWORD.get())
				.patternLine("x")
				.patternLine("x")
				.patternLine("#")
				.key('x', ModItems.DIOPSIDE.get())
				.key('#', Items.STICK)
				.setGroup("diopside_sword")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_SHOVEL.get())
				.patternLine("x")
				.patternLine("#")
				.patternLine("#")
				.key('x', ModItems.DIOPSIDE.get())
				.key('#', Items.STICK)
				.setGroup("diopside_shovel")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_PICKAXE.get())
				.patternLine("xxx")
				.patternLine(" # ")
				.patternLine(" # ")
				.key('x', ModItems.DIOPSIDE.get())
				.key('#', Items.STICK)
				.setGroup("diopside_pickaxe")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_AXE.get())
				.patternLine("xx")
				.patternLine("x#")
				.patternLine(" #")
				.key('x', ModItems.DIOPSIDE.get())
				.key('#', Items.STICK)
				.setGroup("diopside_axe")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_HOE.get())
				.patternLine("xx")
				.patternLine(" #")
				.patternLine(" #")
				.key('x', ModItems.DIOPSIDE.get())
				.key('#', Items.STICK)
				.setGroup("diopside_hoe")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_HELMET.get())
				.patternLine("xxx")
				.patternLine("x x")
				.key('x', ModItems.DIOPSIDE.get())
				.setGroup("diopside_helmet")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_CHESTPLATE.get())
				.patternLine("x x")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.DIOPSIDE.get())
				.setGroup("diopside_chestplate")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_LEGGINGS.get())
				.patternLine("xxx")
				.patternLine("x x")
				.patternLine("x x")
				.key('x', ModItems.DIOPSIDE.get())
				.setGroup("diopside_leggings")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.DIOPSIDE_BOOTS.get())
				.patternLine("x x")
				.patternLine("x x")
				.key('x', ModItems.DIOPSIDE.get())
				.setGroup("diopside_boots")
				.addCriterion("has_item", hasItem(ModItems.DIOPSIDE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.AMBER_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.AMBER.get())
				.setGroup("amber_block")
				.addCriterion("has_item", hasItem(ModItems.AMBER.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.AMBER.get(), 9)
				.setGroup("amber")
				.addIngredient(ModBlocks.AMBER_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.AMBER_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.ARAGONITE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.ARAGONITE.get())
				.setGroup("aragonite_block")
				.addCriterion("has_item", hasItem(ModItems.ARAGONITE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.ARAGONITE.get(), 9)
				.setGroup("aragonite")
				.addIngredient(ModBlocks.ARAGONITE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.ARAGONITE_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_BRICKS.get(), 4)
				.patternLine("xx")
				.patternLine("xx")
				.key('x', ModBlocks.BASANITE.get())
				.setGroup("basanite_bricks")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_STAIRS.get(), 4)
				.patternLine("x  ")
				.patternLine("xx ")
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE.get())
				.setGroup("basanite_stairs")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_BRICK_STAIRS.get(), 4)
				.patternLine("x  ")
				.patternLine("xx ")
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE_BRICKS.get())
				.setGroup("basanite_brick_stairs")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_SLAB.get(), 6)
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE.get())
				.setGroup("basanite_slab")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_BRICK_SLAB.get(), 6)
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE_BRICKS.get())
				.setGroup("basanite_brick_slab")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_WALL.get(), 6)
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE.get())
				.setGroup("basanite_wall")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.BASANITE_BRICK_WALL.get(), 6)
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModBlocks.BASANITE_BRICKS.get())
				.setGroup("basanite_brick_wall")
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_BRICKS.get(), 4)
				.patternLine("xx")
				.patternLine("xx")
				.key('x', ModBlocks.LIMESTONE.get())
				.setGroup("limestone_bricks")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_SLAB.get(), 6)
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE.get())
				.setGroup("limestone_slab")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_BRICK_SLAB.get(), 6)
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE_BRICKS.get())
				.setGroup("limestone_brick_slab")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE_BRICKS.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_WALL.get(), 6)
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE.get())
				.setGroup("limestone_wall")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_BRICK_WALL.get(), 6)
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE_BRICKS.get())
				.setGroup("limestone_brick_wall")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE_BRICKS.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_STAIRS.get(), 4)
				.patternLine("x  ")
				.patternLine("xx ")
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE.get())
				.setGroup("limestone_stairs")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), 4)
				.patternLine("x  ")
				.patternLine("xx ")
				.patternLine("xxx")
				.key('x', ModBlocks.LIMESTONE_BRICKS.get())
				.setGroup("limestone_brick_stairs")
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE_BRICKS.get()))
				.build(consumer);
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_SLAB.get(), 2)
		 		.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
		 		.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_slab_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_STAIRS.get())
	 			.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
	 			.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_stairs_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_WALL.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_wall_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_BRICKS.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_bricks_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_BRICK_SLAB.get(), 2)
	 			.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
	 			.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_slab_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_BRICK_STAIRS.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_stairs_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE.get()), ModBlocks.BASANITE_BRICK_WALL.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_wall_from_basanite_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE_BRICKS.get()), ModBlocks.BASANITE_BRICK_SLAB.get(), 2)
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_slab_from_basanite_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE_BRICKS.get()), ModBlocks.BASANITE_BRICK_STAIRS.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_stairs_from_basanite_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.BASANITE_BRICKS.get()), ModBlocks.BASANITE_BRICK_WALL.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "basanite_brick_wall_from_basanite_bricks_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_SLAB.get(), 2)
	 			.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
	 			.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_slab_from_limestone_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_STAIRS.get())
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_stairs_from_limestone_stonecutting");
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_WALL.get())
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_wall_from_limestone_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_BRICKS.get())
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_bricks_from_limestone_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 2)
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_slab_from_limestone_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_BRICK_STAIRS.get())
	 			.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
	 			.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_stairs_from_limestone_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_BRICK_WALL.get())
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_wall_from_limestone_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_BRICK_SLAB.get(), 2)
				.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_slab_from_limestone_bricks_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_BRICK_STAIRS.get())
				.addCriterion("has_item", hasItem(ModBlocks.BASANITE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_stairs_from_limestone_bricks_stonecutting");
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_BRICK_WALL.get())
	 			.addCriterion("has_item", hasItem(ModBlocks.LIMESTONE_BRICKS.get()))
				.build(consumer, Jurtaplex.MOD_ID + ":" + "limestone_brick_wall_from_limestone_bricks_stonecutting");
	 	CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.SHALE.get().asItem()), ModBlocks.SLATE.get().asItem(), 0.1F, 200)
	 			.addCriterion("has_item", hasItem(ModBlocks.SHALE.get()))
	 			.build(consumer);
	 	ShapedRecipeBuilder.shapedRecipe(ModBlocks.SLATE_BRICKS.get(), 4)
	 			.patternLine("xx")
	 			.patternLine("xx")
	 			.key('x', ModBlocks.SLATE.get())
	 			.setGroup("slate_bricks")
	 			.addCriterion("has_item", hasItem(ModBlocks.SLATE.get()))
	 			.build(consumer);
	 	SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ModBlocks.SLATE.get()), ModBlocks.SLATE_BRICKS.get())
	 			.addCriterion("has_item", hasItem(ModBlocks.SLATE.get()))
	 			.build(consumer, Jurtaplex.MOD_ID + ":" + "slate_bricks_from_slate_stonecutting");
	}
}
