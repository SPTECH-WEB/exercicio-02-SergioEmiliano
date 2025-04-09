1. Strategy
   O padrão Strategy é utilizado para encapsular diferentes formas de executar uma mesma tarefa.
   Ele possibilita a alteração do comportamento de uma classe em tempo de execução, sem a necessidade de modificar seu código-fonte.
   Isso oferece mais flexibilidade e facilita a manutenção do sistema.

Aplicação no projeto:
A lógica para cálculo do frete foi construída usando o padrão Strategy.

Cada tipo de frete (como uma transportadora terceirizada, por exemplo) possui sua própria forma de cálculo.

A classe FreteService utiliza estratégias distintas para realizar o cálculo, dependendo da opção de frete escolhida.

2. Adapter
   O padrão Adapter serve para tornar uma interface existente compatível com outra esperada pelo sistema.
   É muito útil em situações onde é necessário integrar componentes que originalmente não foram feitos para funcionar juntos.
   Esse padrão ajuda a preservar a estabilidade do código atual, evitando modificações que possam causar falhas.

Aplicação no projeto:
A classe TransportadoraExternaService foi construída seguindo o padrão Adapter.

Ela converte a lógica de cálculo usada por uma transportadora externa (TransportadoraService) para que fique alinhada com a interface FreteRepository, já utilizada na aplicação.

Como executar o projeto
Rota principal:

GET /fretes?modalidade={modalidade}&peso={peso}
Retorna o valor do frete de acordo com a modalidade e o peso fornecidos.

Rota para transportadora externa:

GET /fretes/transportadoraExterna?peso={peso}
Realiza o cálculo do frete usando a lógica da transportadora externa.