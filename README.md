# 📖 OCP-Segundo Princípio

## O Problema: Violação do OCP
O código atual (na classe CalculadoraDeDesconto) lida com diferentes tipos de desconto usando condicionais (if/else ou switch) com base em um enum ou um tipo. O problema é que, toda vez que um novo tipo de desconto é adicionado, o desenvolvedor é obrigado a modificar a classe CalculadoraDeDesconto para incluir a nova regra.

Para não violar o príncipio, criamos novas classes com a implementação da funcionalidade "EstrategiaDeDesconto" em cada uma.
O Princípio Aberto-Fechado (OCP) afirma: uma entidade de software deve ser aberta para extensão, mas fechada para modificação.

## Demonstração da Extensão
É aberta para extensão: Cada vez que precisar criar uma nova implementação/funcionalidade, é só criar uma classe nova e extender da "EstrategiaDeDesconto".
Fechado para modificação: A classe CalculadoraDesconto não precisa ser alterada quando um novo desconto é criado. Ela apenas executa a estratégia recebida, independentemente de qual seja.


