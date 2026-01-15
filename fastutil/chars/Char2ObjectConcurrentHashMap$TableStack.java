package com.hypixel.fastutil.chars;

public final class TableStack<V> {
  public int length;
  
  public int index;
  
  public Char2ObjectConcurrentHashMap.Node<V>[] tab;
  
  public TableStack<V> next;
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\fastutil\chars\Char2ObjectConcurrentHashMap$TableStack.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */