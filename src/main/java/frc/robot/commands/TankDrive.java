// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */

  private final Drivetrain m_drivetrain;

  public TankDrive(Drivetrain drivetrain) {
    // Use addRequirements() here to bring subsystem in
    m_drivetrain = drivetrain;
    addRequirements(m_drivetrain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //sets wheelspeed to 0 when it turns on
    m_drivetrain.Wheelspeed(0,0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  //this is all mad bc we don't have RobotContainer yet, we'll fix that at some point   
  /**
    if (Math.abs(RobotContainer.driveCont.getRawAxis(5)) <= Global.DEADZONE
    && Math.abs(RobotContainer.driveCont.getRawAxis(1)) <= Global.DEADZONE) {
  m_drivetrain.Wheelspeed(0, 0);
} else if (Math.abs(RobotContainer.driveCont.getRawAxis(5)) <= Global.DEADZONE
    && Math.abs(RobotContainer.driveCont.getRawAxis(1)) > Global.DEADZONE) {
  m_drivetrain.Wheelspeed(0, 0.5*RobotContainer.driveCont.getRawAxis(1));
} else if (Math.abs(RobotContainer.driveCont.getRawAxis(5)) > Global.DEADZONE
    && Math.abs(RobotContainer.driveCont.getRawAxis(1)) <= Global.DEADZONE) {
    m_drivetrain.Wheelspeed(0.5*RobotContainer.driveCont.getRawAxis(5), 0);
} else {
  m_drivetrain.Wheelspeed(0.5*RobotContainer.driveCont.getRawAxis(5), 0.5*RobotContainer.driveCont.getRawAxis(1));
}
*/
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //sets wheelspeed to 0 when the robot is turned off
    m_drivetrain.Wheelspeed(0.00001,0.00001);
    interrupted = false;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
