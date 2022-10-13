// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.subsystems.drivers.Pigeon;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private static WPI_TalonSRX rightSideMotor;
  private static WPI_TalonSRX leftSideMotor;

//  public static Pigeon pigeon;

  private static DifferentialDrive differentialDrive;

  public Drivetrain(boolean isLInv, boolean isRInv) {
    super();

    rightSideMotor = new WPI_TalonSRX(RobotMap.RIGHT_DRIVETRAIN);
    leftSideMotor = new WPI_TalonSRX(RobotMap.LEFT_DRIVETRAIN);

    rightSideMotor.configFactoryDefault();
    leftSideMotor.configFactoryDefault();

    rightSideMotor.setNeutralMode(NeutralMode.Brake);
    leftSideMotor.setNeutralMode(NeutralMode.Brake);

    leftSideMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_4_AinTempVbat, 20);
    rightSideMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_4_AinTempVbat, 20);

    leftSideMotor.setInverted(isLInv);
    rightSideMotor.setInverted(isRInv);

    differentialDrive = new DifferentialDrive(leftSideMotor,rightSideMotor);
    differentialDrive.setSafetyEnabled(false);
    differentialDrive.setDeadband(0.02);

    resetEncoder();

//    pigeon = new Pigeon();
//    pigeon.resetPigeonPosition();

  }

  public void resetEncoder() {
    leftSideMotor.setSelectedSensorPosition(0);
    rightSideMotor.setSelectedSensorPosition(0);
  }

  public void driveArcade(double spd, double rot) {
    differentialDrive.arcadeDrive(spd, rot);
  }

  public void driveTank(double l, double r) {
    differentialDrive.tankDrive(l, r);
  }
}
