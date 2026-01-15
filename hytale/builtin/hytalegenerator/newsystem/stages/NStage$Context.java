/*    */ package com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages;
/*    */ 
/*    */ import com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.NBufferBundle;
/*    */ import com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers.type.NBufferType;
/*    */ import com.hypixel.hytale.builtin.hytalegenerator.threadindexer.WorkerIndexer;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Context
/*    */ {
/*    */   @Nonnull
/*    */   public Map<NBufferType, NBufferBundle.Access.View> bufferAccess;
/*    */   @Nonnull
/*    */   public WorkerIndexer.Id workerId;
/*    */   
/*    */   public Context(@Nonnull Map<NBufferType, NBufferBundle.Access.View> bufferAccess, @Nonnull WorkerIndexer.Id workerId) {
/* 21 */     this.bufferAccess = bufferAccess;
/* 22 */     this.workerId = workerId;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\newsystem\stages\NStage$Context.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */