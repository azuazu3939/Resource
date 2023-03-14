package azuazu3939.resource;

import io.lumine.xikage.mythicmobs.MythicMobs;
import io.lumine.xikage.mythicmobs.util.jnbt.CompoundTag;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class Utils {

    public boolean isMythicItem(ItemStack item) {

        if (item == null) return false;
        CompoundTag tag = MythicMobs.inst().getVolatileCodeHandler().getItemHandler().getNBTData(item);

        return tag != null && tag.containsKey("MYTHIC_TYPE");
    }

    @Nullable
    public ItemStack getMythicItem(String string) {

        if (MythicMobs.inst().getItemManager().getItem(string).isPresent()) {

            return MythicMobs.inst().getItemManager().getItemStack(string);
        }
        return null;
    }

    @Nullable
    public String getMythicId(ItemStack item) {

        if (item == null) return null;
        CompoundTag tag = MythicMobs.inst().getVolatileCodeHandler().getItemHandler().getNBTData(item);

        if (tag != null && tag.containsKey("MYTHIC_TYPE")) {

            return tag.getString("MYTHIC_TYPE");
        }
        return null;
    }
}
