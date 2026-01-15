package com.hypixel.hytale.server.core.universe.world.meta.state;

import com.hypixel.hytale.component.ComponentAccessor;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import javax.annotation.Nonnull;

public interface BreakValidatedBlockState {
  boolean canDestroy(@Nonnull Ref<EntityStore> paramRef, @Nonnull ComponentAccessor<EntityStore> paramComponentAccessor);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\meta\state\BreakValidatedBlockState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */