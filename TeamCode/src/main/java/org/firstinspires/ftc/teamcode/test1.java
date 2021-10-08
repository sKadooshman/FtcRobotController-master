package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class test1 extends OpMode {

    Servo maneta;

    @Override
    public void init() {
        maneta = (Servo) hardwareMap.get("rampa");

    }

    @Override
    public void loop() {

        if(gamepad2.x){
            maneta.setPosition(0.8);
        }else{
            maneta.setPosition(0);
        }

    }
}
