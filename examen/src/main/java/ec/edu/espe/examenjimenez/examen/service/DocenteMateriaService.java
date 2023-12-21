package ec.edu.espe.examenjimenez.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenjimenez.examen.dao.DocenteMateriaRepository;


@Service
public class DocenteMateriaService {

    @Autowired
    private DocenteMateriaRepository docenteMateriaRepository;
}
