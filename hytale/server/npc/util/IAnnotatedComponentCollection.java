package com.hypixel.hytale.server.npc.util;

import javax.annotation.Nullable;

public interface IAnnotatedComponentCollection extends IAnnotatedComponent {
  int componentCount();
  
  @Nullable
  IAnnotatedComponent getComponent(int paramInt);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\IAnnotatedComponentCollection.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */