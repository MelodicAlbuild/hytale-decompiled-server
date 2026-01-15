package com.hypixel.hytale.procedurallib.supplier;

import java.util.Random;

public interface IFloatRange {
  float getValue(float paramFloat);
  
  float getValue(FloatSupplier paramFloatSupplier);
  
  float getValue(Random paramRandom);
  
  float getValue(int paramInt, double paramDouble1, double paramDouble2, IDoubleCoordinateSupplier2d paramIDoubleCoordinateSupplier2d);
  
  float getValue(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, IDoubleCoordinateSupplier3d paramIDoubleCoordinateSupplier3d);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\procedurallib\supplier\IFloatRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */