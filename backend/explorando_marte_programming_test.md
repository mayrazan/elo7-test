# Teste de Programação Elo7

Como parte do processo seletivo do Elo7, gostaríamos que você fizesse uma 
pequena tarefa. Conforme seu resultado daremos continuidade ao processo te 
convidando para uma sessão de pair-programming.
 
Durante o desenvolvimento dê preferência para implementação em Java.
 
O objetivo dessa tarefa é avaliar como você vai desenvolver o código em termos 
de estilo, eficiência e qualidade. 
 
Crie um projeto no seu Github para que vejamos os passos feitos através dos commits para resolver a tarefa.

Sinta-se à vontade para criar em cima do problema abaixo. Caso algo não esteja claro, pode assumir o que seja mais claro para você e indique suas suposições em documentação. A especificação é bem básica e, portanto, caso deseje evoluir a ideia seguindo essa base, fique à vontade: por exemplo, adaptar as entradas e saídas para ser um serviço web, criar uma interface gráfica, etc.

Qualquer dúvida maior pode nos perguntar, mas no geral, divirta-se!

# Explorando Marte

Um conjunto de sondas foi enviado pela NASA à Marte e irá pousar num planalto.
Esse planalto, que curiosamente é retangular, deve ser explorado pelas sondas para que suas câmera embutidas consigam ter uma visão completa da área e enviar as imagens de volta para a Terra.

A posição e direção de uma sonda são representadas por uma combinação de coordenadas x-y e uma letra representando a direção cardinal para qual a sonda aponta, seguindo a rosa dos ventos em inglês.

![rosa dos ventos](http://i.imgur.com/li8Ae5L.png "Rosa dos Ventos")

O planalto é divido numa malha para simplificar a navegação. Um exemplo de posição seria (0, 0, N), que indica que a sonda está no canto inferior esquerdo e apontando para o Norte.

Para controlar as sondas, a NASA envia uma simples sequência de letras. As letras possíveis são "L", "R" e "M". Destas, "L" e "R" fazem a sonda virar 90 graus para a esquerda  ou direita, respectivamente, sem mover a sonda. "M" faz com que a sonda mova-se para a frente um ponto da malha, mantendo a mesma direção.

Nesta malha o ponto ao norte de (x,y) é sempre (x, y+1).

Você deve fazer um programa que processe uma série de instruções enviadas para as sondas que estão explorando este planalto.
O formato da entrada e saída deste programa segue abaixo.

A forma de entrada e saída dos dados fica à sua escolha.


## ENTRADA

A primeira linha da entrada de dados é a coordenada do ponto superior-direito da malha do planalto. Lembrando que a inferior esquerda sempre será (0,0).

O resto da entrada será informação das sondas que foram implantadas. Cada sonda é representada por duas linhas. A primeira indica sua posição inicial e a segunda uma série de instruções indicando para a sonda como ela deverá explorar o planalto.

A posição é representada por dois inteiros e uma letra separados por espaços, correpondendo à coordenada X-Y e à direção da sonda.
Cada sonda será controlada sequencialmente, o que quer dizer que a segunda sonda só irá se movimentar após que a primeira tenha terminado suas instruções.

## SAÍDA

A saída deverá contar uma linha para cada sonda, na mesma ordem de entrada, indicando sua coordenada final e direção.

### Exemplos de Entrada e Saída:

####Entrada de Teste:
```
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
```

#### Saída esperada:
```
1 3 N
5 1 E
```

