package com.mycompany.main;
public class JoystickController implements PlayerController {
    @Override
    public void moveUp() {
        System.out.println("Joystick: Moving Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Joystick: Moving Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Joystick: Moving Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Joystick: Moving Right");
    }
}
