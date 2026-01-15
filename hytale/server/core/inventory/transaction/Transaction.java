package com.hypixel.hytale.server.core.inventory.transaction;

import com.hypixel.hytale.server.core.inventory.container.ItemContainer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Transaction {
  boolean succeeded();
  
  boolean wasSlotModified(short paramShort);
  
  @Nonnull
  Transaction toParent(ItemContainer paramItemContainer1, short paramShort, ItemContainer paramItemContainer2);
  
  @Nullable
  Transaction fromParent(ItemContainer paramItemContainer1, short paramShort, ItemContainer paramItemContainer2);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\core\inventory\transaction\Transaction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */