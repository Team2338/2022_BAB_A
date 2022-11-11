package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Indexer extends SubsystemBase {

    private static WPI_TalonSRX indexerMotorFront = new WPI_TalonSRX(RobotMap.INDEXER_ONE);
    private static WPI_TalonSRX indexerMotorBack = new WPI_TalonSRX(RobotMap.INDEXER_TWO);

    public Indexer() {
        super();
        indexerMotorFront.configFactoryDefault();
        indexerMotorBack.configFactoryDefault();

        indexerMotorFront.setNeutralMode(NeutralMode.Brake);
        indexerMotorBack.setNeutralMode(NeutralMode.Brake);

        indexerMotorFront.setInverted(true);
        indexerMotorBack.setInverted(true);
    }

    public void setSpeedFront(double percent) {
        indexerMotorFront.set(ControlMode.PercentOutput, percent);
    }

    public void setSpeedBack(double percent) {
        indexerMotorBack.set(ControlMode.PercentOutput, percent);
    }
}
