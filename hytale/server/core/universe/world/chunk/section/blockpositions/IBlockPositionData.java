package com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions;

import com.hypixel.hytale.server.core.universe.world.chunk.section.BlockSection;

public interface IBlockPositionData {
  BlockSection getChunkSection();
  
  int getBlockType();
  
  int getX();
  
  int getY();
  
  int getZ();
  
  double getXCentre();
  
  double getYCentre();
  
  double getZCentre();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\chunk\section\blockpositions\IBlockPositionData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */