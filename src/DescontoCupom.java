public class DescontoCupom implements EstrategiaDeDesconto {
    @Override
    public double aplicar(Pedido pedido) {
        return pedido.getValorBruto() * 0.90;
    }
}
