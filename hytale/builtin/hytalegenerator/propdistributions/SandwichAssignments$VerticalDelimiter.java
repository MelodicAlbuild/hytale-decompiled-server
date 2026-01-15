/*    */ package com.hypixel.hytale.builtin.hytalegenerator.propdistributions;
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
/*    */ public class VerticalDelimiter
/*    */ {
/*    */   double maxY;
/*    */   double minY;
/*    */   Assignments assignments;
/*    */   
/*    */   public VerticalDelimiter(@Nonnull Assignments propDistributions, double minY, double maxY) {
/* 57 */     this.minY = minY;
/* 58 */     this.maxY = maxY;
/* 59 */     this.assignments = propDistributions;
/*    */   }
/*    */   
/*    */   boolean isInside(double fieldValue) {
/* 63 */     return (fieldValue < this.maxY && fieldValue >= this.minY);
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\propdistributions\SandwichAssignments$VerticalDelimiter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */