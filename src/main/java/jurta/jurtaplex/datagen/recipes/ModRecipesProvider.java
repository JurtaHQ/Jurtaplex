package jurta.jurtaplex.datagen.recipes;

import java.util.function.Consumer;

import jurta.jurtaplex.Jurtaplex;
import jurta.jurtaplex.init.ModBlocks;
import jurta.jurtaplex.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;

public class ModRecipesProvider extends RecipeProvider {

	public ModRecipesProvider(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.VANADINITE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.VANADINITE.get())
				.setGroup(Jurtaplex.MOD_ID)
				.addCriterion("has_item", hasItem(ModItems.VANADINITE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.VANADINITE.get(), 9)
				.setGroup(Jurtaplex.MOD_ID)
				.addIngredient(ModBlocks.VANADINITE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.VANADINITE_BLOCK.get()))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.ZOISITE_BLOCK.get())
				.patternLine("xxx")
				.patternLine("xxx")
				.patternLine("xxx")
				.key('x', ModItems.ZOISITE.get())
				.setGroup(Jurtaplex.MOD_ID)
				.addCriterion("has_item", hasItem(ModItems.ZOISITE.get()))
				.build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.ZOISITE.get(), 9)
				.setGroup(Jurtaplex.MOD_ID)
				.addIngredient(ModBlocks.ZOISITE_BLOCK.get())
				.addCriterion("has_item", hasItem(ModBlocks.ZOISITE_BLOCK.get()))
				.build(consumer);
	}
}
