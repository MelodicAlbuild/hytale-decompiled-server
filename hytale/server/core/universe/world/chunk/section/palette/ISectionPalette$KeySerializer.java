package com.hypixel.hytale.server.core.universe.world.chunk.section.palette;

import io.netty.buffer.ByteBuf;

@FunctionalInterface
public interface KeySerializer {
  void serialize(ByteBuf paramByteBuf, int paramInt);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\chunk\section\palette\ISectionPalette$KeySerializer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */