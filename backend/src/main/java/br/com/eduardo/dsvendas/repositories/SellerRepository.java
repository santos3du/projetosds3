package br.com.eduardo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
