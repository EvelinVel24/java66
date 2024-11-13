package main.java.principal.servicio;

import org.springframework.stereotype.Service;
import principal.modelo.Pelicula;
import principal.repositorio.PeliculaRepositorio;
import java.util.Optional;

@Service
public class PeliculaServicio {
    private final PeliculaRepositorio repositorio;

    public PeliculaServicio(PeliculaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    // Métodos CRUD con mensajes personalizados
    public void agregarPelicula(Pelicula pelicula) {
        try {
            repositorio.insertar(pelicula);
        } catch (Exception e) {
            System.out.println("Error: Id ya registrada.");
        }
    }

    // Otros métodos (actualizar, eliminar, obtener) con manejo de excepciones
}
