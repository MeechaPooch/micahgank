package org.team1540.robot2019;


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.team1540.robot2019.subsystems.DriveTrain;

public class Robot extends TimedRobot {

    public static DriveTrain driveTrain = new DriveTrain();

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void robotInit() {
        super.robotInit();
        Hardware.init();
    }

    @Override
    public void teleopPeriodic() {
        Hardware.leftA.set(0.1);
    }
}
