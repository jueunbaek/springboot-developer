package ne.bje;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hi")
    public String hi() {
        return "안녕하세요 'http://localhost:8080/hi' 에 대한 응답입니다.";
    }

    @GetMapping("/test")
    public String test() {
        return "안녕하세요 'http://localhost:8080/test' 에 대한 응답입니다.";
    }
    @PutMapping("/test")
    public String puttest() {
        return "안녕하세요 'http://localhost:8080/TestPut' 에 대한 응답입니다.";
    }
    @PostMapping("/test")
    public String posttest() {
        return "안녕하세요 'http://localhost:8080/PostTest' 에 대한 응답입니다.";
    }
    @DeleteMapping("/test")
    public String deletetest() {
        return "안녕하세요 'http://localhost:8080/DeleteMapping' 에 대한 응답입니다.";
    }
}