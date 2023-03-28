package googledrive.common;

import googledrive.UploadSectionCoreApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UploadSectionCoreApplication.class })
public class CucumberSpingConfiguration {}
