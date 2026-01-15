/*    */ package com.hypixel.hytale.server.core.command.commands.debug.stresstest;
/*    */ 
/*    */ import com.hypixel.hytale.math.vector.Transform;
/*    */ import com.hypixel.hytale.math.vector.Vector2d;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BotConfig
/*    */ {
/*    */   public final double radius;
/*    */   public final Vector2d flyYHeight;
/*    */   public final double flySpeed;
/*    */   public final Transform spawn;
/*    */   public final int viewRadius;
/*    */   
/*    */   public BotConfig(double radius, Vector2d flyYHeight, double flySpeed, Transform spawn, int viewRadius) {
/* 18 */     this.radius = radius;
/* 19 */     this.flyYHeight = flyYHeight;
/* 20 */     this.flySpeed = flySpeed;
/* 21 */     this.spawn = spawn;
/* 22 */     this.viewRadius = viewRadius;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\command\commands\debug\stresstest\BotConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */