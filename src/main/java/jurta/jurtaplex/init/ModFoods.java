package jurta.jurtaplex.init;

import net.minecraft.item.Food;

public class ModFoods {
	public static final Food CANDY_APPLE = new Food.Builder().hunger(5).saturation(2.6F).build();
	public static final Food CARAMEL = new Food.Builder().hunger(1).saturation(0.2F).fastToEat().build();
	public static final Food COOKED_FLESH = new Food.Builder().hunger(5).saturation(1.0F).meat().build();
}
