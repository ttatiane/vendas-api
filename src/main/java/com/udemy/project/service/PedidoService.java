package com.udemy.project.service;

import com.udemy.project.domain.entity.Pedido;
import com.udemy.project.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO pedidoDTO);
}
