package com.hypixel.hytale.builtin.hytalegenerator.framework.shaders;

public interface Shader<T> {
  T shade(T paramT, long paramLong);
  
  T shade(T paramT, long paramLong1, long paramLong2);
  
  T shade(T paramT, long paramLong1, long paramLong2, long paramLong3);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\framework\shaders\Shader.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */