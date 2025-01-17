package com.afs.tdd;

import java.util.*;

public class MarsRover {

    private int XCoordinate;
    private int YCoordinate;
    private int directionCode;

    private static final String MOVE_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private static final String TURN_RIGHT_COMMAND = "R";

    private static final String SOUTH = "S";
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String WEST = "W";

    private List<String> directions = new ArrayList() {{
        add(WEST);
        add(NORTH);
        add(EAST);
        add(SOUTH);
    }};
    private Map<String, Integer[]> move = new HashMap() {{
        put(WEST, new Integer[]{-1, 0});
        put(NORTH, new Integer[]{0, 1});
        put(EAST, new Integer[]{1, 0});
        put(SOUTH, new Integer[]{0, -1});
    }};

    public MarsRover(int x, int y, String direction) {
        this.XCoordinate = x;
        this.YCoordinate = y;
        this.directionCode = directions.indexOf(direction);
    }

    public void executeCommand(String commands) {
        List<String> commandList = divideCommands(commands);

        commandList.forEach(command -> {
            if (MOVE_COMMAND.equals(command)) {
                move();
            }else if (TURN_LEFT_COMMAND.equals(command)) {
                turnLeft();
            }else if (TURN_RIGHT_COMMAND.equals(command)) {
                turnRight();
            }
        });

    }

    private List<String> divideCommands(String commands) {
        return Arrays.asList(commands.split(" "));
    }

    private void move() {
        setXCoordinate(getXCoordinate() + move.get(getDirection())[0]);
        setYCoordinate(getYCoordinate() + move.get(getDirection())[1]);
    }

    private void turnLeft() {
        this.directionCode--;
        if (this.directionCode < 0) {
            this.directionCode = this.directions.size() - 1;
        }
    }

    private void turnRight() {
        this.directionCode++;
        if (directionCode >= directions.size()) {
            directionCode = 0;
        }
    }


    public int getXCoordinate() {
        return this.XCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.XCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return this.YCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public String getDirection() {
        return directions.get(directionCode);
    }

    public void setDirection() {
        directionCode = directions.indexOf(directionCode);
    }

    public String report() {
        return String.format("%d %d %s",XCoordinate,YCoordinate,getDirection());
    }
}
