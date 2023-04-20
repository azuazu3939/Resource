package azuazu3939.resource;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

public class Xrandombox {

    public static void get(Player player) {

        Random ran = new Random();
        int get = ran.nextInt(17) + 1;

        //XSetA
        if (get <= 4) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " kenmazai1 30 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、kenmazai1を30個とender_pearlを32個付与しました。");
        }
        //XSetB
        if (get > 4 && get <= 8) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " endevidence 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、endevidenceを1つ付与しました。");
        }
        //XSetC
        if (get > 8 && get <= 12) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " diamond 30");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、diamondを30個とender_pearlを32個付与しました。");
        }
        //XSetD
        if (get > 12 && get <= 16) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " unknownbox 1 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " ender_pearl 16");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、unknownboxを1個とender_pearlを32個付与しました。");
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

        //XSetA
        if (get <= 4) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " kenmazai1_15setTicket 2 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " enderpearl_16setTicket 2 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、kenmazai1_15setTicketを2個とenderpearl_16setTicketを2個付与しました。");
        }
        //XSetB
        if (get > 4 && get <= 8) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " endevidence 1 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、endevidenceを1つ付与しました。");
        }
        //XSetC
        if (get > 8 && get <= 12) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " diamond_30setTicket 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " enderpearl_16setTicket 2 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、diamond_30setTicketを1個とenderpearl_16setTicketを2個付与しました。");
        }
        //XSetD
        if (get > 12 && get <= 16) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " unknownbox 1 1");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mlg " + player.getName() + " enderpearl_16setTicket 2 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、unknownboxを1個とenderpearl_16setTicketを2個付与しました。");
        }
        //XSetE
        if (get == 17) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " shulker_shell 1");
            Resource.inst().getLogger().info("[Resource_Drop]" + player.getName() + "に、shulker_shellを1個付与しました。");
        }
    }
}
