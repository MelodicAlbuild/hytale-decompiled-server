package com.hypixel.hytale.server.core.io.handlers;

import com.hypixel.hytale.protocol.Packet;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import java.util.function.Consumer;
import javax.annotation.Nonnull;

public interface IPacketHandler {
  void registerHandler(int paramInt, @Nonnull Consumer<Packet> paramConsumer);
  
  void registerNoOpHandlers(int... paramVarArgs);
  
  @Nonnull
  PlayerRef getPlayerRef();
  
  @Nonnull
  String getIdentifier();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\io\handlers\IPacketHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */