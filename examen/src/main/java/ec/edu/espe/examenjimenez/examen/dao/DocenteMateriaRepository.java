package ec.edu.espe.examenjimenez.examen.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import ec.edu.espe.examenjimenez.examen.domain.DocenteMateria;

public interface DocenteMateriaRepository extends CrudRepository<DocenteMateria, Long> {

    List<DocenteMateria> findByPeriodoAndEstado(String periodo,String estado);
}
