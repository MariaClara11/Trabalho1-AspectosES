package padroescriacao.factorymethod;

public class ServicoReserva implements IServico {

    public String executar() {
        return "Reserva confirmada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}
