// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import frc.robot.commands.AutonomousCommand;
import frc.robot.commands.LimeLightTurn;
import frc.robot.commands.driveWithJoyStick;
import frc.robot.commands.idleBallShooter;
import frc.robot.commands.indexReverseOne;
import frc.robot.commands.reverseAcquisition;
import frc.robot.commands.setHoodToZero;
import frc.robot.commands.shiftDown;
import frc.robot.commands.shiftUp;
import frc.robot.commands.spinUp;
import frc.robot.commands.startAcquisition;
import frc.robot.commands.startShooter;
import frc.robot.commands.stopFlyWheel;
import frc.robot.commands.stopShooting;
import frc.robot.commands.teleopAutoShootCMD;
import frc.robot.subsystems.BallAcquisiton;
import frc.robot.subsystems.BallIndexer;
import frc.robot.subsystems.BallShooter;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shifter;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final Shifter m_shifter = new Shifter();
    public final BallShooter m_ballShooter = new BallShooter();
    public final BallIndexer m_ballIndexer = new BallIndexer();
    public final BallAcquisiton m_ballAcquisiton = new BallAcquisiton();
    public final DriveTrain m_driveTrain = new DriveTrain();

// Joysticks
private final Joystick driveJoystick = new Joystick(0);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems


    // SmartDashboard Buttons
    SmartDashboard.putData("driveWithJoyStick", new driveWithJoyStick( m_driveTrain ));
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("teleopAutoShootCMD", new teleopAutoShootCMD( m_ballShooter ));
    SmartDashboard.putData("setHoodToZero", new setHoodToZero( m_ballShooter ));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_ballShooter.setDefaultCommand(new idleBallShooter( m_ballShooter ) );
    m_driveTrain.setDefaultCommand(new driveWithJoyStick( m_driveTrain ) );


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons
final JoystickButton btnStopTeleopAutoShoot = new JoystickButton(driveJoystick, 3);        
btnStopTeleopAutoShoot.whenReleased(new teleopAutoShootCMD( m_ballShooter ) ,true);
    SmartDashboard.putData("btnStopTeleopAutoShoot",new teleopAutoShootCMD( m_ballShooter ) );

final JoystickButton btnTeleopAutoShoot = new JoystickButton(driveJoystick, 3);        
btnTeleopAutoShoot.whileHeld(new teleopAutoShootCMD( m_ballShooter ).withTimeout(10.0) ,true);
    SmartDashboard.putData("btnTeleopAutoShoot",new teleopAutoShootCMD( m_ballShooter ).withTimeout(10.0) );

final JoystickButton btnStopFlyWheel = new JoystickButton(driveJoystick, 4);        
btnStopFlyWheel.whenReleased(new stopFlyWheel( m_ballShooter ) ,true);
    SmartDashboard.putData("btnStopFlyWheel",new stopFlyWheel( m_ballShooter ) );

final JoystickButton btnSpinUp = new JoystickButton(driveJoystick, 4);        
btnSpinUp.whileHeld(new spinUp( m_ballShooter ) ,true);
    SmartDashboard.putData("btnSpinUp",new spinUp( m_ballShooter ) );

final JoystickButton btnReverseIndex = new JoystickButton(driveJoystick, 7);        
btnReverseIndex.whileHeld(new indexReverseOne( m_ballIndexer ).withTimeout(0.0) ,true);
    SmartDashboard.putData("btnReverseIndex",new indexReverseOne( m_ballIndexer ).withTimeout(0.0) );

final JoystickButton btnLimeLightTurn = new JoystickButton(driveJoystick, 9);        
btnLimeLightTurn.whenPressed(new LimeLightTurn( m_driveTrain ).withTimeout(5.0) ,true);
    SmartDashboard.putData("btnLimeLightTurn",new LimeLightTurn( m_driveTrain ).withTimeout(5.0) );

final JoystickButton btnStopShooter = new JoystickButton(driveJoystick, 5);        
btnStopShooter.whenReleased(new stopShooting( m_ballShooter ) ,true);
    SmartDashboard.putData("btnStopShooter",new stopShooting( m_ballShooter ) );

final JoystickButton btnStartShooter = new JoystickButton(driveJoystick, 5);        
btnStartShooter.whileHeld(new startShooter( m_ballShooter ) ,true);
    SmartDashboard.putData("btnStartShooter",new startShooter( m_ballShooter ) );

final JoystickButton btnShiftUp = new JoystickButton(driveJoystick, 12);        
btnShiftUp.whenPressed(new shiftUp( m_driveTrain ) ,true);
    SmartDashboard.putData("btnShiftUp",new shiftUp( m_driveTrain ) );

final JoystickButton btnShiftDown = new JoystickButton(driveJoystick, 11);        
btnShiftDown.whenPressed(new shiftDown( m_driveTrain ) ,true);
    SmartDashboard.putData("btnShiftDown",new shiftDown( m_driveTrain ) );

final JoystickButton btnReverseAcquire = new JoystickButton(driveJoystick, 2);        
btnReverseAcquire.whileHeld(new reverseAcquisition().withTimeout(3.0) ,false);
    SmartDashboard.putData("btnReverseAcquire",new reverseAcquisition().withTimeout(3.0) );

final JoystickButton btnAcquire = new JoystickButton(driveJoystick, 1);        
btnAcquire.whileHeld(new startAcquisition( m_ballAcquisiton ) ,true);
    SmartDashboard.putData("btnAcquire",new startAcquisition( m_ballAcquisiton ) );



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getDriveJoystick() {
        return driveJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

public Shifter getm_shifter(){
        return m_shifter;
    }

public DriveTrain getm_driveTrain(){
        return m_driveTrain;
}

public BallIndexer getm_ballIndexer(){
    return m_ballIndexer;
}
 
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

