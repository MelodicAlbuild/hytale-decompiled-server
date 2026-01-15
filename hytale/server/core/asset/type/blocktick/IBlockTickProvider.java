/*   */ package com.hypixel.hytale.server.core.asset.type.blocktick;
/*   */ 
/*   */ import com.hypixel.hytale.server.core.asset.type.blocktick.config.TickProcedure;
/*   */ import javax.annotation.Nullable;
/*   */ 
/*   */ @FunctionalInterface
/*   */ public interface IBlockTickProvider {
/*   */   public static final IBlockTickProvider NONE = blockId -> null;
/*   */   
/*   */   @Nullable
/*   */   TickProcedure getTickProcedure(int paramInt);
/*   */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\asset\type\blocktick\IBlockTickProvider.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */