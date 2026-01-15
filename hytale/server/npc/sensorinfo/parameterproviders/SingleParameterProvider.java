/*    */ package com.hypixel.hytale.server.npc.sensorinfo.parameterproviders;
/*    */ 
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SingleParameterProvider
/*    */   implements ParameterProvider
/*    */ {
/*    */   private final int parameter;
/*    */   
/*    */   public SingleParameterProvider(int parameter) {
/* 13 */     this.parameter = parameter;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public ParameterProvider getParameterProvider(int parameter) {
/* 19 */     if (this.parameter != parameter) throw new IllegalStateException("Parameter does not match!"); 
/* 20 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\sensorinfo\parameterproviders\SingleParameterProvider.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */