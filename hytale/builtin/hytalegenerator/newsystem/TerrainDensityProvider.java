package com.hypixel.hytale.builtin.hytalegenerator.newsystem;

import com.hypixel.hytale.builtin.hytalegenerator.threadindexer.WorkerIndexer;
import com.hypixel.hytale.math.vector.Vector3i;
import javax.annotation.Nonnull;

@FunctionalInterface
public interface TerrainDensityProvider {
  double get(@Nonnull Vector3i paramVector3i, @Nonnull WorkerIndexer.Id paramId);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\newsystem\TerrainDensityProvider.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */