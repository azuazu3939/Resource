package azuazu3939.resource;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemListener implements Listener {

    @EventHandler
    public void onDrink(@NotNull PlayerItemConsumeEvent event) {

        ItemStack item = event.getItem();
        if (!new Utils().isMythicItem(item)) return;

        String mmid = new Utils().getMythicId(item);
        if (mmid == null) return;
        if (mmid.equalsIgnoreCase("unknownopenbox") || mmid.equalsIgnoreCase("Xrandombox") ||
                mmid.equalsIgnoreCase("Yrandombox") || mmid.equalsIgnoreCase("Yunknownopenbox") ||
                mmid.equalsIgnoreCase("Yrandombox_16set") || mmid.equalsIgnoreCase("Xrandombox_16set") ||
                mmid.equalsIgnoreCase("unknownopenbox_16set") || mmid.equalsIgnoreCase("Yunknownopenbox_16set") ||
                mmid.equalsIgnoreCase("afterweaponbox") || mmid.equalsIgnoreCase("afterweaponboxaxe")) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onInteract(@NotNull PlayerInteractEvent event) {

        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {

            if (event.getItem() == null || !event.getItem().hasItemMeta()) return;
            ItemStack item = event.getItem();
            Player player = event.getPlayer();

            if (!new Utils().isMythicItem(item)) return;

            String mmid = new Utils().getMythicId(item);
            if (mmid == null) return;
            if (mmid.equalsIgnoreCase("unknownopenbox") && hasPermission(player)) {
                new unknownopenbox().get(player);
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Xrandombox") && hasPermission(player)) {
                new Xrandombox().get(player);
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Yrandombox") && hasPermission(player)) {
                new Yrandombox().get(player);
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Yunknownopenbox") && hasPermission(player)) {
                new Yunknownopenbox().get(player);
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Yrandombox_16set") && hasPermission(player)) {
                for (int i = 1; i <= 16; i++) {
                    new Yrandombox().get(player);
                }
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Xrandombox_16set") && hasPermission(player)) {
                for (int i = 1; i <= 16; i++) {
                    new Xrandombox().get(player);
                }
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("unknownopenbox_16set") && hasPermission(player)) {
                for (int i = 1; i <= 16; i++) {
                    new unknownopenbox().get(player);
                }
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("Yunknownopenbox_16set") && hasPermission(player)) {
                for (int i = 1; i <= 16; i++) {
                    new Yunknownopenbox().get(player);
                }
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("afterweaponbox") && hasPermission(player)) {
                new afterweaponbox().get(player);
                item.subtract(1);

            } else if (mmid.equalsIgnoreCase("afterweaponboxaxe") && hasPermission(player)) {
                new afterweaponboxaxe().get(player);
                item.subtract(1);
            }
        }
    }

    public boolean hasPermission(@NotNull Player player) {

        if (player.hasPermission("Resource.Use")) {
            return true;
        } else {
            player.sendMessage("$cこのアイテムを使う権限がありません。");
            return false;
        }
    }
}