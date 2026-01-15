/*    */ package com.hypixel.hytale.server.spawning.util;
/*    */ 
/*    */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FloodFillEntryPoolSimple
/*    */ {
/*    */   private static final int ENTRY_SIZE = 5;
/* 12 */   private final List<int[]> entryPool = (List<int[]>)new ObjectArrayList();
/*    */   
/*    */   public int[] allocate() {
/* 15 */     return this.entryPool.isEmpty() ? new int[5] : this.entryPool.removeLast();
/*    */   }
/*    */   
/*    */   public void deallocate(int[] entry) {
/* 19 */     this.entryPool.add(entry);
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\spawnin\\util\FloodFillEntryPoolSimple.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */