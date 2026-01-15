/*    */ package com.hypixel.hytale.builtin.hytalegenerator.rangemaps;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nonnull;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DoubleRangeMap<T>
/*    */ {
/* 13 */   private ArrayList<DoubleRange> ranges = new ArrayList<>(1);
/* 14 */   private ArrayList<T> values = new ArrayList<>(1);
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public T get(double k) {
/* 19 */     for (int i = 0; i < this.ranges.size(); i++) {
/* 20 */       if (((DoubleRange)this.ranges.get(i)).includes(k)) return this.values.get(i); 
/*    */     } 
/* 22 */     return null;
/*    */   }
/*    */   
/*    */   @Nonnull
/*    */   public List<DoubleRange> ranges() {
/* 27 */     return new ArrayList<>(this.ranges);
/*    */   }
/*    */   
/*    */   @Nonnull
/*    */   public List<T> values() {
/* 32 */     return new ArrayList<>(this.values);
/*    */   }
/*    */   
/*    */   public void put(@Nonnull DoubleRange range, T value) {
/* 36 */     this.ranges.add(range);
/* 37 */     this.values.add(value);
/*    */   }
/*    */   
/*    */   public int size() {
/* 41 */     return this.ranges.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\rangemaps\DoubleRangeMap.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */