package com.company;

public class Main {

    public static void main(String[] args) {
        pt pt = new pt( 6, 9 );

        pt.count_distance( 6, 9 );

        pt pt2 = new pt( 6, 9 );
        pt2.x2 = 12;
        pt2.y2 = 6;
        pt2.count_distance_w_class();
    }
}
