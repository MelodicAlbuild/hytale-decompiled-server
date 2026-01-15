/*    */ package com.hypixel.hytale.builtin.hytalegenerator.props;
/*    */ 
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ public interface ScanResult {
/*  6 */   public static final ScanResult NONE = new ScanResult()
/*    */     {
/*    */       public boolean isNegative()
/*    */       {
/* 10 */         return true;
/*    */       }
/*    */     };
/*    */   
/*    */   boolean isNegative();
/*    */   
/*    */   @Nonnull
/*    */   static ScanResult noScanResult() {
/* 18 */     return NONE;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\props\ScanResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */