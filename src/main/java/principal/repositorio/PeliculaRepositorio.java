package main.java.principal.repositorio;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import principal.modelo.Pelicula;
import java.util.List;

@Repository
public class PeliculaRepositorio {
    private final JdbcTemplate jdbcTemplate;

    public PeliculaRepositorio(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Método para insertar película
    public void insertar(Pelicula pelicula) {
        String sql = "INSERT INTO pelicula (id, titulo, director, año, duracion) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, pelicula.getId(), pelicula.getTitulo(), pelicula.getDirector(), pelicula.getAño(), pelicula.getDuracion());
    }

    // Método para leer películas
    public List<Pelicula> leerTodos() {
        String sql = "SELECT * FROM pelicula";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Pelicula(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("director"),
                rs.getInt("año"),
                rs.getInt("duracion")
        ));
    }

    // Métodos de actualización y eliminación con manejo de excepciones
    // ...
}
