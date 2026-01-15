package com.hypixel.fastutil.ints;

@FunctionalInterface
public interface IntBiObjFunction<V, X, J> {
  J apply(int paramInt, V paramV, X paramX);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\fastutil\ints\Int2ObjectConcurrentHashMap$IntBiObjFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */