package com.hypixel.hytale.server.core.universe.world.accessor;

public interface OverridableChunkAccessor<X extends BlockAccessor> extends ChunkAccessor<X> {
  void overwrite(X paramX);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\accessor\OverridableChunkAccessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */