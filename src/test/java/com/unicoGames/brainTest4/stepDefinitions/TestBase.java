package com.unicoGames.brainTest4.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.AltPortForwarding;
import com.unicoGames.brainTest4.utilities.DriverManager;
import org.testng.annotations.BeforeTest;

public class TestBase {
    AltDriver altDriver;
    @BeforeTest
    public void setUp(){
        AltPortForwarding.forwardAndroid();
        altDriver = new DriverManager().getAltDriver();
    }
}
