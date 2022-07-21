package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    void should_be_0_1_N_when_move_given_from_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(1, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_W_when_turn_left_given_from_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "L";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_E_when_turn_right_given_from_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "R";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_be_0_minus_1_S_when_move_given_from_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "M";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(-1, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_E_when_turn_left_given_from_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "L";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_W_when_turn_right_given_from_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "R";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_be_1_0_E_when_move_given_from_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "M";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_N_when_turn_left_given_from_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "L";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_S_when_turn_right_given_from_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "R";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_be_minus_1_0_W_when_move_given_from_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "M";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(-1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_S_when_turn_left_given_from_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "L";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_be_0_0_N_when_turn_right_given_from_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "R";

        //when
        marsRover.executeCommand(command);

        //then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }
}
