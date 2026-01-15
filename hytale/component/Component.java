/*    */ package com.hypixel.hytale.component;
/*    */ 
/*    */ import javax.annotation.Nonnull;
/*    */ import javax.annotation.Nullable;
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
/*    */ public interface Component<ECS_TYPE>
/*    */   extends Cloneable
/*    */ {
/*    */   @Nonnull
/* 21 */   public static final Component[] EMPTY_ARRAY = new Component[0];
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   Component<ECS_TYPE> clone();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   default Component<ECS_TYPE> cloneSerializable() {
/* 38 */     return clone();
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\component\Component.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */