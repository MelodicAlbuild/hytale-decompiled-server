package com.hypixel.hytale.server.core.modules.collision;

@FunctionalInterface
public interface CollisionFilter<D, T> {
  boolean test(T paramT, int paramInt, D paramD, CollisionConfig paramCollisionConfig);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\modules\collision\CollisionFilter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */