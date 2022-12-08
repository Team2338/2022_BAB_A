package frc.robot.commands.indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class AllIndexer extends CommandBase {
    public AllIndexer() {
        super();
        addRequirements(Robot.indexer);
    }

    @Override
    public void initialize() {

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        Robot.indexer.setSpeedFront(Constants.Indexer.INDEXERFRONT);
        Robot.indexer.setSpeedBack(Constants.Indexer.INDEXERBACK);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.indexer.setSpeedFront(0);
        Robot.indexer.setSpeedBack(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
