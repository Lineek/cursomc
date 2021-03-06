package com.guilhermev.cursomc.repositories;

import com.guilhermev.cursomc.domain.ItemPedido;
import com.guilhermev.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
