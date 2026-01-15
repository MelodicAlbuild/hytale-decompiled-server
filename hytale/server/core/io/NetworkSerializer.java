package com.hypixel.hytale.server.core.io;

@FunctionalInterface
public interface NetworkSerializer<Type, Packet> {
  Packet toPacket(Type paramType);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\io\NetworkSerializer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */