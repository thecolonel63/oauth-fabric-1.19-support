package com.sintinium.oauthfabric.gui.profile;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionTypeRegistrar;
import net.minecraft.world.dimension.DimensionTypes;

public class FakeWorld extends ClientWorld {

    private static FakeWorld instance;

    public static FakeWorld getInstance() {
        if (instance == null) {
            instance = new FakeWorld();
        }
        return instance;
    }
    public FakeWorld() {
        super(FakeClientPlayNetHandler.getInstance(), new Properties(Difficulty.EASY, false, true), World.OVERWORLD, DynamicRegistryManager.BUILTIN.get().get(Registry.DIMENSION_TYPE_KEY).entryOf(DimensionTypes.OVERWORLD), 0, 0, () -> null, new WorldRenderer(MinecraftClient.getInstance(), MinecraftClient.getInstance().getEntityRenderDispatcher(), MinecraftClient.getInstance().getBlockEntityRenderDispatcher(), MinecraftClient.getInstance().getBufferBuilders()), false, 0L);
    }
}
