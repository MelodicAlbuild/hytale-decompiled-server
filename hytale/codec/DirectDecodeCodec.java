package com.hypixel.hytale.codec;

import org.bson.BsonValue;

public interface DirectDecodeCodec<T> extends Codec<T> {
  void decode(BsonValue paramBsonValue, T paramT, ExtraInfo paramExtraInfo);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\codec\DirectDecodeCodec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */