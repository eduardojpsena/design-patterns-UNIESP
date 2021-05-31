<h1>DESIGN PATTERN MEMENTO</h1>

<h2>• OBJETIVO</h2>

→ Memento é um padrão comportamental do Gang of Four. Ele permite capturar e externalizar o estado interno de um objeto sem revelar os detalhes de sua implementação.
→ Permite armazenar o estado interno de um objeto em um determinado momento (Memento), para que seja possível retorna-lo a esse estado, sem que isso cause problemas com o encapsulamento.


<h2>• PROBLEMA</h2>

→ Existe uma gama de aplicações em que é necessário a recuperação de estado anterior de um objeto. Imagine que você está criando um editor de texto, em determinado momento você decide permitir que os usuários desfaçam quaisquer operações realizadas no texto. 
→ Para implementação você usa uma abordagem direta, onde para cada vez 	que o usuário realizar uma operação, a aplicação grava em algum armazenamento o estado de todos os objetos, faz um “checkpoint”, e quando quiser reverter a operação, a aplicação busca esse ultimo retrato e usa ele para retornar o estado do objeto.
→ Se você pensar nesse retrato em si, surgem vários problemas de implementação, pois precisaria percorrer todos os campos do objeto e copiar seus valores para armazenamento, porém se o objeto tivesse restrições de acesso a seu conteúdo, que é o que acontece normalmente, não seria possível realizar essa copia, ou se todos os atributos fossem públicos e desse para copiar os campos e posteriormente resolvesse adicionar ou remover alguns campos, isso exigiria mudar também a classe responsável por copiar o estado do objeto. 
→ Você expõe os detalhes internos da sua classe tornando ela frágil ou restringe o acesso ao estado dela, tornando impossível reproduzir retratos?

<h2>• SOLUÇÃO</h2>

→ Os problemas que vivenciamos foram causados por um encapsulamento quebrado. Alguns objetos tentaram fazer mais do que podiam. Para coletar os dados necessários para fazer uma ação, eles invadiram o espaço privado de outros objetos ao invés de deixar esses objetos fazerem a verdadeira ação.
→ O padrão sugere armazenar a cópia do estado de um objeto em um objeto especial chamado memento. Os conteúdos de um memento não são acessíveis para qualquer outro objeto exceto aquele que o produziu. Outros objetos podem se comunicar com mementos usando uma interface limitada que pode permitir a recuperação dos metadados do retrato (data de criação, nome a operação efetuada, etc.), mas não ao estado do objeto original contido no retrato.

<h2>• VANTAGENS</h2>

→ Você pode produzir retratos do estado de um objeto sem violar seu encapsulamento.
→ Você pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora.

<h2>• DESVANTAGENS</h2>

→ A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.
→ Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.
→ A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto.

<a>https://drive.google.com/file/d/18u2JpnigKvz6Tl9Q8uE1Cj7tglLTA8Da/view?usp=sharing</a>