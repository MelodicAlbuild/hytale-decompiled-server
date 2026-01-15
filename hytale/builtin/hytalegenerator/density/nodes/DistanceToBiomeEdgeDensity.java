/*    */ package com.hypixel.hytale.builtin.hytalegenerator.density.nodes;
/*    */ 
/*    */ import com.hypixel.hytale.builtin.hytalegenerator.density.Density;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ public class DistanceToBiomeEdgeDensity
/*    */   extends Density
/*    */ {
/*    */   public double process(@Nonnull Density.Context context) {
/* 10 */     return context.distanceToBiomeEdge;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\density\nodes\DistanceToBiomeEdgeDensity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */