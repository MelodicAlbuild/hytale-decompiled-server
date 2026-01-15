package com.hypixel.fastutil.floats;

public final class TableStack<V> {
  public int length;
  
  public int index;
  
  public Float2ObjectConcurrentHashMap.Node<V>[] tab;
  
  public TableStack<V> next;
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\fastutil\floats\Float2ObjectConcurrentHashMap$TableStack.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */