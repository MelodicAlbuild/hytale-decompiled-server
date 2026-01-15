/*    */ package com.hypixel.hytale.server.npc.util.expression;
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
/*    */ public class Symbol
/*    */ {
/*    */   public final boolean isConstant;
/*    */   public final ValueType valueType;
/*    */   
/*    */   public Symbol(boolean isConstant, ValueType valueType) {
/* 50 */     this.isConstant = isConstant;
/* 51 */     this.valueType = valueType;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\expression\StdScope$Symbol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */