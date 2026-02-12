public class Main {

    public static void main(String[] args) {

        EstrategiaDeDesconto estrategia = new DescontoCupom();

        Pedido pedido = new Pedido(
                "001",
                1000.0,
                2,
                "cliente@email.com",
                estrategia
        );

        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double valorFinal = calculadora.aplicarDesconto(pedido);

        System.out.println("Valor com desconto: R$ " + valorFinal);
    }
}
