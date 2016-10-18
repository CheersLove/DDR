package org.usfirst.frc3620.DDR.commands;

import org.usfirst.frc3620.DDR.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SafetyCommand extends Command {

    public SafetyCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.subsystem1.toggleSafety();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
