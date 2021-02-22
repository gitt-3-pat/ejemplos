package info.jab.microservices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private PostalCodeService postalCodeService;

    @Autowired
    private MadridCitiesService madridCitiesService;

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
    }

    @PostMapping(
            path="/login",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(LoginCredential loginParam) {
        return "Ok";
    }

    @PostMapping(
            path="/login2",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login2(@RequestBody LoginCredential2 loginParam) {
        if ((loginParam.getUser().equals("DEMO")) &&
            (loginParam.getPassword().equals("DEMO"))) {
            return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"result\" : \"KO\"}", HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/postalcodes")
    public List<String> getPostalCodes() {
        return postalCodeService.getCodes();
    }

    @GetMapping("/cities")
    public List<String> getCities() {
        return madridCitiesService.getCities();
    }

}
