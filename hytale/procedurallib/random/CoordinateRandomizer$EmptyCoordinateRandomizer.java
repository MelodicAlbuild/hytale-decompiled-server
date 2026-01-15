/*     */ package com.hypixel.hytale.procedurallib.random;
/*     */ 
/*     */ import javax.annotation.Nonnull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class EmptyCoordinateRandomizer
/*     */   implements ICoordinateRandomizer
/*     */ {
/*     */   public double randomDoubleX(int seed, double x, double y) {
/* 130 */     return x;
/*     */   }
/*     */ 
/*     */   
/*     */   public double randomDoubleY(int seed, double x, double y) {
/* 135 */     return y;
/*     */   }
/*     */ 
/*     */   
/*     */   public double randomDoubleX(int seed, double x, double y, double z) {
/* 140 */     return x;
/*     */   }
/*     */ 
/*     */   
/*     */   public double randomDoubleY(int seed, double x, double y, double z) {
/* 145 */     return y;
/*     */   }
/*     */ 
/*     */   
/*     */   public double randomDoubleZ(int seed, double x, double y, double z) {
/* 150 */     return z;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nonnull
/*     */   public String toString() {
/* 156 */     return "EmptyCoordinateRandomizer{}";
/*     */   }
/*     */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\procedurallib\random\CoordinateRandomizer$EmptyCoordinateRandomizer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */