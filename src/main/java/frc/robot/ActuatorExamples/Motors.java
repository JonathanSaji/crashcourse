package frc.robot.ActuatorExamples;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Motors {
    public static void main(String[] args) {
        //motors
        Victor motor = new Victor(2);

        //Motor speed can be set from -1.0 - 1.0
        //has to be set again to change

        motor.set(1.0);  //highest speed (forwards)
        motor.set(-1.0); //highest speed (backwards)
        motor.set(0.0);  //stops
        //this code goes to the motor controller which amplifies the power and sends it to the motors
    }
}
