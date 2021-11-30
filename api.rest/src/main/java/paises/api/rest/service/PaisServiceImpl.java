package paises.api.rest.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paises.api.rest.model.Pais;
import paises.api.rest.repository.PaisRepository;

import org.springframework.data.domain.Sort;




@Service
public class PaisServiceImpl implements IPaisService{

	@Autowired
	private PaisRepository paisRepository;
	 
	@Override
	public List<Pais> listarPaises() {
		
		return this.paisRepository.findAll();
	}

	@Override
	public Pais adicionarPais(Pais pais) {
		
		return this.paisRepository.save(pais);
	}
	
	

	@Override
	public String apagarPais(Long identificador) {
			
        this.paisRepository.deleteById(identificador);
        
        return "Pais Apagado com Sucesso!!!";
         
    }

	@Override
	public Pais actualizarPais(Long identificador, Pais pais) {
		pais.setIdentificador(identificador);	
		return this.paisRepository.save(pais);
	}
	

	@Override
	public List<Pais> ordenarPaises(String propriedade, Sort.Direction direcao) {

		return paisRepository.findAll(Sort.by(direcao, propriedade));

	}
	
   
	
	
}
