public class DescontoVip implements EstrategiaDeDesconto {
    @Override
    public double aplicar(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}
