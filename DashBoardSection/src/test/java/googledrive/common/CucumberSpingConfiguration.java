package googledrive.common;

import googledrive.DashBoardSectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashBoardSectionApplication.class })
public class CucumberSpingConfiguration {}
