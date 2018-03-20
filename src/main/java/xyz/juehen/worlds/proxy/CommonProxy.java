package xyz.juehen.worlds.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.juehen.worlds.register.WorldsReg;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new WorldsReg();
    }

    public void init(FMLInitializationEvent event) {

    }
}
