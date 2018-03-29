package xyz.juehen.worlds.register.item.metal;

import net.minecraft.item.Item;
import xyz.juehen.worlds.register.WorldsReg;

/**
 * 铁锤
 */
public class Hammer extends Item {
    public Hammer() {
        this.setUnlocalizedName("hammer");
        this.setRegistryName("hammer");
        WorldsReg.worldsReg(null,this);
    }
}
