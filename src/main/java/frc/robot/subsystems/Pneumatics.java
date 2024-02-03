package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Pneumatics extends SubsystemBase{
    private static Pneumatics m_instance;

    public Compressor m_compressor;
    public DoubleSolenoid m_solenoid;

    public static Pneumatics getInstance(){
      System.out.println("pneumaticsinstancs");
        if (m_instance == null){
          m_instance = new Pneumatics();
        }
        return m_instance;
      }

    private Pneumatics(){
        m_solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1); //CHANGE CHANNEL VALUES
        m_compressor = new Compressor(PneumaticsModuleType.CTREPCM); //FIGURE OUT HOW THIS WORKS
        m_compressor.enableDigital();
        //m_compressor.disable();
        System.out.println("pneumatics init");
    }
}
