package net.pixelnw.pixelmobcoin.pixelmobcoin;

import de.NeonnBukkit.CoinsAPI.API.CoinsAPI;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;

            if(player.isOp()){
                if(args.length == 0){
                    int coinMiktar = CoinsAPI.getCoins(player.getUniqueId().toString());
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&3Jeton &8» &7Hesabında bulunan toplam jeton: &e" + PixelMobCoin.FORMATTER.format(coinMiktar)));
                }

                else if (args[0].equals("ver")) {
                    if(args.length == 1 || args.length == 2){
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDoğru Kullanımı &8» &7/jeton ver <oyuncu> <miktar>"));
                    }
                    else{
                        Player tradeWith = Bukkit.getPlayer(args[1]);

                        if(Bukkit.getOnlinePlayers().contains(tradeWith)){
                            try {
                                int girilen = Integer.parseInt(args[2]);
                                if(girilen <= 0){
                                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGirilen miktar en az 1 olmalıdır."));
                                }
                                else{
                                   addJeton(tradeWith, girilen);
                                }
                            }
                            catch (NumberFormatException e){
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cHatalı miktar girdin!"));
                            }
                        } else {
                            player.sendMessage(ChatColor.RED + args[1] + " adlı oyuncu çevrimiçi değil.");
                        }
                    }

                }

                else if (args[0].equals("sil")) {

                    if(args.length == 1 || args.length == 2){
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDoğru Kullanımı &8» &7/jeton sil <oyuncu> <miktar>"));
                    }
                    else{
                        Player tradeWith = Bukkit.getPlayer(args[1]);

                        if(Bukkit.getOnlinePlayers().contains(tradeWith)){
                            try {
                                int girilen = Integer.parseInt(args[2]);
                                if(girilen <= 0){
                                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGirilen miktar en az 1 olmalıdır."));
                                }
                                else{
                                    deleteJeton(tradeWith, girilen);
                                }
                            }
                            catch (NumberFormatException e){
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cHatalı miktar girdin!"));
                            }
                        } else {
                            player.sendMessage(ChatColor.RED + args[1] + " adlı oyuncu çevrimiçi değil.");
                        }
                    }

                }
                else{
                    player.sendMessage("Jeton Komutları: Sonra Ekleyecem");
                }
            }
        }

        if(commandSender instanceof ConsoleCommandSender){
            ConsoleCommandSender player = (ConsoleCommandSender) commandSender;

            if(args.length == 0){
                player.sendMessage("Jeton Komutları: Sonra Ekleyecem");
            }

            else if (args[0].equals("ver")) {
                if(args.length == 1 || args.length == 2){
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDoğru Kullanımı &8» &7/jeton ver <oyuncu> <miktar>"));
                }
                else{
                    Player tradeWith = Bukkit.getPlayer(args[1]);

                    if(Bukkit.getOnlinePlayers().contains(tradeWith)){
                        try {
                            int girilen = Integer.parseInt(args[2]);
                            if(girilen <= 0){
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGirilen miktar en az 1 olmalıdır."));
                            }
                            else{
                                addJeton(tradeWith, girilen);
                            }
                        }
                        catch (NumberFormatException e){
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cHatalı miktar girdin!"));
                        }
                    } else {
                        player.sendMessage(ChatColor.RED + args[1] + " adlı oyuncu çevrimiçi değil.");
                    }
                }

            }

            else if (args[0].equals("sil")) {

                if(args.length == 1 || args.length == 2){
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDoğru Kullanımı &8» &7/jeton sil <oyuncu> <miktar>"));
                }
                else{
                    Player tradeWith = Bukkit.getPlayer(args[1]);

                    if(Bukkit.getOnlinePlayers().contains(tradeWith)){
                        try {
                            int girilen = Integer.parseInt(args[2]);
                            if(girilen <= 0){
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGirilen miktar en az 1 olmalıdır."));
                            }
                            else{
                                deleteJeton(tradeWith, girilen);
                            }
                        }
                        catch (NumberFormatException e){
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cHatalı miktar girdin!"));
                        }
                    } else {
                        player.sendMessage(ChatColor.RED + args[1] + " adlı oyuncu çevrimiçi değil.");
                    }
                }

            }
            else{
                player.sendMessage("Jeton Komutları: Sonra Ekleyecem");
            }
        }


        return false;
    }

    public void addJeton(Player killer, int number){
        CoinsAPI.addCoins(killer.getUniqueId().toString(), number);
        sendActionBar(killer, "§3+" + PixelMobCoin.FORMATTER.format(number) + " Jeton");
        killer.getWorld().playSound(killer.getLocation(), Sound.valueOf("NOTE_STICKS"), 1f, 1f);
    }

    public void deleteJeton(Player killer, int number){
        CoinsAPI.removeCoins(killer.getUniqueId().toString(), number);
        sendActionBar(killer, "§c-" + PixelMobCoin.FORMATTER.format(number) + " Jeton");
        killer.getWorld().playSound(killer.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
    }

    public void sendActionBar(Player p, String nachricht) {
        CraftPlayer cp = (CraftPlayer) p;
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + nachricht + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte) 2);
        cp.getHandle().playerConnection.sendPacket(ppoc);
    }


}
