package info.batyrev.solutions.directory.ofpublic.holidays.webapp;

import ch.qos.logback.core.util.SystemInfo;
import info.batyrev.solutions.directory.ofpublic.holidays.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping(value = "/")
    public ResponseEntity<?> index() {
        String javaVendor = SystemInfo.getJavaVendor();
        String javaVersion = Runtime.version().toString();
        String osName = System.getProperty("os.name");
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();

        Map<String, String> resultContainer = new HashMap<>();
        resultContainer.put("java_vendor", javaVendor);
        resultContainer.put("java_version", javaVersion);
        resultContainer.put("os", osName);
        resultContainer.put("uptime", String.valueOf(uptime));
        resultContainer.put("build", Constants.BUILD_VERSION);
        resultContainer.put("health_check_status", "OK");

        return new ResponseEntity<>(resultContainer.toString(), HttpStatus.OK);
    }
}
