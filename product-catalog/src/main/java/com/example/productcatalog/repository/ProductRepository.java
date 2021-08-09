package com.example.productcatalog.repository;

import com.example.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

//Para chamar os metodos de gerenciamento de entidades no Spring
//é necessário extender a classe CrudRepository a especificar a <entidade, tipo da chave primaria>
public interface ProductRepository extends CrudRepository<Product, Integer> {



}
