// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.EncoderType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  //makes motor variables? maybe? idrk?
  //need to change port numbers (is that what they are?) to robot map things
  private final CANSparkMax right_front = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax left_front = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax right_back = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax left_back = new CANSparkMax(4, MotorType.kBrushless);

//THE ENCODER CODE CHANGED SO WE DON'T KNOW WHAT TO DO ABOUT THAT
//need to look

  public Drivetrain() {
 }

  public void Wheelspeed(double rightspeed, double leftspeed){
    //sets wheel speed (rights the same/lefts the same)
    right_front.set(rightspeed);
    left_front.set(-leftspeed);
    right_back.set(rightspeed);
    left_back.set(-leftspeed);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
