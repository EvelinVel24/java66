package main.java.principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.servicio.PeliculaServicio;
import principal.modelo.Pelicula;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    private final PeliculaServicio peliculaServicio;

    public MainApplication(PeliculaServicio peliculaServicio) {
        this.peliculaServicio = peliculaServicio;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Pelicula pelicula = new Pelicula(1, "Matrix", "Lana Wachowski", 1999, 136);
        peliculaServicio.agregarPelicula(pelicula);
        
        // Ejecutar otras operaciones de CRUD y mostrar mensajes de consola
    }
}
