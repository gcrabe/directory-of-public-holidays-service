package info.batyrev.solutions.directory.ofpublic.holidays.service;

import ch.qos.logback.core.util.SystemInfo;
import info.batyrev.solutions.directory.ofpublic.holidays.utils.Constants;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

@Service
public class HealthCheckService {

    @Autowired
    private static HealthCheckService instance;

    private HealthCheckService() {}

    public static HealthCheckService getInstance() {
        if (instance == null) {
            instance = new HealthCheckService();
        }

        return instance;
    }

    public String getStatusInformation() {
        String javaVendor = SystemInfo.getJavaVendor();
        String javaVersion = Runtime.version().toString();
        String osName = System.getProperty("os.name");
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("java_vendor", javaVendor);
        resultMap.put("java_version", javaVersion);
        resultMap.put("os", osName);
        resultMap.put("uptime", String.valueOf(uptime));
        resultMap.put("build", Constants.BUILD_VERSION);
        resultMap.put("health_check_status", "works");

        JSONObject resultJson = new JSONObject(resultMap);
        return resultJson.toJSONString();
    }
}
