package com.hypixel.hytale.server.core.modules.accesscontrol.ban;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

@FunctionalInterface
public interface BanParser {
  Ban parse(JsonObject paramJsonObject) throws JsonParseException;
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\modules\accesscontrol\ban\BanParser.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */