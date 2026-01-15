/*    */ package com.hypixel.hytale.builtin.asseteditor.event;
/*    */ 
/*    */ import com.hypixel.hytale.builtin.asseteditor.EditorClient;
/*    */ 
/*    */ public class AssetEditorActivateButtonEvent extends EditorClientEvent<String> {
/*    */   private final String buttonId;
/*    */   
/*    */   public AssetEditorActivateButtonEvent(EditorClient editorClient, String buttonId) {
/*  9 */     super(editorClient);
/* 10 */     this.buttonId = buttonId;
/*    */   }
/*    */   
/*    */   public String getButtonId() {
/* 14 */     return this.buttonId;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\asseteditor\event\AssetEditorActivateButtonEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */