package at.jahodinsky.slm_test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/api/kilogram")
    public double kilogram(@RequestParam double stone) {
        return stone * 6.35;
    }
}
