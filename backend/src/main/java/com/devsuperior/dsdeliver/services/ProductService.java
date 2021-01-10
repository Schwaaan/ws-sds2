package com.devsuperior.dsdeliver.services;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Transactional(readOnly = true)
  public List<ProductDTO> findAll() {
    List<Product> list = productRepository.findAllByOrderByNameAsc();
    return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
  }

}