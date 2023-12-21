package ec.edu.espe.examenjimenez.examen.dao;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenjimenez.examen.domain.Materia;

public interface MateriaRepository extends CrudRepository<Materia, Long> {

    Materia findByNombre(String nombre);
}
