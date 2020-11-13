package jurta.jurtaplex;

import jurta.jurtaplex.init.Registration;
import net.minecraftforge.fml.common.Mod;

@Mod(Jurtaplex.MOD_ID)
public class Jurtaplex {
	public static final String MOD_ID = "jurtaplex";

	public Jurtaplex() {
		Registration.register();
	}
}
