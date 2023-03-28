package googledrive.common;

import googledrive.PostUploadSectionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PostUploadSectionApplication.class })
public class CucumberSpingConfiguration {}
