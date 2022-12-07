package frc.robot.commands.collector;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class Collector extends CommandBase {

    public Collector() {
        super();
        addRequirements(Robot.collector);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        Robot.collector.setSpeed(Constants.Collector.SPEED);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.collector.setSpeed(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
