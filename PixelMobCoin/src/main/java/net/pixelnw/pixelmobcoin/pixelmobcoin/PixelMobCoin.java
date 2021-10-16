package net.pixelnw.pixelmobcoin.pixelmobcoin;

import net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket.JetonMarketCommand;
import net.pixelnw.pixelmobcoin.pixelmobcoin.JetonMarket.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.text.DecimalFormat;

public final class PixelMobCoin extends JavaPlugin {

    public static DecimalFormat FORMATTER;
    public static PixelMobCoin plugin;

    @Override
    public void onEnable() {
        this.getCommand("jeton").setExecutor(new Command());
        this.getCommand("jetonmarket").setExecutor(new JetonMarketCommand());
        this.getServer().getPluginManager().registerEvents(new MobCoins(), this);
        this.getServer().getPluginManager().registerEvents(new MenuListener(), this);
        FORMATTER = new DecimalFormat("#,###");
        Cooldown.setupCoolDown();

        plugin = this;

    }
}
