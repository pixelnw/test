package net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket;

import com.hakan.inventoryapi.InventoryAPI;
import com.hakan.inventoryapi.inventory.ClickableItem;
import com.hakan.inventoryapi.inventory.HInventory;
import de.NeonnBukkit.CoinsAPI.API.CoinsAPI;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.pixelnw.pixelmobcoin.pixelmobcoin.PixelMobCoin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.DecimalFormat;

public class Onay {

    PixelMobCoin l = PixelMobCoin.getPlugin(PixelMobCoin.class);

    public void open(Player player, Confirmation confirmation) {
        HInventory hInventory = InventoryAPI.getInstance(l).getInventoryCreator().setTitle("Onay Sayfası").setClosable(false).setSize(3).setInventoryType(InventoryType.CHEST).setClickable(false).setId("hclaims_confirmation_" + player.getName()).create();
        hInventory.guiAir();

        ItemStack onayla = new ItemStack(Material.STAINED_CLAY, 1, (byte) 13);
        ItemMeta onaylameta = onayla.getItemMeta();
        onaylameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOnayla"));
        onayla.setItemMeta(onaylameta);

        ItemStack reddet = new ItemStack(Material.STAINED_CLAY, 1, (byte) 14);
        ItemMeta reddetmeta = reddet.getItemMeta();
        reddetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lReddet"));
        reddet.setItemMeta(reddetmeta);

        hInventory.setItem(11, ClickableItem.of(onayla, (event) -> {
            hInventory.setClosable(true);
            player.closeInventory();
            confirmation.confirm(true);
        }));
        hInventory.setItem(15, ClickableItem.of(reddet, (event) -> {
            hInventory.setClosable(true);
            player.closeInventory();
            confirmation.confirm(false);
        }));
        hInventory.open(player);
    }

    public interface Confirmation {
        void confirm(boolean var1);
    }

}
