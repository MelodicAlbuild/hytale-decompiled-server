/*    */ package com.hypixel.hytale.server.core.modules.interaction.interaction.operation;
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
/*    */ public class Label
/*    */ {
/*    */   protected int index;
/*    */   
/*    */   protected Label(int index) {
/* 29 */     this.index = index;
/*    */   }
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
/*    */   public int getIndex() {
/* 47 */     return this.index;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public String toString() {
/* 53 */     return "Label{index=" + this.index + "}";
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\modules\interaction\interaction\operation\Label.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */