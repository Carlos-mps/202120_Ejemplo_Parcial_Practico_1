package co.edu.uniandes.dse.parcialejemplo.entities;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import uk.co.jemos.podam.common.PodamExclude;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MedicoEntity extends BaseEntity {
	
	private String nombre;
	private String registroMedico;
	private String especialidad;
	
	
}
