package com.hypixel.hytale.server.worldgen.cave;

import com.hypixel.hytale.server.worldgen.cave.element.CaveNode;

@FunctionalInterface
public interface PrefabPlacementFunction {
  int generate(int paramInt, double paramDouble1, double paramDouble2, CaveNode paramCaveNode);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\worldgen\cave\CavePrefabPlacement$PrefabPlacementFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */