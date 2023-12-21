package ec.edu.espe.examenjimenez.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenjimenez.examen.dao.EspecialidadRepository;
import ec.edu.espe.examenjimenez.examen.domain.Especialidad;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public Especialidad crearEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    public List<Especialidad> buscarEspecialidadesPorNombre(String texto) {
        return especialidadRepository.findByNombreContainingIgnoreCase(texto);
    }
}
