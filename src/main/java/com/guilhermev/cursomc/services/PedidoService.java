package com.guilhermev.cursomc.services;

import com.guilhermev.cursomc.domain.Pedido;
import com.guilhermev.cursomc.repositories.PedidoRepository;
import com.guilhermev.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repo;

    @Autowired
    public PedidoService(PedidoRepository repo) {
        this.repo = repo;
    }

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
