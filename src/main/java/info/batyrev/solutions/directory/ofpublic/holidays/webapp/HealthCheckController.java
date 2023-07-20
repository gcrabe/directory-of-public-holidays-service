package info.batyrev.solutions.directory.ofpublic.holidays.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private static final String HEALTH_CHECK_OK_MESSAGE = "Health check status: OK";

    @GetMapping(value = "/")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>(HEALTH_CHECK_OK_MESSAGE, HttpStatus.OK);
    }
}
