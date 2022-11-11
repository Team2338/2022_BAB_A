package frc.robot.commands.indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class IndexerCollectorFront extends CommandBase {
    public IndexerCollectorFront() {
        super();
        addRequirements(Robot.indexer);
    }

    @Override
    public void initialize() {
        Robot.indexer.setSpeed(0.2);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.indexer.setSpeed(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
