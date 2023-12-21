package ec.edu.espe.examenjimenez.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenjimenez.examen.dao.DocenteRepository;
import ec.edu.espe.examenjimenez.examen.domain.Docente;
import ec.edu.espe.examenjimenez.examen.domain.Especialidad;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public Docente buscarPorCedula(String cedula) {
        return docenteRepository.findByCedula(cedula);
    }

    public List<Docente> buscarPorEspecialidad(Especialidad especialidad) {
        return docenteRepository.findByEspecialidad(especialidad);
    }

    public List<Docente> buscarPorNombre(String nombre) {
        return docenteRepository.findByNombre(nombre);
    }

    public Docente crearDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

}