package com.company;
import java.awt.*;

public class Tile {
    int value;

    public Tile() {
        this(0);
    }

    public Tile(int num) {
        value = num;
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public Color getForeground() {
        return value < 64 ? new Color(0xFFFFFF) :  new Color(0x000000);
    }


    public Color getBackground() {
        switch (value) {
            case 2:    return new Color(0x000155);
            case 4:    return new Color(0x550033);
            case 8:    return new Color(0x552F00);
            case 16:   return new Color(0x205300);
            case 32:   return new Color(0x0B5A7D);
            case 64:   return new Color(0x162382);
            case 128:  return new Color(0x550700);
            case 256:  return new Color(0xFFFFFF);
            case 512:  return new Color(0x878787);
            case 1024: return new Color(0x454545);
            case 2048: return new Color(0xFF2D610C, true);
        }
        return new Color(0xcdc1b4);
    }
}