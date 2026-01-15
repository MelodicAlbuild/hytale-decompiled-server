/*    */ package com.hypixel.hytale.server.npc.util.expression;
/*    */ 
/*    */ import java.util.function.DoubleSupplier;
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
/*    */ public class SymbolNumber
/*    */   extends StdScope.Symbol
/*    */ {
/*    */   public final DoubleSupplier value;
/*    */   
/*    */   public SymbolNumber(boolean isConstant, DoubleSupplier value) {
/* 68 */     super(isConstant, ValueType.NUMBER);
/* 69 */     this.value = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\expression\StdScope$SymbolNumber.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */