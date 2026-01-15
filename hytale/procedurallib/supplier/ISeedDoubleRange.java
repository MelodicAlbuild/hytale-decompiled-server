/*   */ package com.hypixel.hytale.procedurallib.supplier;
/*   */ @FunctionalInterface
/*   */ public interface ISeedDoubleRange {
/*   */   static {
/* 5 */     DIRECT = ((seed, value) -> value);
/*   */   }
/*   */   
/*   */   public static final ISeedDoubleRange DIRECT;
/*   */   
/*   */   double getValue(int paramInt, double paramDouble);
/*   */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\procedurallib\supplier\ISeedDoubleRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */