package com.hypixel.hytale.server.core.util;

public interface FillerFetcher<A, B> {
  int getBlock(A paramA, B paramB, int paramInt1, int paramInt2, int paramInt3);
  
  int getFiller(A paramA, B paramB, int paramInt1, int paramInt2, int paramInt3);
  
  int getRotationIndex(A paramA, B paramB, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\util\FillerBlockUtil$FillerFetcher.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */