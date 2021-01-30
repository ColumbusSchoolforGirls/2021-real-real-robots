// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//

package frc.robot;

//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically it contains the code
 * necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  //private double m_leftStick;
  //private double m_rightStick;
  // comment to test 
  private XboxController m_controller;
  private SpeedControllerGroup leftGroup;
  private SpeedControllerGroup rightGroup;

  @Override
  public void robotInit() {
    leftGroup = new SpeedControllerGroup(new Spark(0), new Spark(1));
    rightGroup = new SpeedControllerGroup(new Spark(2), new Spark(3));
    m_myRobot = new DifferentialDrive(leftGroup,rightGroup);
    //m_leftStick = new XboxController(0).getY(kLeft);
   // m_rightStick = new XboxController(0).getY(kRight);
    m_controller = new XboxController(0);
  }

  @Override
  public void teleopPeriodic() {
    m_myRobot.tankDrive(-m_controller.getY(Hand.kLeft), -m_controller.getY(Hand.kRight));
    
    
  }
}
