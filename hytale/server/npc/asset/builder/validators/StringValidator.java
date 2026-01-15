package com.hypixel.hytale.server.npc.asset.builder.validators;

public abstract class StringValidator extends Validator {
  public abstract boolean test(String paramString);
  
  public abstract String errorMessage(String paramString);
  
  public abstract String errorMessage(String paramString1, String paramString2);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\asset\builder\validators\StringValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */