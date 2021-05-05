package com.example.arrayloop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;

class CalculateTest {
  @Test
  void 引数に配列を受け取れること() {
    int[] mps = { 50, 60, 70, 80 };
    var map = Calculate.mps_to_kmph(mps);
    assertEquals(4, map.size());
  }

  @Test
  void KeyにmpsがValueにkmphのMapが返ること() {
    int[] mps = { 50 };
    var map = Calculate.mps_to_kmph(mps);
    assertEquals(Map.of(50, 180), map);
  }
}