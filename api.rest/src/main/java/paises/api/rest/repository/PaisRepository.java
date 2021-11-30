package paises.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paises.api.rest.model.Pais;


public interface PaisRepository extends JpaRepository<Pais, Long>{

}
