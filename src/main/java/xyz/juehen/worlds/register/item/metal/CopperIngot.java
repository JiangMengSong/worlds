package xyz.juehen.worlds.register.item.metal;

import net.minecraft.item.Item;
import xyz.juehen.worlds.register.WorldsReg;

/**
 * 铜锭
 */
public class CopperIngot extends Item {
    public CopperIngot() {
        this.setUnlocalizedName("copper_ingot");
        this.setRegistryName("copper_ingot");
        WorldsReg.worldsReg(null,this);
    }
}
