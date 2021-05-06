package br.com.eduardo.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eduardo.dsvendas.dto.SellerDTO;
import br.com.eduardo.dsvendas.entities.Seller;
import br.com.eduardo.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> list = repository.findAll();
		return list.stream()
				.map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
