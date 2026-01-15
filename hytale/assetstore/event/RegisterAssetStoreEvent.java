/*    */ package com.hypixel.hytale.assetstore.event;
/*    */ 
/*    */ import com.hypixel.hytale.assetstore.AssetStore;
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
/*    */ public class RegisterAssetStoreEvent
/*    */   extends AssetStoreEvent<Void>
/*    */ {
/*    */   public RegisterAssetStoreEvent(@Nonnull AssetStore<?, ?, ?> assetStore) {
/* 18 */     super(assetStore);
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\assetstore\event\RegisterAssetStoreEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */