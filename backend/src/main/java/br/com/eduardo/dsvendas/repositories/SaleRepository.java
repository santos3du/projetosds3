package br.com.eduardo.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.eduardo.dsvendas.dto.SaleSuccessDTO;
import br.com.eduardo.dsvendas.dto.SaleSumDTO;
import br.com.eduardo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	@Query("SELECT new br.com.eduardo.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.eduardo.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
