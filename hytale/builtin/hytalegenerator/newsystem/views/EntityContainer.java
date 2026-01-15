package com.hypixel.hytale.builtin.hytalegenerator.newsystem.views;

import com.hypixel.hytale.builtin.hytalegenerator.props.entity.EntityPlacementData;
import javax.annotation.Nonnull;

public interface EntityContainer {
  void addEntity(@Nonnull EntityPlacementData paramEntityPlacementData);
  
  boolean isInsideBuffer(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\newsystem\views\EntityContainer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */