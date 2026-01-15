package com.hypixel.hytale.server.worldgen.util.cache;

import javax.annotation.Nullable;

public interface Cache<K, V> {
  void shutdown();
  
  void cleanup();
  
  @Nullable
  V get(K paramK);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\worldge\\util\cache\Cache.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */