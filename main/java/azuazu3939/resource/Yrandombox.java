package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

public class Yrandombox {

    public static void get(Player player) {

        Random ran = new Random();
        int get = ran.nextInt(17) + 1;

        //YSetA
        if (get <= 4) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " netherkaihou 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、netherkaihouを1個付与しました。");
        }
        //YSetB
        if (get > 4 && get <= 8) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " iron_ingot 60");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、iron_ingotを60個付与しました。");
        }
        //YSetC
        if (get > 8 && get <= 12) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigenticket 15 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " kenmazai1 15 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、kenmazai1を15個とsigenticketを15個付与しました。");
        }
        //YSetD
        if (get > 12 && get <= 16) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " Yunknownbox 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、Yunknownboxを1個付与しました。");
        }
        //XSetE
        if (get == 17) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " shulker_shell 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、shulker_shellを1個付与しました。");
        }
    }

    public static void get16(Player player) {

        Random ran = new Random();
        int get = ran.nextInt(17) + 1;

        //YSetA
        if (get <= 4) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " netherkaihou 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、netherkaihouを1個付与しました。");
        }
        //YSetB
        if (get > 4 && get <= 8) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " iron_60setTicket 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、iron_60setTicketを1個付与しました。");
        }
        //YSetC
        if (get > 8 && get <= 12) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " sigenticket 15 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " kenmazai1_15setTicket 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、kenmazai1_15setTicketを1個とsigenticketを15個付与しました。");
        }
        //YSetD
        if (get > 12 && get <= 16) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " Yunknownbox 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、Yunknownboxを1個付与しました。");
        }
        //XSetE
        if (get == 17) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " shulker_shell 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、shulker_shellを1個付与しました。");
        }
    }
}
