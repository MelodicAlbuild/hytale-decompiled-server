package com.hypixel.hytale.server.core.modules.interaction.interaction.config.server;

import com.hypixel.hytale.component.ComponentAccessor;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.server.core.entity.InteractionContext;
import com.hypixel.hytale.server.core.entity.entities.player.pages.CustomUIPage;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import javax.annotation.Nullable;

@FunctionalInterface
public interface CustomPageSupplier {
  @Nullable
  CustomUIPage tryCreate(Ref<EntityStore> paramRef, ComponentAccessor<EntityStore> paramComponentAccessor, PlayerRef paramPlayerRef, InteractionContext paramInteractionContext);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\modules\interaction\interaction\config\server\OpenCustomUIInteraction$CustomPageSupplier.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */