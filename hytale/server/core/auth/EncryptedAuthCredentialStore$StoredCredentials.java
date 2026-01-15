package com.hypixel.hytale.server.core.auth;

import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

class StoredCredentials {
  @Nullable
  String accessToken;
  
  @Nullable
  String refreshToken;
  
  @Nullable
  Instant expiresAt;
  
  @Nullable
  UUID profileUuid;
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\auth\EncryptedAuthCredentialStore$StoredCredentials.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */