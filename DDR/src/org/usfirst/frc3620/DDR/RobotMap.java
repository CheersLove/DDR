// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3620.DDR;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController subsystem1SpeedController1;
    public static SpeedController subsystem1SpeedController2;
    public static RobotDrive subsystem1RobotDrive21;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        subsystem1SpeedController1 = new Talon(0);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 1", (Talon) subsystem1SpeedController1);
        
        subsystem1SpeedController2 = new Talon(1);
        LiveWindow.addActuator("Subsystem 1", "Speed Controller 2", (Talon) subsystem1SpeedController2);
        
        subsystem1RobotDrive21 = new RobotDrive(subsystem1SpeedController1, subsystem1SpeedController2);
        
        subsystem1RobotDrive21.setSafetyEnabled(true);
        subsystem1RobotDrive21.setExpiration(0.1);
        subsystem1RobotDrive21.setSensitivity(0.5);
        subsystem1RobotDrive21.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
