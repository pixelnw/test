package net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JetonMarketCommand implements CommandExecutor {

    Menuler menu = new Menuler();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            menu.openMenuKategori(player);
         }
        return false;
    }
}
