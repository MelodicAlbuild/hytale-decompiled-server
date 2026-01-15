/*    */ package com.hypixel.hytale.event;
/*    */ 
/*    */ import javax.annotation.Nullable;
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
/*    */ public interface IEventDispatcher<EventType extends IBaseEvent, ReturnType>
/*    */ {
/*    */   default boolean hasListener() {
/* 17 */     return true;
/*    */   }
/*    */   
/*    */   ReturnType dispatch(@Nullable EventType paramEventType);
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\event\IEventDispatcher.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */