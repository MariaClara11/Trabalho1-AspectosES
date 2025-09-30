package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEntregaTest {

    @Test
    void deveExecutarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega em andamento", servico.executar());
    }

    @Test
    void deveCancelarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega cancelada", servico.cancelar());
    }
}
