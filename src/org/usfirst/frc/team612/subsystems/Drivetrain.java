package org.usfirst.frc.team612.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import org.usfirst.frc.team612.robot.RobotMap;
import org.usfirst.frc.team612.commands.DefaultDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	WPI_TalonSRX talon_FR = new WPI_TalonSRX(RobotMap.talon_FR);
	WPI_TalonSRX talon_FL = new WPI_TalonSRX(RobotMap.talon_FL);
	WPI_TalonSRX talon_RR = new WPI_TalonSRX(RobotMap.talon_RR);
	WPI_TalonSRX talon_RL = new WPI_TalonSRX(RobotMap.talon_RL);
	MecanumDrive drivetrain;
	
	public Drivetrain() {
		//talon_FR.setInverted(true);
		//talon_RR.setInverted(true);
		//talon_RL.setInverted(true);
		drivetrain = new MecanumDrive(talon_FL, talon_RL, talon_FR, talon_RR);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DefaultDrive());
    }
    
    public MecanumDrive getDriveTrain() {
    	return drivetrain;
    }
}

