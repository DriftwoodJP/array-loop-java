package com.example.arrayloop;

public class ArrayLoop {

    public static void main(String[] args) {
    var start = System.currentTimeMillis();

    var msg = new StringBuilder();

    int[] array = { 50, 60, 70, 80 };
    var map = Calculate.mps_to_kmph(array);
    for (var entry : map.entrySet()) {
      msg.append("最大瞬間風速").append(entry.getKey()).append("m = 時速").append(entry.getValue()).append("km").append("\n");
    }

    System.out.print(msg);

    var end = System.currentTimeMillis();
    System.out.println((end - start) + "ミリ秒");
  }
}
