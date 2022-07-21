# Mars Rover

Imagine you are in charge of software development on the Mars exploration team. Now you have to write a control program for the exploration vehicle landing on Mars, and control the actions of the marsRover according to the control instructions sent by the earth.

The instructions received by the marsRover fall into three categories:

1. Initialization information:
     The landing location (x, y) and heading (N, S, E, W) information of the marsRover;
2. Move instructions:
     The marsRover can move forward (M), one space at a time;
3. Turn instructions:
     The marsRover can turn left 90 degrees (L) or right 90 degrees (R).

Due to the long distance between the Earth and Mars, the instructions must be sent in batches. After the marsRover executes the complete batch of instructions, it will report its location coordinates and heading.