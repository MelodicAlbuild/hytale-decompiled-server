/*    */ package com.hypixel.hytale.sneakythrow.function;
/*    */ 
/*    */ import com.hypixel.hytale.sneakythrow.SneakyThrow;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface ThrowableFunction<T, R, E extends Throwable>
/*    */   extends Function<T, R>
/*    */ {
/*    */   default R apply(T t) {
/*    */     try {
/* 13 */       return applyNow(t);
/* 14 */     } catch (Throwable e) {
/* 15 */       throw SneakyThrow.sneakyThrow(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   R applyNow(T paramT) throws E;
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\sneakythrow\function\ThrowableFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */