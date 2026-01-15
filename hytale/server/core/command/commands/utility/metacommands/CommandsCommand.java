/*   */ package com.hypixel.hytale.server.core.command.commands.utility.metacommands;
/*   */ import com.hypixel.hytale.server.core.command.system.AbstractCommand;
/*   */ import com.hypixel.hytale.server.core.command.system.basecommands.AbstractCommandCollection;
/*   */ 
/*   */ public class CommandsCommand extends AbstractCommandCollection {
/*   */   public CommandsCommand() {
/* 7 */     super("commands", "server.commands.meta.desc");
/* 8 */     addSubCommand((AbstractCommand)new DumpCommandsCommand());
/*   */   }
/*   */ }


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\command\command\\utility\metacommands\CommandsCommand.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */