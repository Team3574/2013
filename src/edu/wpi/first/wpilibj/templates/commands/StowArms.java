/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.subsystems.Lifter;

/**
 *
 * @author team3574
 */
public class StowArms extends CommandBase {
    
    public StowArms() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires (theLifter);
        this.setTimeout(0.5);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        theLifter.stowLifterArms();
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (this.timeSinceInitialized() > 0.3){
            theLifter.stowDeployedArms();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
