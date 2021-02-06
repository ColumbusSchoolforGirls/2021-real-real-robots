package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public final class Limelight {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");//horizontal offset from crosshair to target from -29.8 to 29.8 degrees
    NetworkTableEntry ty = table.getEntry("ty");//vertical offset from crosshair to target from -24.85 to 24.85 degrees
    //NetworkTableEntry ta = table.getEntry("ta");
    NetworkTableEntry tv = table.getEntry("tv");//if there is a target, either 0 or 1, 1 means target
    
    double x = tx.getDouble(0.0);
    double y = ty.getDouble(0.0);
    boolean v = tv.getBoolean(false);
    //methods for idkkkkk
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public boolean getV(){
        return v;
    }
    //double area = ta.getDouble(0.0);
    
    
    public void teleopPeriodic() {
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("<variablename>").getDouble(0);
    
  
    }
    
}
