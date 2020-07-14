package com.tinnova.veiculos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tinnova.veiculos.Model.VeiculoModel;

public interface VeiculoRepository extends JpaRepository<VeiculoModel,Long> {
	@Query(value = "SELECT * FROM tb_veiculo WHERE descricao LIKE %:q", nativeQuery=true)
	List<VeiculoModel> findParam(@Param("q") String q);
}
