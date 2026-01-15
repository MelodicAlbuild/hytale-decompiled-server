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
/*    */ public class FieldDelimiter
/*    */ {
/*    */   double top;
/*    */   double bottom;
/*    */   Assignments assignments;
/*    */   
/*    */   public FieldDelimiter(@Nonnull Assignments propDistributions, double bottom, double top) {
/* 68 */     this.bottom = bottom;
/* 69 */     this.top = top;
/* 70 */     this.assignments = propDistributions;
/*    */   }
/*    */   
/*    */   boolean isInside(double fieldValue) {
/* 74 */     return (fieldValue < this.top && fieldValue >= this.bottom);
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\propdistributions\FieldFunctionAssignments$FieldDelimiter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */