package jurta.jurtaplex.init;

import jurta.jurtaplex.Jurtaplex;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSounds {
	public static final RegistryObject<SoundEvent> BLOCK_SHALE_BREAK = Registration.SOUNDS.register("block.shale.break", () ->
			new SoundEvent(new ResourceLocation(Jurtaplex.MOD_ID, "block.shale.break")));
	public static final RegistryObject<SoundEvent> BLOCK_SHALE_FALL = Registration.SOUNDS.register("block.shale.fall", () ->
			new SoundEvent(new ResourceLocation(Jurtaplex.MOD_ID, "block.shale.fall")));
	public static final RegistryObject<SoundEvent> BLOCK_SHALE_HIT = Registration.SOUNDS.register("block.shale.hit", () ->
			new SoundEvent(new ResourceLocation(Jurtaplex.MOD_ID, "block.shale.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_SHALE_PLACE = Registration.SOUNDS.register("block.shale.place", () ->
			new SoundEvent(new ResourceLocation(Jurtaplex.MOD_ID, "block.shale.place")));
	public static final RegistryObject<SoundEvent> BLOCK_SHALE_STEP = Registration.SOUNDS.register("block.shale.step", () ->
			new SoundEvent(new ResourceLocation(Jurtaplex.MOD_ID, "block.shale.step")));
	
	static void register() {}
}
