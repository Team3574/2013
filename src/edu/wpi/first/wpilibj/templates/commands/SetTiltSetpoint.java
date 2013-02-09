/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DriverStation;

/**
 *
 * @author team3574
 */
public class SetTiltSetpoint extends CommandBase {
    
    public SetTiltSetpoint() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(thePizzaBoxTilt);
    }
    
    public void setpoint(double tiltCount){
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        thePizzaBoxTilt.setSetpoint(DriverStation.getInstance().getAnalogIn(3));
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