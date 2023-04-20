package azuazu3939.resource;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import static azuazu3939.resource.Utils.getMythicId;
import static azuazu3939.resource.Utils.isMythicItem;

public class ItemListener implements Listener {

    @EventHandler
    public void onDrink(@NotNull PlayerItemConsumeEvent event) {

        ItemStack item = event.getItem();
        if (!isMythicItem(item)) return;

        String mmid = getMythicId(item);
        if (mmid == null) return;
        if (mmid.equalsIgnoreCase("unknownopenbox") || mmid.equalsIgnoreCase("Xrandombox") ||
                mmid.equalsIgnoreCase("Yrandombox") || mmid.equalsIgnoreCase("Yunknownopenbox") ||
                mmid.equalsIgnoreCase("Yrandombox_16set") || mmid.equalsIgnoreCase("Xrandombox_16set") ||
                mmid.equalsIgnoreCase("unknownopenbox_16set") || mmid.equalsIgnoreCase("Yunknownopenbox_16set") ||
                mmid.equalsIgnoreCase("afterweaponbox") || mmid.equalsIgnoreCase("afterweaponboxaxe")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteract(@NotNull PlayerInteractEvent event) {

        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {

            if (event.getItem() == null || !event.getItem().hasItemMeta()) return;
            ItemStack item = event.getItem();
            Player player = event.getPlayer();

            if (!isMythicItem(item)) return;

            String mmid = getMythicId(item);
            if (mmid == null) return;
            if (!hasPermission(player)) return;

            if (mmid.equalsIgnoreCase("unknownopenbox")) {
                item.subtract(1);
                unknownopenbox.get(player);

            } else if (mmid.equalsIgnoreCase("Xrandombox")) {
                item.subtract(1);
                Xrandombox.get(player);

            } else if (mmid.equalsIgnoreCase("Yrandombox")) {
                item.subtract(1);
                Yrandombox.get(player);

            } else if (mmid.equalsIgnoreCase("Yunknownopenbox")) {
                item.subtract(1);
                Yunknownopenbox.get(player);;

            } else if (mmid.equalsIgnoreCase("Yrandombox_16set")) {
                item.subtract(1);
                for (int i = 1; i <= 16; i++) {
                    Yrandombox.get16(player);
                }

            } else if (mmid.equalsIgnoreCase("Xrandombox_16set")) {
                item.subtract(1);
                for (int i = 1; i <= 16; i++) {
                    Xrandombox.get16(player);
                }

            } else if (mmid.equalsIgnoreCase("unknownopenbox_16set")) {
                item.subtract(1);
                for (int i = 1; i <= 16; i++) {
                    unknownopenbox.get16(player);
                }

            } else if (mmid.equalsIgnoreCase("Yunknownopenbox_16set")) {
                item.subtract(1);
                for (int i = 1; i <= 16; i++) {
                    Yunknownopenbox.get(player);
                }

            } else if (mmid.equalsIgnoreCase("afterweaponbox")) {
                item.subtract(1);
                afterweaponbox.get(player);

            } else if (mmid.equalsIgnoreCase("afterweaponboxaxe")) {
                item.subtract(1);
                afterweaponboxaxe.get(player);
            }
        }
    }

    public static boolean hasPermission(@NotNull Player player) {

        if (player.hasPermission("Resource.Use")) {
            return true;
        } else {
            player.sendMessage("$cこのアイテムを使う権限がありません。");
            return false;
        }
    }
}
