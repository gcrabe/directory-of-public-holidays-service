package info.batyrev.solutions.directory.ofpublic.holidays.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service")
public class DPHController {

    @PostMapping(value = "/location/{location}")
    public ResponseEntity<?> getHolidaysByLocationAndDate(
            @PathVariable String locationCode,
            @RequestBody String dateTimeValue
    ) {
        String requestBody = getClass().getName() + "\r\n"
                + getClass().getEnclosingMethod().getName();
        return new ResponseEntity<>(requestBody, HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(value = "/location/{location}/year/{year}")
    public ResponseEntity<?> getHolidaysByLocationAndYear(
            @PathVariable String locationCode,
            @PathVariable String yearValue
    ) {
        String requestBody = getClass().getName() + "\r\n"
                + getClass().getEnclosingMethod().getName();
        return new ResponseEntity<>(requestBody, HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(value = "/location/{location}/year/{year}/month/{month}")
    public ResponseEntity<?> getHolidaysByLocationAndYearAndMonth(
            @PathVariable String locationCode,
            @PathVariable String yearValue,
            @PathVariable String monthValue
    ) {
        String requestBody = getClass().getName() + "\r\n"
                + getClass().getEnclosingMethod().getName();
        return new ResponseEntity<>(requestBody, HttpStatus.NOT_IMPLEMENTED);
    }
}
