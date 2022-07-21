package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    //case 1:
    //should_return_y_equals_1_when_executeCommand_given_command_M
    //


    @Test
    void should_be_0_1_N_when_move_given_from_0_0_N() {
        //given
        Rover rover = new Rover();
        String command = "M";

        //when
        rover.executeCommand(command);

        assertEquals(0, rover.getXCoordinate());
        assertEquals(1, rover.getYCoordinate());
        assertEquals("N", rover.getDirection());
    }
}
