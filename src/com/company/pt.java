package com.company;
import static java.lang.Math.*;

public class pt {
    int x, y, x2, y2;

    pt() {
        this.x = 0;
        this.y = 0;
    }
    pt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void count_distance(int x, int y) {
        System.out.println("Dystans to: " + sqrt((Math.pow(x - this.x, 2)) + (Math.pow(y - this.y, 2))));
    }
    void count_distance_w_class() {
        System.out.println("Dystant to: " + sqrt((Math.pow(x2 - this.x, 2)) + (Math.pow(y2 - this.y, 2))));
    }
}
