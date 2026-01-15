package com.hypixel.hytale.server.worldgen.cache;

import com.hypixel.hytale.server.worldgen.chunk.ZoneBiomeResult;

@FunctionalInterface
public interface ZoneBiomeResultFunction {
  ZoneBiomeResult compute(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\worldgen\cache\ChunkGeneratorCache$ZoneBiomeResultFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */