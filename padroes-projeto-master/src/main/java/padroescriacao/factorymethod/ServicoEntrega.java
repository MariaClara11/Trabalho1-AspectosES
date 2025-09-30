package padroescriacao.factorymethod;

public class ServicoEntrega implements IServico {

    public String executar() {
        return "Entrega em andamento";
    }

    public String cancelar() {
        return "Entrega cancelada";
    }
}
