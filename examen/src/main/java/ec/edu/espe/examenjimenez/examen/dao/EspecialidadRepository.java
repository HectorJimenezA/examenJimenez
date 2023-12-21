package ec.edu.espe.examenjimenez.examen.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenjimenez.examen.domain.Especialidad;

public interface EspecialidadRepository extends CrudRepository<Especialidad, String> {

    List<Especialidad> findByNombreContainingIgnoreCase(String texto);
    List<Especialidad> findByNombre(Especialidad nombre);
}
