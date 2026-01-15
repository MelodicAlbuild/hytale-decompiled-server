package com.hypixel.hytale.codec.validation;

import com.hypixel.hytale.codec.ExtraInfo;

public interface LateValidator<T> extends Validator<T> {
  void acceptLate(T paramT, ValidationResults paramValidationResults, ExtraInfo paramExtraInfo);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\codec\validation\LateValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */