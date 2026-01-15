/*    */ package com.hypixel.hytale.server.core.event.events.ecs;
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
/*    */ public final class PlayerRequest
/*    */   extends DropItemEvent
/*    */ {
/*    */   private final int inventorySectionId;
/*    */   private final short slotId;
/*    */   
/*    */   public PlayerRequest(int inventorySectionId, short slotId) {
/* 37 */     this.inventorySectionId = inventorySectionId;
/* 38 */     this.slotId = slotId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getInventorySectionId() {
/* 45 */     return this.inventorySectionId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public short getSlotId() {
/* 52 */     return this.slotId;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\event\events\ecs\DropItemEvent$PlayerRequest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */