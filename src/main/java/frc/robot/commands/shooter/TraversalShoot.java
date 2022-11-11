package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class TraversalShoot extends CommandBase {
    public TraversalShoot() {
        super();
        addRequirements(Robot.shooter);
    }

    @Override
    public void initialize() {
        Robot.shooter.setSpeed(Constants.Shooter.TRAVERSAL_RANGE);
    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {

    }
}
