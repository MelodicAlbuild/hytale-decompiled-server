/*    */ package com.hypixel.hytale.server.core.asset.common.events;
/*    */ 
/*    */ import com.hypixel.hytale.assetstore.event.AssetMonitorEvent;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ 
/*    */ public class CommonAssetMonitorEvent
/*    */   extends AssetMonitorEvent<Void> {
/*    */   public CommonAssetMonitorEvent(String assetPack, List<Path> createdOrModified, List<Path> removed, List<Path> createdOrModifiedDirectories, List<Path> removedDirectories) {
/* 10 */     super(assetPack, createdOrModified, removed, createdOrModifiedDirectories, removedDirectories);
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\asset\common\events\CommonAssetMonitorEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */