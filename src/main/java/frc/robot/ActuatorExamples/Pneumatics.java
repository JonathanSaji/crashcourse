package frc.robot.ActuatorExamples;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Pneumatics {
    public static void main(String[] args) {
        //compressor plugs into the pneumatic control module which takes air and compresses into a tank
        final Compressor c = new Compressor(PneumaticsModuleType.REVPH);
        //methods
        c.getCurrent(); //get compressor current draw
        c.isEnabled(); //whether the compressor is active or not
        c.getPressureSwitchValue(); //true when pressure is over ~120 PSI
        c.enableAnalog(70,120);//controlling the minimum and maximum pressure
        c.enableHybrid(70,120);
    }
}
