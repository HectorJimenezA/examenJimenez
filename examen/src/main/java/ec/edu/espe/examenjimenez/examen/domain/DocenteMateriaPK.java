package ec.edu.espe.examenjimenez.examen.domain;

import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class DocenteMateriaPK implements Serializable{


    @Column(name = "COD_DOCENTE", nullable = false)
    private Integer docente;

    @Column(name = "COD_MATERIA", nullable = false)
    private Integer materia;

    public DocenteMateriaPK(Integer docente, Integer materia) {
        this.docente = docente;
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((docente == null) ? 0 : docente.hashCode());
        result = prime * result + ((materia == null) ? 0 : materia.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DocenteMateriaPK other = (DocenteMateriaPK) obj;
        if (docente == null) {
            if (other.docente != null)
                return false;
        } else if (!docente.equals(other.docente))
            return false;
        if (materia == null) {
            if (other.materia != null)
                return false;
        } else if (!materia.equals(other.materia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DocenteMateriaPK [docente=" + docente + ", materia=" + materia + "]";
    }
    
    
}
