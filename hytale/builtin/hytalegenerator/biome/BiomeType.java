package com.hypixel.hytale.builtin.hytalegenerator.biome;

import com.hypixel.hytale.builtin.hytalegenerator.density.Density;
import javax.annotation.Nonnull;

public interface BiomeType extends MaterialSource, PropsSource, EnvironmentSource, TintSource {
  String getBiomeName();
  
  @Nonnull
  Density getTerrainDensity();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\biome\BiomeType.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */