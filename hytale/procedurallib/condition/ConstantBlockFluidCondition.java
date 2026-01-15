/*    */ package com.hypixel.hytale.procedurallib.condition;
/*    */ 
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ public class ConstantBlockFluidCondition
/*    */   implements IBlockFluidCondition {
/*  7 */   public static final ConstantBlockFluidCondition DEFAULT_TRUE = new ConstantBlockFluidCondition(true);
/*  8 */   public static final ConstantBlockFluidCondition DEFAULT_FALSE = new ConstantBlockFluidCondition(false);
/*    */   
/*    */   protected final boolean result;
/*    */   
/*    */   public ConstantBlockFluidCondition(boolean result) {
/* 13 */     this.result = result;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean eval(int block, int fluid) {
/* 18 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public String toString() {
/* 24 */     return "ConstantBlockFluidCondition{result=" + this.result + "}";
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\procedurallib\condition\ConstantBlockFluidCondition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */