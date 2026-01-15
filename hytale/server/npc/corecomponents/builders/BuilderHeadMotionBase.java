/*    */ package com.hypixel.hytale.server.npc.corecomponents.builders;
/*    */ 
/*    */ import com.hypixel.hytale.server.npc.instructions.HeadMotion;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BuilderHeadMotionBase
/*    */   extends BuilderMotionBase<HeadMotion>
/*    */ {
/*    */   @Nonnull
/*    */   public final Class<HeadMotion> category() {
/* 15 */     return HeadMotion.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\corecomponents\builders\BuilderHeadMotionBase.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */