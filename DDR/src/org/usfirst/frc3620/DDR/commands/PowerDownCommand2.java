package org.usfirst.frc3620.DDR.commands;

import org.usfirst.frc3620.DDR.Robot;
import org.usfirst.frc3620.DDR.subsystems.Subsystem1;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PowerDownCommand2 extends Command {

    public PowerDownCommand2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    Subsystem1.Mode currentMode = Robot.subsystem1.getcurrentMode();
    // Called just before this Command runs the first time
    protected void initialize() {
    	if (currentMode == Subsystem1.Mode.ARCADE) {
    Robot.subsystem1.powerDown();
    	}
    	else {}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
