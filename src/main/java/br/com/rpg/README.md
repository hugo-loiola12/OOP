# Jogo de RPG Simples em Java

### Descrição

Este é um projeto de um jogo de RPG simples desenvolvido em Java, onde o jogador pode escolher entre diferentes
personagens de *Final Fantasy IX* e lutar contra inimigos. O sistema de batalha é baseado em turnos e inclui mecânicas
de ataque, cura limitada e uma lógica de batalha aleatória para o inimigo.

### Estrutura do Projeto

O projeto está organizado em pacotes e classes principais que implementam a lógica do jogo. Abaixo está uma descrição de
cada componente:

#### Pacotes:

- **`br.com.rpg.model`**: Contém as classes que definem os personagens do jogo (Zidane, Vivi, Steiner, Garnet, Inimigo)
  e a superclasse `Personagem`.
- **`br.com.rpg.util`**: Contém classes utilitárias, como `DadoD20`, que simula o lançamento de um dado de 20 lados para
  calcular eventos aleatórios como ataques e cura.
- **`br.com.rpg`**: Contém a classe `Game`, que gerencia o jogo em si e executa a lógica de escolha de personagem e
  batalha.

#### Classes Principais:

##### 1. `Personagem` (Superclasse)

Define os atributos e comportamentos básicos de qualquer personagem do jogo, seja um jogador ou um inimigo. Inclui:

- **Atributos**: `nome`, `vida`, `ataque`, `defesa`, `mana`.
- **Métodos**:
    - `atacar(Personagem alvo)`: Deve ser sobrescrito pelas subclasses para definir o estilo de ataque de cada
      personagem.
    - `receberDano(int dano)`: Calcula o dano recebido após considerar a defesa e reduz a vida do personagem. Garante
      que a vida nunca seja negativa.
    - `curar(int pontos)`: Permite que o personagem recupere vida, limitada ao máximo da vida inicial.

##### 2. `Zidane`, `Vivi`, `Steiner`, `Garnet` (Subclasses de `Personagem`)

Cada uma dessas classes representa um personagem específico do jogo *Final Fantasy IX* e sobrescreve o método `atacar`
de acordo com seu estilo de luta:

- **Zidane**: Usa adagas e calcula o ataque com base no valor de ataque e defesa do alvo.
- **Vivi**: Usa magia negra e calcula o ataque com base na mana e na defesa do alvo.
- **Steiner**: Usa uma espada com ataques físicos fortes.
- **Garnet**: Usa magia branca para atacar, usando sua mana.

##### 3. `Inimigo` (Subclasse de `Personagem`)

Define o comportamento de um inimigo genérico que pode lutar contra o jogador. Tem um padrão de ataque simples baseado
no cálculo do valor de defesa do oponente e um dado de 20 lados para determinar o impacto.

##### 4. `DadoD20`

Esta classe utilitária contém o método `rolar()`, que simula um dado de 20 lados, gerando valores aleatórios entre 1 e
20. Utilizada nas batalhas para determinar o sucesso dos ataques e curas.

##### 5. `Game`

É o ponto de entrada do jogo. Permite ao jogador:

- Escolher um personagem.
- Lutar contra um inimigo em um sistema de batalha por turnos.

### Sistema de Batalha

A batalha é controlada pela classe `Batalha`, que implementa um loop de turnos até que um dos personagens seja
derrotado. Cada turno, o jogador pode:

1. **Atacar**: Realiza um ataque contra o oponente.
2. **Curar**: Recupera vida, limitado a 3 vezes por batalha.
3. **Fugir**: Encerrar a batalha.

O inimigo tem um comportamento aleatório, com maior chance de atacar do que se curar.

#### Exemplo de Lógica de Batalha:

```java
if(turnoP1){
        // Turno do jogador
        switch(escolha){
        case 1:
        p1.

atacar(p2);  // O jogador ataca
            break;
                    case 2:
                    if(curasUsadas< 3){
        p1.

curar(cura);  // O jogador se cura, se tiver curas disponíveis

curasUsadas++;
        }else{
        System.out.

println("Você já usou todas as curas!");
            }
                    break;
                    case 3:
                    // Jogador foge da batalha
                    break;
                    }
                    }else{
// Turno do inimigo
int acaoP2 = random.nextInt(4);  // Inimigo tem 75% de chance de atacar
    if(acaoP2< 3){
        p2.

atacar(p1);
    }else{
            p2.

curar(cura);
    }
            }
```

### Regras de Jogo

- **Vida**: Cada personagem tem um valor de vida que diminui conforme recebe dano. Se a vida chegar a 0, o personagem
  morre.
- **Ataque**: Baseado em atributos como `ataque`, `mana` e `defesa` do oponente. Utiliza o dado D20 para adicionar
  aleatoriedade.
- **Cura**: A cura é limitada a 3 usos por batalha para evitar que o jogador abuse desse recurso.

### Como Jogar

1. O jogo inicia com a escolha do personagem.
2. Em seguida, uma batalha por turnos começa.
3. O jogador escolhe suas ações (atacar, curar, fugir) e o inimigo reage com base em decisões aleatórias.
4. O jogo termina quando um dos personagens é derrotado ou o jogador foge.

### Como Executar o Projeto

1. **Clonar o Repositório**:
   Clone o repositório do projeto em sua máquina.

2. **Compilar e Executar**:
   Certifique-se de ter o JDK 21 instalado e execute os seguintes comandos:

   ```bash
   javac -d bin src/br/com/rpg/*.java src/br/com/rpg/model/*.java src/br/com/rpg/util/*.java
   java -cp bin br.com.rpg.Game
   ```

3. **Escolha do Personagem**:
   Quando o jogo iniciar, escolha seu personagem e siga as instruções do console para jogar.

### Conclusão

Este projeto demonstra como implementar um jogo de RPG básico com conceitos de POO como herança, polimorfismo,
encapsulamento e aleatoriedade usando Java. A estrutura modular permite a fácil extensão com novos personagens,
habilidades e inimigos.
