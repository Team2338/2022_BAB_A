package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {

    private static CANSparkMax shooterMotor = new CANSparkMax(RobotMap.SHOOTER_NEO, CANSparkMaxLowLevel.MotorType.kBrushless);
    private static SparkMaxPIDController pidController;
    private static RelativeEncoder shooterEncoder;

    public Shooter() {
        super();
        shooterMotor.restoreFactoryDefaults();
        shooterMotor.setIdleMode(CANSparkMax.IdleMode.kCoast);
        shooterMotor.enableVoltageCompensation(12);

        shooterEncoder = shooterMotor.getEncoder();

        pidController = shooterMotor.getPIDController();
        pidController.setOutputRange(0,1);
        pidController.setFF(Constants.Shooter.PID_FF);
        pidController.setP(Constants.Shooter.PID_P);
    }

    public void setSpeed(double speed) {
        shooterMotor.set(speed);
    }

    public void setPID(double speed) {
        pidController.setReference(speed, CANSparkMax.ControlType.kVelocity);
    }

    public double getShooterSpeed() {
        return shooterEncoder.getVelocity();
    }
}