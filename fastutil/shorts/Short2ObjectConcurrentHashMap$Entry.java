package com.hypixel.fastutil.shorts;

import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;

public interface Entry<V> extends Short2ObjectMap.Entry<V> {
  boolean isEmpty();
  
  @Deprecated
  Short getKey();
  
  short getShortKey();
  
  V getValue();
  
  int hashCode();
  
  String toString();
  
  boolean equals(Object paramObject);
  
  V setValue(V paramV);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\fastutil\shorts\Short2ObjectConcurrentHashMap$Entry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */