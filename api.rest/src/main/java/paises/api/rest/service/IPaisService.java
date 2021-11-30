package paises.api.rest.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import paises.api.rest.model.Pais;



public interface IPaisService {

	public List<Pais> listarPaises();
	
	public Pais adicionarPais(Pais pais);
	
	public Pais actualizarPais(Long identificador, Pais pais);
		
	public String apagarPais(Long identificador);
	
	public List<Pais> ordenarPaises(String propriedade, Sort.Direction direcao);
		
}
