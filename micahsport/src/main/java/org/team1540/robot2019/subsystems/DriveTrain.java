package org.team1540.robot2019.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1540.robot2019.Hardware;
import org.team1540.robot2019.commands.PointDrive;

public class DriveTrain extends Subsystem {

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new PointDrive());
    }

    public void brake() {
        Hardware.leftA.set(0);
        Hardware.rightA.set(0);
    }

    public void setThrottle(double l, double r) {
        setThrottleRight(l);
        setThrottleRight(r);
    }

    public void setThrottleLeft(double t) {
        Hardware.leftA.set(t);
    }
    public void setThrottleRight(double t) {
        Hardware.rightA.set(t);
    }

}
