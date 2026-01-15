package com.hypixel.hytale.server.npc.navigation;

import com.hypixel.hytale.math.vector.Vector3d;
import javax.annotation.Nullable;

public interface IWaypoint {
  int getLength();
  
  Vector3d getPosition();
  
  @Nullable
  IWaypoint advance(int paramInt);
  
  @Nullable
  IWaypoint next();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\navigation\IWaypoint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */