package co.edu.uniandes.dse.parcialejemplo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialejemplo.entities.MedicoEntity;
import co.edu.uniandes.dse.parcialejemplo.repositories.MedicoRepository;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class MedicoService {
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Transactional
	public List<MedicoEntity> getMedicos(){
		log.info("Inicial el proceso para obtener a todos los medicos");
		return medicoRepository.findAll();
	}

}
