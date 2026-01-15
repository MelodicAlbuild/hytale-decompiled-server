/*    */ package com.hypixel.hytale.server.core.universe.world.meta.state;
/*    */ 
/*    */ import com.hypixel.hytale.protocol.Packet;
/*    */ import com.hypixel.hytale.server.core.universe.PlayerRef;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public interface SendableBlockState
/*    */ {
/*    */   void sendTo(List<Packet> paramList);
/*    */   
/*    */   void unloadFrom(List<Packet> paramList);
/*    */   
/*    */   default boolean canPlayerSee(PlayerRef player) {
/* 20 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\meta\state\SendableBlockState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */