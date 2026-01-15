/*    */ package com.hypixel.hytale.builtin.hytalegenerator.props;
/*    */ 
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class QueueScanResult
/*    */   implements ScanResult
/*    */ {
/*    */   ScanResult propScanResult;
/*    */   Prop prop;
/*    */   
/*    */   @Nonnull
/*    */   public static QueueScanResult cast(ScanResult scanResult) {
/* 78 */     if (!(scanResult instanceof QueueScanResult)) {
/* 79 */       throw new IllegalArgumentException("The provided ScanResult isn't compatible with this prop.");
/*    */     }
/* 81 */     return (QueueScanResult)scanResult;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isNegative() {
/* 86 */     return (this.propScanResult == null || this.propScanResult.isNegative());
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\props\QueueProp$QueueScanResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */