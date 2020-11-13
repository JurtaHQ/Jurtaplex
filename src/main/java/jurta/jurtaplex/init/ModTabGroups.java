package jurta.jurtaplex.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import jurta.jurtaplex.Jurtaplex;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTabGroups {
	public static final ItemGroup JURTAPLEX = new ModTabGroup(Jurtaplex.MOD_ID, () ->
			new ItemStack(ModBlocks.BASANITE.get()));

    public static final class ModTabGroup extends ItemGroup {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
