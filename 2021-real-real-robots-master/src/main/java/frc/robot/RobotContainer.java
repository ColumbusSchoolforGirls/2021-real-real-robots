package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.TankDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class RobotContainer {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a
    //// joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
  
    //creates the joysick in the code
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
  
    SendableChooser<Command> m_chooser = new SendableChooser<>();
  
    //Changed to public static final to be able to use them across the board and in auto
    //If commands do not work b/c of this, make it private final and figure out how to 
    //pass the subsystem to the auto commands
    public final Drivetrain driveTrain = new Drivetrain();
    //public final ConveyorMotors conveyorMotors = new ConveyorMotors();

    public final TankDrive TankDrive = new TankDrive(driveTrain);
    //public final ConveyorManual ConveyorManual = new ConveyorManual(0, conveyorMotors, false);
    //private final FullSpeedAhead FullSpeedAhead = new FullSpeedAhead(driveTrain);
    
  
  
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    public static Joystick driveCont = new Joystick(Global.JoystickDrive);
    public static Joystick auxCont = new Joystick(Global.JoystickAux);
  
  
    public static Button auxButtonA = new JoystickButton(auxCont, Global.BUTTON_A);
    public static Button auxButtonY = new JoystickButton (auxCont, Global.BUTTON_Y);
    public static Button auxButtonB = new JoystickButton(auxCont, Global.BUTTON_B);
    public static Button auxButtonX = new JoystickButton(auxCont, Global.BUTTON_X);
    public static Button auxStart = new JoystickButton(auxCont, Global.START);
    public static Button auxRightBumper = new JoystickButton(auxCont, Global.RIGHT_BUMPER);
    public static Button auxLeftBumper = new JoystickButton(auxCont, Global.LEFT_BUMPER);
    public static JoystickAnalogButton rightTrigger = new JoystickAnalogButton(driveCont, 3, .5);
    public static JoystickAnalogButton auxRightTrigger = new JoystickAnalogButton(auxCont, 3,.5);
    
    
    public RobotContainer () {
      this.configureButtonBindings();
      //initializes TankDrive
      driveTrain.setDefaultCommand(TankDrive);
    }
    
    private void configureButtonBindings(){
      
      //rightTrigger.whileHeld(new FullSpeedAhead(driveTrain));
   
    }
    
  
    }
   
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
  
  
    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
  