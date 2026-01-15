package com.hypixel.hytale.server.core.entity.entities.player.windows;

import javax.annotation.Nonnull;

public interface MaterialContainerWindow {
  @Nonnull
  MaterialExtraResourcesSection getExtraResourcesSection();
  
  void invalidateExtraResources();
  
  boolean isValid();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\entity\entities\player\windows\MaterialContainerWindow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */