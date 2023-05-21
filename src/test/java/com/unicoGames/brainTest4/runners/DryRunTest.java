package com.unicoGames.brainTest4.runners;


import com.unicoGames.brainTest4.utilities.DriverManager;
import com.unicoGames.brainTest4.utilities.GlobalParams;
import com.unicoGames.brainTest4.utilities.ServerManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/html-reports/cucumber.html",},
        features = "src/test/resources/features",
        glue = "com/unicoGames/brainTest4/stepDefinitions",
        tags = "@nahsen",
        dryRun = true
    )
public class DryRunTest extends AbstractTestNGCucumberTests {


    }
