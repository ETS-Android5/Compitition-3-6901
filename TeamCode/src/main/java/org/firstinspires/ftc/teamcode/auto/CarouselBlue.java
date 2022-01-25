package org.firstinspires.ftc.teamcode.auto;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.drive.Robot;
import org.firstinspires.ftc.teamcode.trajectorysequenceimproved.TrajectorySequence;

@Autonomous(name="Auton 69: Carousel blue")

public class CarouselBlue extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot drive = new Robot(this);

        TrajectorySequence myTrajectory =  drive.trajectorySequenceBuilder(new Pose2d( -31, 61, Math.toRadians(-90)))
                .setReversed(true)
                .forward(5)
                .turn(Math.toRadians(90))
                .splineTo(new Vector2d(-52, 58),  Math.toRadians(180))
                .waitSeconds(4)
                .turn(Math.toRadians(-90))
                .forward(30)
                .setReversed(false)
                .splineTo(new Vector2d(-29, 23), Math.toRadians(0))
                .waitSeconds(4)
                .setReversed(true)
//                                .splineTo(new Vector2d(-60,-33), Math.toRadians(180))
                .back(30)
                .turn(Math.toRadians(-90))
                .back(12)
                .build();

        waitForStart();

        if(isStopRequested()) return;

        drive.followTrajectorySequence(myTrajectory);
    }
}