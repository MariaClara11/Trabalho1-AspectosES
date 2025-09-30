package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoReservaTest {

    @Test
    void deveExecutarReserva() {
        IServico servico = ServicoFactory.obterServico("Reserva");
        assertEquals("Reserva confirmada", servico.executar());
    }

    @Test
    void deveCancelarReserva() {
        IServico servico = ServicoFactory.obterServico("Reserva");
        assertEquals("Reserva cancelada", servico.cancelar());
    }
}
