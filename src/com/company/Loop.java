package com.company;

public class Loop {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }
}

/*i = 2 | j = 2 | k = 1 -> k = 2
      | j = 3 | k = 1 -> k = 2 -> k = 3
      | j = 4 | k = 1 -> k = 2 -> k = 3 -> k = 4

2 2 1   2 2 2   2 3 1   2 3 2   2 3 3   2 4 1   2 4 2   2 4 3   2 4 4


i = 4 | j = 4 | k = 1 -> k = 2 -> k = 3 -> k = 4


4 4 1*/