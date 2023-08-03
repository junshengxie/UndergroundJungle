package io.github.hexagonnico.undergroundjungle;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UndergroundJungleMod.ID)
public class UndergroundJungleMod {

    public static final String ID = "underground_jungle";

    public UndergroundJungleMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        UndergroundJungleBiomes.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
