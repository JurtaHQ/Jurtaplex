package jurta.jurtaplex.init;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSoundType extends SoundType {
	public static final SoundType SHALE = new ModSoundType(1.0F, 1.0F, ModSounds.BLOCK_SHALE_BREAK, ModSounds.BLOCK_SHALE_STEP, ModSounds.BLOCK_SHALE_PLACE, ModSounds.BLOCK_SHALE_HIT, ModSounds.BLOCK_SHALE_FALL);
	public final float volume;
	public final float pitch;
	private final RegistryObject<SoundEvent> breakSound;
	private final RegistryObject<SoundEvent> stepSound;
	private final RegistryObject<SoundEvent> placeSound;
	private final RegistryObject<SoundEvent> hitSound;
	private final RegistryObject<SoundEvent> fallSound;
	
	public ModSoundType(float volumeIn, float pitchIn, RegistryObject<SoundEvent> breakSoundIn, RegistryObject<SoundEvent> stepSoundIn,
			RegistryObject<SoundEvent> placeSoundIn, RegistryObject<SoundEvent> hitSoundIn, RegistryObject<SoundEvent> fallSoundIn) {
		super(volumeIn, pitchIn, null, null, null, null, null);
		this.volume = volumeIn;
	    this.pitch = pitchIn;
	    this.breakSound = breakSoundIn;
	    this.stepSound = stepSoundIn;
	    this.placeSound = placeSoundIn;
	    this.hitSound = hitSoundIn;
	    this.fallSound = fallSoundIn;
	}
	
	@Override
	public SoundEvent getBreakSound() {
		return this.breakSound.get();
	}
	
	@Override
	public SoundEvent getFallSound() {
		return this.fallSound.get();
	}
	
	@Override
	public SoundEvent getHitSound() {
		return this.hitSound.get();
	}
	
	@Override
	public SoundEvent getPlaceSound() {
		return this.placeSound.get();
	}
	
	@Override
	public SoundEvent getStepSound() {
		return this.stepSound.get();
	}
}
