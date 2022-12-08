package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class LongShoot extends CommandBase {
    public LongShoot() {
        super();
        addRequirements(Robot.shooter);
    }

    @Override
    public void initialize() {
        ;
    }

    @Override
    public void execute() {
        Robot.shooter.setSpeed(Constants.Shooter.LONG_RANGE);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {

    }
}
