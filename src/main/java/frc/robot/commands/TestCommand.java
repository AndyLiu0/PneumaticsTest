// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


import frc.robot.Constants.PortConstants;


public class TestCommand extends Command {
  /** Creates a new TestCommand. */
  private Pneumatics m_pneumatics;
  private int mode;

  public TestCommand(Pneumatics m_pneumatics, int mode) {
    addRequirements(m_pneumatics);
    this.m_pneumatics = m_pneumatics;
    this.mode = mode;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (mode == -1){
      System.out.println("-1");
      m_pneumatics.m_solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    if (mode == 0){ 
      System.out.println("0");
      m_pneumatics.m_solenoid.set(DoubleSolenoid.Value.kOff);
    }
    if (mode == 1){
      System.out.println("1");
      m_pneumatics.m_solenoid.set(DoubleSolenoid.Value.kForward);
    }
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
