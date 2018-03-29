package xyz.juehen.worlds.register.block.mechanical.part;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * 导线父类
 */
public abstract class Wire_Parent extends Block {
    // 电阻(导电线路品质越差,电阻越大)
    private float resistance;

    public Wire_Parent(float resistance) {
        super(Material.ROCK);
        this.resistance = resistance;
    }

    /**
     * 获取电阻大小
     * @return
     */
    public float getResistance() {
        return resistance;
    }
}
