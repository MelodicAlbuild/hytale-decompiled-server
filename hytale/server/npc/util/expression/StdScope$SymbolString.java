/*    */ package com.hypixel.hytale.server.npc.util.expression;
/*    */ 
/*    */ import java.util.function.Supplier;
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
/*    */ public class SymbolString
/*    */   extends StdScope.Symbol
/*    */ {
/*    */   public final Supplier<String> value;
/*    */   
/*    */   public SymbolString(boolean isConstant, Supplier<String> value) {
/* 59 */     super(isConstant, ValueType.STRING);
/* 60 */     this.value = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\expression\StdScope$SymbolString.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */