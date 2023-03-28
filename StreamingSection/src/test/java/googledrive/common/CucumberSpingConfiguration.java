package googledrive.common;

import googledrive.StreamingSectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StreamingSectionApplication.class })
public class CucumberSpingConfiguration {}
