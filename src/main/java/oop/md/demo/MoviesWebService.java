package oop.md.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesWebService {

    @Autowired
    private MoviesRepository moviesRepository;

    @GetMapping
    public List<Movies> findAll() {
        return moviesRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Movies movies) {
        moviesRepository.save(movies);
    }

    @DeleteMapping("/{genre}")
    public void delete(@PathVariable String genre) {
        moviesRepository.delete(genre);
    }
}
