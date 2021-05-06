package pl.pjatk.zuzcib;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class JazRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> someValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/abc")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getModel(){
        Car car = new Car("Mini");
        return ResponseEntity.ok(car);
    }
}
