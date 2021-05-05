package com.example.arrayloop;

import java.util.HashMap;
import java.util.Map;

public class Calculate {
  public static Map<Integer, Integer> mps_to_kmph(int[] mps) {
    var kmph = new HashMap<Integer, Integer>();
    for (var i : mps) {
      kmph.put(i, i * 3600 / 1000);
    }
    return kmph;
  }
}
