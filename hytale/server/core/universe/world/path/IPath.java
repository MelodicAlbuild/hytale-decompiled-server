package com.hypixel.hytale.server.core.universe.world.path;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public interface IPath<Waypoint extends IPathWaypoint> {
  @Nullable
  UUID getId();
  
  @Nullable
  String getName();
  
  List<Waypoint> getPathWaypoints();
  
  int length();
  
  Waypoint get(int paramInt);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\path\IPath.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */