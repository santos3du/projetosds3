package br.com.eduardo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
