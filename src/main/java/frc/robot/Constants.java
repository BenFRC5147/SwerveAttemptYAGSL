package frc.robot;

import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import swervelib.parser.PIDFConfig;

public final class Constants {
  public static final double ROBOT_MASS = (148-20.3) * 0.453592; //32lbs * kg per pound
  public static final double CHASSIS_MASS = ROBOT_MASS;
  public static final Translation3d CHASSIS_CG = new Translation3d(0, 0, Units.inchesToMeters(8));
  public static final double LOOP_TIME = 0.13; //s, 20ms + 110ms spark max velocity lag


  public static final class Auton{
    public static final PIDFConfig xAutoPID = new PIDFConfig(0.7, 0, 0);
    public static final PIDFConfig yAutoPID = new PIDFConfig(0.7, 0, 0);
    public static final PIDFConfig angleAutoPID = new PIDFConfig(0.4, 0, 0.01);

    public static final double MAX_SPEED = 4;
    public static final double MAX_ACCELERATION = 2;
  }

  public static final class Drivebase{
    public static final double WHEEL_LOCK_TIME = 10; //seconds
  }

  public static class OperatorConstants {
    public static final double LEFT_X_DEADBAND = 0.01;
    public static final double LEFT_Y_DEADBAND = 0.01;
  }
}
