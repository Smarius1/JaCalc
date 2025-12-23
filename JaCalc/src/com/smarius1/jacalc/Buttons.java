package com.smarius1.jacalc;

import java.awt.*;

public class Buttons {

    private Button[] nums = new Button[10];
    private Button bp = new Button("+");
    private Button bm = new Button("-");
    private Button bmlt = new Button("*");
    private Button bd = new Button("/");
    private Button br = new Button("AC");
    private Button beq = new Button("=");

    public Buttons(Frame frame) {
        int w = 64;
        int h = 50;
        int margin = 20;

        // Create numeric buttons
        for (int i = 0; i < 10; i++) {
            nums[i] = new Button(String.valueOf(i));
            frame.add(nums[i]);
        }

        // Position numeric buttons
        int startX = margin;
        int startY = frame.getHeight() - (h * 4) - (margin * 4);

        int num = 7;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                nums[num].setBounds(
                        startX + col * (w + margin),
                        startY + row * (h + margin),
                        w, h
                );
                num++;
            }
            num -= 6;
        }

        // Zero button
        nums[0].setBounds(
                startX + (w + margin),
                startY + 3 * (h + margin),
                w, h
        );
    }
}
