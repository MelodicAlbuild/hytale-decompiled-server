package com.hypixel.hytale.server.npc.blackboard.view.event;

import com.hypixel.hytale.server.npc.entities.NPCEntity;

@FunctionalInterface
public interface IEventCallback<EventType, NotificationType extends EventNotification> {
  void notify(NPCEntity paramNPCEntity, EventType paramEventType, NotificationType paramNotificationType);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\npc\blackboard\view\event\IEventCallback.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */