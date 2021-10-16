package net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onClickInventory(InventoryClickEvent event){
        if(event.getInventory().getTitle().equalsIgnoreCase("Jeton Marketi")){
            event.setCancelled(true);
        }
    }

}
