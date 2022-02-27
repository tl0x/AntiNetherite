package me.tl0x.main;


import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    private final AntiNetherite main;

    public Events(AntiNetherite main) {
        this.main = main;
    }

    @EventHandler
    public void onSmith(PrepareSmithingEvent event) {
        if (AntiNetherite.enabled) {
            switch (event.getResult().getType()) {
                case NETHERITE_AXE:
                    event.setResult(new ItemStack(Material.DIAMOND_AXE));
                case NETHERITE_SHOVEL:
                    event.setResult(new ItemStack(Material.DIAMOND_SHOVEL));
                case NETHERITE_SWORD:
                    event.setResult(new ItemStack(Material.DIAMOND_SWORD));
                case NETHERITE_PICKAXE:
                    event.setResult(new ItemStack(Material.DIAMOND_PICKAXE));
                case NETHERITE_HOE:
                    event.setResult(new ItemStack(Material.DIAMOND_HOE));
                case NETHERITE_HELMET:
                    event.setResult(new ItemStack(Material.DIAMOND_HELMET));
                case NETHERITE_CHESTPLATE:
                    event.setResult(new ItemStack(Material.DIAMOND_CHESTPLATE));
                case NETHERITE_BOOTS:
                    event.setResult(new ItemStack(Material.DIAMOND_BOOTS));
                case NETHERITE_LEGGINGS:
                    event.setResult(new ItemStack(Material.DIAMOND_LEGGINGS));
            }
        }


    }

    @EventHandler
    public void onCraft(PrepareItemCraftEvent e) {
        if (e.getRecipe().getResult().getType() == Material.NETHERITE_INGOT) {
            e.getInventory().setResult(new ItemStack(Material.DIAMOND, 16));
        }
    }


}
