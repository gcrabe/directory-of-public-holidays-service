package info.batyrev.solutions.directory.ofpublic.holidays.webapp;

import info.batyrev.solutions.directory.ofpublic.holidays.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService = HealthCheckService.getInstance();

    @GetMapping(value = "/")
    public ResponseEntity<?> index() {
        String responseContent = healthCheckService.getStatusInformation();
        return new ResponseEntity<>(responseContent, HttpStatus.OK);
    }
}
