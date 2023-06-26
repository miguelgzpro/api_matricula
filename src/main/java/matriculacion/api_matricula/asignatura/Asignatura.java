package matriculacion.api_matricula.asignatura;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import matriculacion.api_matricula.tipo_asignatura.TipoAsignatura;

@Data
@Entity


public class Asignatura {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha_aprobacion;
    private String nombre;

     @ManyToOne
    private TipoAsignatura tipoasignatura;

}
