package dev.ved.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRespository;
    public List<Movie> allMovies(){
        return movieRespository.findAll();
    }
    public Optional<Movie> singlMovie(Object id){
        return movieRespository.findById(id);
    }
}
