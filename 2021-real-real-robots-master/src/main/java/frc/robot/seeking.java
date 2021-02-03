package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class seeking 
{
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tv = table.getEntry("tv");
    NetworkTableEntry tx = table.getEntry("tx");

    double steeringAdjust = 0.0;

    if(tv==0.0) {
        steeringAdjust = 0.3;
    }
    
    else
    {
        double headingerror = x;
        steeringAdjust = -0.1*x;
    }
}