package info.batyrev.solutions.directory.ofpublic.holidays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DPHController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/country/{country}")
    public String getHolidaysByCountry(@PathVariable String country) {
        String countryCode = country.toLowerCase();

        if ("kz".equals(countryCode)) {
            StringBuilder result = new StringBuilder("{");

            String[] array = new String[] {
                    "01-01-23",
                    "02-01-23",
                    "21-03-23",
                    "22-03-23",
                    "23-03-23",
                    "01-05-23",
                    "07-05-23",
                    "09-05-23",
                    "06-07-23",
                    "30-08-23",
                    "01-12-23",
                    "16-12-23"
            };

            for (int i = 0; i < array.length - 1; i++) {
                result.append("\"").append(array[i]).append("\",");
            }
            result.append("\"").append(array[array.length - 1]).append("\"}");

            return result.toString();
        }

        return "{\"The country is not supported yet\"}";
    }
}
