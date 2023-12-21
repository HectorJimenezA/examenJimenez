package ec.edu.espe.examenjimenez.examen.domain;
import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DOCENTE_MATERIA")
public class DocenteMateria {


    @EmbeddedId
    private DocenteMateriaPK docenteMateriaPK;

    @Column(name = "PERIODO", nullable = false, length = 10)
    private String periodo;

    @Column(name = "ALUMNOS_MATRICULADOS", nullable = false, length = 2)
    private Long alumnosMatriculados;

    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @Column(name = "PROMEDIO_CURSO", nullable = false, length = 4, scale = 2)
    private String promedioCurso;

    @Column(name = "FECHA_ULTIMO_CAMBIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaUltimoCambio;



    public DocenteMateria(DocenteMateriaPK docenteMateriaPK) {
        this.docenteMateriaPK = docenteMateriaPK;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((docenteMateriaPK == null) ? 0 : docenteMateriaPK.hashCode());
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
        DocenteMateria other = (DocenteMateria) obj;
        if (docenteMateriaPK == null) {
            if (other.docenteMateriaPK != null)
                return false;
        } else if (!docenteMateriaPK.equals(other.docenteMateriaPK))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "DocenteMateria [docenteMateriaPK=" + docenteMateriaPK + ", periodo=" + periodo
                + ", alumnosMatriculados=" + alumnosMatriculados + ", estado=" + estado + ", promedioCurso="
                + promedioCurso + ", fechaUltimoCambio=" + fechaUltimoCambio + ", version=" + version + "]";
    }



    @Version long version;
}
