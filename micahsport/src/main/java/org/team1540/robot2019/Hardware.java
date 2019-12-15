package org.team1540.robot2019;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.SPI.Port;

public class Hardware {

    public static CANSparkMax leftA;
    public static CANSparkMax leftB;
    public static CANSparkMax rightA;
    public static CANSparkMax rightB;

    public static AHRS gyro;

    public static void init() {
        initDrive();
        initGyro();
    }

    static void initDrive() {
        rightA = new CANSparkMax(1, MotorType.kBrushless);
        rightB = new CANSparkMax(2, MotorType.kBrushless);
        leftA = new CANSparkMax(3, MotorType.kBrushless);
        leftB = new CANSparkMax(4, MotorType.kBrushless);

        rightB.follow(rightA);
        leftB.follow(leftA);
    }

    static void initGyro() {
        gyro = new AHRS(Port.kMXP);
    }

}
