package com.hypixel.hytale.server.npc.navigation;

public interface AStarNodePool {
  AStarNode allocate();
  
  void deallocate(AStarNode paramAStarNode);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\navigation\AStarNodePool.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */