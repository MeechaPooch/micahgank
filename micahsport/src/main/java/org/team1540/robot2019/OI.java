package org.team1540.robot2019;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

    static double joyAngleR;

    public static XboxController driverControl = new XboxController(0);
    public static Button buttonA = new JoystickButton(driverControl, 1);
    public static Button buttonB = new JoystickButton(driverControl, 2);
    public static Button buttonX = new JoystickButton(driverControl, 3);
    public static Button buttonY = new JoystickButton(driverControl, 4);
    public static Button rightJoyButton = new JoystickButton(driverControl, 10);

    //returns an updated value if the joystick is not in the center
    public static double getAngleR() {
        if(!(driverControl.getY(GenericHID.Hand.kRight) < 0.1 && driverControl.getX(GenericHID.Hand.kRight) < 0.1)) {
            joyAngleR = Math.atan2(driverControl.getY(GenericHID.Hand.kRight), driverControl.getX(GenericHID.Hand.kRight));
        }
        return joyAngleR;
    }

    public static double getThrottleL() { return driverControl.getY(GenericHID.Hand.kLeft); }

}
