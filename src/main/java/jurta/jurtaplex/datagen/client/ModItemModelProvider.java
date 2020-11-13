package jurta.jurtaplex.datagen.client;

import jurta.jurtaplex.Jurtaplex;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Jurtaplex.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		withExistingParent("basanite", modLoc("block/basanite"));
		withExistingParent("alternis_vanadinite_ore", modLoc("block/alternis_vanadinite_ore"));
		withExistingParent("vanadinite_block", modLoc("block/vanadinite_block"));
		withExistingParent("alternis_zoisite_ore", modLoc("block/alternis_zoisite_ore"));
		withExistingParent("zoisite_block", modLoc("block/zoisite_block"));
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		builder(itemGenerated, "vanadinite");
		builder(itemGenerated, "zoisite");
	}
	
	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

}
