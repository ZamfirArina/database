package oop.md.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MoviesRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Movies> findAll() {
        return jdbcTemplate.query("SELECT*FROM movies",
                (response, rowNumber) ->
                        new Movies(response.getLong("id"),
                                response.getString("genre"),
                                response.getString("title"),
                                response.getInt("year"),
                                response.getString("country"),
                                response.getString("staringRole")));

    }


    public void save (Movies movies){
        jdbcTemplate.update(
                "INSERT INTO movies( genre, title, year,country,staringRole) VALUES (?,?,?,?,?)",
                movies.getGenre(), movies.getTitle(), movies.getYear(), movies.getCountry(), movies.getStaringRole());
    }

    public void delete(String genre){
        jdbcTemplate.update("DELETE FROM movies WHERE genre=?",genre);

    }
}
