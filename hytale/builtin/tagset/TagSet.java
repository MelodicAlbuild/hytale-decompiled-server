package com.hypixel.hytale.builtin.tagset;

import com.hypixel.hytale.assetstore.JsonAsset;

public interface TagSet extends JsonAsset<String> {
  String[] getIncludedTagSets();
  
  String[] getExcludedTagSets();
  
  String[] getIncludedTags();
  
  String[] getExcludedTags();
}


/* Location:              C:\Users\ralex\Downloads\hytale-downloader\2026.01.13-50e69c385\Server\HytaleServer.jar!\com\hypixel\hytale\builtin\tagset\TagSet.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */