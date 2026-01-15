/*    */ package com.hypixel.hytale.sneakythrow;
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface ThrowableRunnable<E extends Throwable>
/*    */   extends Runnable
/*    */ {
/*    */   default void run() {
/*    */     try {
/*  9 */       runNow();
/* 10 */     } catch (Throwable e) {
/* 11 */       throw SneakyThrow.sneakyThrow(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   void runNow() throws E;
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\sneakythrow\ThrowableRunnable.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */