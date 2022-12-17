package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Collector extends SubsystemBase {
    private static WPI_TalonSRX collectorMotor = new WPI_TalonSRX(RobotMap.COLLECTOR);
    public Collector() {
        super();
        collectorMotor.configFactoryDefault();
        collectorMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void setSpeed(double percent) {
        collectorMotor.set(ControlMode.PercentOutput, percent);
    }
}
