package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPedidoTest {

    @Test
    void deveExecutarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido realizado", servico.executar());
    }

    @Test
    void deveCancelarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido cancelado", servico.cancelar());
    }
}
