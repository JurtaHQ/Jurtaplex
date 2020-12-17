package jurta.jurtaplex.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class LollipopItem extends Item {

	public LollipopItem(Item.Properties builder) {
		super(builder);
	}
	
	/**
	* Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
	* the Item before the action is complete.
	*/
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
		return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(Items.STICK);
	}
}
