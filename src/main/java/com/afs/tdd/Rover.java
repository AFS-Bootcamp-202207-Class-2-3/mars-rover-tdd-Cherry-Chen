package com.afs.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rover {

    private int x;
    private int y;
    private int directionCode;

    private List<String> directions = new ArrayList() {{
        add("W");
        add("N");
        add("E");
        add("S");
    }};
    private Map<String, Integer[]> move = new HashMap() {{
        put("W", new int[]{-1, 0});
        put("N", new int[]{0, 1});
        put("E", new int[]{1, 0});
        put("S", new int[]{0, -1});
    }};

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.directionCode = directions.indexOf("N");
    }

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.directionCode = directions.indexOf(direction);
    }


}
