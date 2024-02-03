// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Compressor;


import frc.robot.Constants.PortConstants;


public class ToggleCompressor extends Command {
  /** Creates a new TestCommand. */
  private Pneumatics m_pneumatics;
  private Compressor m_compressor;
  private int mode;

  public ToggleCompressor(Pneumatics m_pneumatics) {
    addRequirements(m_pneumatics);
    this.m_pneumatics = m_pneumatics;
    this.m_compressor = m_compressor;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (m_compressor.isEnabled()){
      m_compressor.disable();
    } else {
      m_compressor.enableDigital();
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
