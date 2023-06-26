package matriculacion.api_matricula.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity


public class Matricula {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        private Integer persona_id;
    private Integer nro_matricula;


}

