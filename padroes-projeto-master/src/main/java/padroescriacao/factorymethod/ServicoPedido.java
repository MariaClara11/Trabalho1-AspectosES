package padroescriacao.factorymethod;

public class ServicoPedido implements IServico {

    public String executar() {
        return "Pedido realizado";
    }

    public String cancelar() {
        return "Pedido cancelado";
    }
}
