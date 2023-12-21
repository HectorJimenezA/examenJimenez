package ec.edu.espe.examenjimenez.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenjimenez.examen.dao.DocenteMateriaRepository;
import ec.edu.espe.examenjimenez.examen.domain.DocenteMateria;

@Service
public class DocenteMateriaService {

    @Autowired
    private DocenteMateriaRepository docenteMateriaRepository;

    public List<DocenteMateria> buscarPorPeriodoYEstado(String periodo, String estado) {
        return docenteMateriaRepository.findByPeriodoAndEstado(periodo, estado);
    }

    // Puedes añadir más métodos de servicio según tus necesidades

}
