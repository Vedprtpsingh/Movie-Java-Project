package dev.ved.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> allMovies() {
        return new ResponseEntity<String>("All movies",HttpStatus.OK);
    }
}
