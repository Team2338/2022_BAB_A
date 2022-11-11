package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {

    private static CANSparkMax shooterMotor = new CANSparkMax(RobotMap.shooter_NEO, CANSparkMaxLowLevel.MotorType.kBrushless);
    private static RelativeEncoder shooterEncoder;

    public Shooter() {
        super();
        shooterMotor.restoreFactoryDefaults();
        shooterMotor.setIdleMode(CANSparkMax.IdleMode.kCoast);
        shooterMotor.enableVoltageCompensation(12);
        shooterEncoder = shooterMotor.getEncoder();
    }

    public void setSpeed(double speed) {
        shooterMotor.setVoltage(speed);
    }

    public double getShooterSpeed() {
        return shooterEncoder.getVelocity();
    }
}