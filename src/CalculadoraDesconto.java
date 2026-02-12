public class CalculadoraDesconto {

    public double aplicarDesconto(Pedido pedido) {

        return pedido.getTipoDesconto().aplicar(pedido);
    }

}
