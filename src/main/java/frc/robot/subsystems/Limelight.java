package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PIDCalculator;
import frc.robot.subsystems.Drivetrain;

public final class Limelight extends SubsystemBase{
    public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");
    NetworkTableEntry ty = table.getEntry("ty");
    NetworkTableEntry ta = table.getEntry("ta");
    
    //read values periodically
    double x = tx.getDouble(0.0);
    double y = ty.getDouble(0.0);
    double area = ta.getDouble(0.0);
    
    //the stuff from the docs that was in c++??
    double tv =  NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
    double steering_adjust;
    double heading_error = x;

    public void teleopPeriodic() {
        
        if(tv == 0.0){
            steering_adjust = 0.3;
            //we don't know whats happening?
            //what is steering adjust????? sadness >:()
            //maybe try setting to current speed (get that somehow) + steering_adjust
            Drivetrain.left_front.set(steering_adjust);
            right_front -= steering_adjust;
        }else{
            
            steering_adjust = heading_error;
        }

        //puts values on dashboard periodically
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);
        //I don't think "<variable name>" is actually a thing???
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("<variablename>").getDouble(0);
    }
    
}