package org.team1540.robot2019.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;
import org.team1540.robot2019.Hardware;
import org.team1540.robot2019.OI;
import org.team1540.robot2019.Robot;
import org.team1540.robot2019.Utils;
import org.team1540.robot2019.subsystems.DriveTrain;

public class PointDrive extends PIDCommand {

    public PointDrive() {
        super(0.1, 0, 0.1);
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {
        setSetpoint(0);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected double returnPIDInput() {
        return Utils.signedAngleError(OI.getAngleR(), Math.toRadians(Hardware.gyro.getAngle()));
    }

    @Override
    protected void usePIDOutput(double output) {
        Robot.driveTrain.setThrottle(-output + OI.getThrottleL(), output + OI.getThrottleL());
        Robot.driveTrain.setThrottle(0.1,-0.1);
        System.out.println("output used");
    }

    @Override
    protected void end() {
//        Robot.driveTrain.brake();
    }
}
