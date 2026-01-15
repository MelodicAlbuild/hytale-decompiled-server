package com.hypixel.hytale.server.npc.util;

public interface IComponentExecutionControl {
  boolean processDelay(float paramFloat);
  
  void clearOnce();
  
  void setOnce();
  
  boolean isTriggered();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\IComponentExecutionControl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */