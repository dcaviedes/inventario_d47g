package com.d47g.empresas.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.d47g.empresas.models.entity.Empresa;

public interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Long> {

}
