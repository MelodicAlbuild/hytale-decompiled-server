package com.hypixel.hytale.server.core.prefab.selection.buffer.impl;

@FunctionalInterface
public interface ColumnPredicate<T> {
  boolean test(int paramInt1, int paramInt2, int paramInt3, T paramT);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\prefab\selection\buffer\impl\IPrefabBuffer$ColumnPredicate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */