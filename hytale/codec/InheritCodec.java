package com.hypixel.hytale.codec;

import javax.annotation.Nullable;
import org.bson.BsonDocument;

public interface InheritCodec<T> extends Codec<T>, RawJsonInheritCodec<T> {
  @Nullable
  T decodeAndInherit(BsonDocument paramBsonDocument, T paramT, ExtraInfo paramExtraInfo);
  
  void decodeAndInherit(BsonDocument paramBsonDocument, T paramT1, T paramT2, ExtraInfo paramExtraInfo);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\codec\InheritCodec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */