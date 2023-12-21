package ec.edu.espe.examenjimenez.examen.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenjimenez.examen.domain.Docente;
import ec.edu.espe.examenjimenez.examen.domain.Especialidad;

public interface DocenteRepository extends CrudRepository<Docente, Long> {

    Docente findByCedula(String cedula);
    List<Docente> findByEspecialidad(Especialidad especialidad);
    List<Docente> findByNombre(String nombre);
}
