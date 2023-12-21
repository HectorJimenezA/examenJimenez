package ec.edu.espe.examenjimenez.examen.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenjimenez.examen.dao.DocenteRepository;

@Service
public class DocenteService {


    @Autowired
    private DocenteRepository docenteRepository;
    
}
