package xyz.juehen.worlds.register.item.metal;

import net.minecraft.item.Item;
import xyz.juehen.worlds.register.WorldsReg;

/**
 * 铜锭
 */
public class Ingot_Copper extends Ingot_Parent {

    public Ingot_Copper() {
        this.setUnlocalizedName("ingot_copper");
        this.setRegistryName("ingot_copper");
        WorldsReg.worldsReg(null,this);
    }
}
