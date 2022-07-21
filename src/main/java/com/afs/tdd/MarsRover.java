package com.afs.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    private int XCoordinate;
    private int YCoordinate;
    private int directionCode;

    public static final String MOVE_COMMAND = "M";

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

    public MarsRover() {
        this.XCoordinate = 0;
        this.YCoordinate = 0;
        this.directionCode = directions.indexOf("N");
    }

    public MarsRover(int x, int y, String direction) {
        this.XCoordinate = x;
        this.YCoordinate = y;
        this.directionCode = directions.indexOf(direction);
    }

    public void executeCommand(String command) {
        if(MOVE_COMMAND.equals(command)){
            this.YCoordinate++;
        }

        if("L".equals(command)){
            this.directionCode--;
        }
    }


    public int getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.XCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public String getDirection(){
        return directions.get(directionCode);
    }

    public void setDirection(){
        directionCode = directions.indexOf(directionCode);
    }
}
