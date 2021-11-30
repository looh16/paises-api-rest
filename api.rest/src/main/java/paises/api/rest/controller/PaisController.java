package paises.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import paises.api.rest.model.Pais;
import paises.api.rest.service.IPaisService;




@CrossOrigin("*")
@RestController
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	private IPaisService paisService;

	@GetMapping
	public List<Pais> listarPaises() {

		return this.paisService.listarPaises();
	}
	
	@GetMapping(path = "/{ordenar}")
	public List<Pais> ordenarPorNome(
	      @RequestParam(defaultValue = "propriedade") String propriedade, 
	      @RequestParam(defaultValue = "ASC") Sort.Direction direcao) {
	    	  
	  return this.paisService.ordenarPaises(propriedade, direcao);
	  
	}

	
	@PostMapping
	public Pais adicionarPais(@RequestBody Pais pais) {

		return this.paisService.adicionarPais(pais);

	}
	

	@PutMapping(path = "/{identificador}")
    public Pais actualizarPais(@PathVariable("identificador") Long identificador, @RequestBody Pais pais) {
       
		
		return this.paisService.actualizarPais(identificador, pais);
		
    }
	

	@DeleteMapping("/{identificador}")
	public String EliminarPais(@PathVariable("identificador") Long identificador) {

		return this.paisService.apagarPais(identificador);
	}

}
