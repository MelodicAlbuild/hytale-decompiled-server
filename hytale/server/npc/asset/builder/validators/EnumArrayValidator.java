package com.hypixel.hytale.server.npc.asset.builder.validators;

public abstract class EnumArrayValidator extends Validator {
  public abstract <T extends Enum<T>> boolean test(T[] paramArrayOfT, Class<T> paramClass);
  
  public abstract <T extends Enum<T>> String errorMessage(String paramString, T[] paramArrayOfT);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\asset\builder\validators\EnumArrayValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */