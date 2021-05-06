package pl.pjatk.zuzcib;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class Homework4RestController {

    @GetMapping("/param/value")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/path/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/request/someValue")
    public ResponseEntity<String> putRequestBody(@RequestBody String someValue){
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/path/{someValue}")
    public ResponseEntity<String> putPathVariable(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("/someValue")
    public ResponseEntity<String> postRequestBody(@RequestBody String someValue){
        return ResponseEntity.ok(someValue);
    }

    @DeleteMapping("/{someValue}")
    public ResponseEntity<HttpStatus> deletePathVariable(@PathVariable String someValue){
        return ResponseEntity.ok().build();
    }

}
