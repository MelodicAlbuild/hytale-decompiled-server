package com.hypixel.hytale.component.system;

import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.metrics.MetricResults;

public interface MetricSystem<ECS_TYPE> {
  MetricResults toMetricResults(Store<ECS_TYPE> paramStore);
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\component\system\MetricSystem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */