/*    */ package com.hypixel.hytale.sneakythrow.supplier;
/*    */ 
/*    */ import com.hypixel.hytale.sneakythrow.SneakyThrow;
/*    */ import java.util.function.IntSupplier;
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface ThrowableIntSupplier<E extends Throwable>
/*    */   extends IntSupplier
/*    */ {
/*    */   default int getAsInt() {
/*    */     try {
/* 13 */       return getAsIntNow();
/* 14 */     } catch (Throwable e) {
/* 15 */       throw SneakyThrow.sneakyThrow(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   int getAsIntNow() throws E;
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\sneakythrow\supplier\ThrowableIntSupplier.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */