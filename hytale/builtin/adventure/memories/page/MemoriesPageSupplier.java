/*    */ package com.hypixel.hytale.builtin.adventure.memories.page;
/*    */ 
/*    */ import com.hypixel.hytale.component.ComponentAccessor;
/*    */ import com.hypixel.hytale.component.Ref;
/*    */ import com.hypixel.hytale.server.core.entity.InteractionContext;
/*    */ import com.hypixel.hytale.server.core.entity.entities.player.pages.CustomUIPage;
/*    */ import com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction;
/*    */ import com.hypixel.hytale.server.core.universe.PlayerRef;
/*    */ import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
/*    */ import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/*    */ 
/*    */ public class MemoriesPageSupplier
/*    */   implements OpenCustomUIInteraction.CustomPageSupplier {
/*    */   @NullableDecl
/*    */   public CustomUIPage tryCreate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, PlayerRef playerRef, InteractionContext context) {
/* 16 */     return (CustomUIPage)new MemoriesPage(playerRef, context.getTargetBlock());
/*    */   }
/*    */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\adventure\memories\page\MemoriesPageSupplier.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */