/*    */ package com.hypixel.hytale.server.core.asset;
/*    */ 
/*    */ import com.hypixel.hytale.assetstore.AssetPack;
/*    */ import com.hypixel.hytale.event.IEvent;
/*    */ 
/*    */ public class AssetPackUnregisterEvent
/*    */   implements IEvent<Void> {
/*    */   private final AssetPack assetPack;
/*    */   
/*    */   public AssetPackUnregisterEvent(AssetPack assetPack) {
/* 11 */     this.assetPack = assetPack;
/*    */   }
/*    */   
/*    */   public AssetPack getAssetPack() {
/* 15 */     return this.assetPack;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\asset\AssetPackUnregisterEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */