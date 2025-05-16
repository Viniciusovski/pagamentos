package br.com.alurafood.pagamentos.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// A anotação @FeignClient é usada para declarar um cliente HTTP no Spring
@FeignClient("pedidos-ms")
public interface PedidoClient {
    /*
    Define que esse metodo responde a uma requisição HTTP do tipo PUT.
    A URL esperada é /pedidos/{id}/pago, onde {id} é um parâmetro de caminho (path variable),
    ou seja, parte dinâmica da URL. Faz o acesso a url de pedidos.
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/pedidos/{id}/pago")
    void atualizaPagamento(@PathVariable Long id);
}
