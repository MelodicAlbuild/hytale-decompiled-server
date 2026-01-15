package com.hypixel.hytale.component.system;

import com.hypixel.hytale.component.Store;
import javax.annotation.Nonnull;

public abstract class StoreSystem<ECS_TYPE> extends System<ECS_TYPE> {
  public abstract void onSystemAddedToStore(@Nonnull Store<ECS_TYPE> paramStore);
  
  public abstract void onSystemRemovedFromStore(@Nonnull Store<ECS_TYPE> paramStore);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\component\system\StoreSystem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */