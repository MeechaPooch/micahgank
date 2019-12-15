package org.team1540.robot2019;

public class Utils {
    public static double signedAngleError(double target, double source) {
        return Math.atan2(Math.sin(target - source), Math.cos(target - source));
    }
}
