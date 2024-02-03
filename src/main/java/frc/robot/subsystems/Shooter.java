package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel;

import edu.wpi.first.hal.CANAPITypes.CANDeviceType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;



public class Shooter extends SubsystemBase{
    private static Shooter m_instance;

    public CANSparkMax forwardMotor;
    public CANSparkMax reverseMotor;

    public double f_speed;
    public double r_speed;
    public double temp_f_speed;
    public double temp_r_speed;
    public boolean on;
    public Timer m_timer;

    public static Shooter getInstance(){
        if (m_instance == null){
          m_instance = new Shooter();
        }
        return m_instance;
      }


    private Shooter(){
        forwardMotor = new CANSparkMax(10, CANSparkLowLevel.MotorType.kBrushless); //BRUSHED (set to brushless for sim)
        //reverseMotor = new CANSparkMax(9, CANSparkLowLevel.MotorType.kBrushless); //BRUSHLESS FOR INTAKE, BRUSHED FOR SHOOTER
        on = false;

    }
    
}
