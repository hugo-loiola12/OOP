### Explicação

1. **Classes de Personagem**:
    - `Guerreiro` e `Mago` herdam de `Personagem`, utilizando o conceito de **herança**.
    - O método `atacar()` é sobrescrito em cada subclasse para comportamentos específicos de cada tipo de personagem,
      usando **polimorfismo**.

2. **Lógica de Batalha**:
    - A classe `Batalha` controla a sequência de turnos em que os personagens se atacam até que um deles perca toda a
      vida.
    - O método `iniciarBatalha()` realiza o controle do fluxo da batalha, alternando os ataques entre os personagens.

3. **Encapsulamento**:
    - Os atributos como `vida`, `ataque` e `defesa` são protegidos e acessíveis apenas dentro da classe ou por meio de
      métodos específicos.
    - O método `receberDano()` calcula o dano recebido, levando em consideração a defesa do personagem, garantindo a
      segurança dos atributos.

4. **Polimorfismo**:
    - O método `atacar()` é polimórfico, ou seja, a mesma chamada ao método pode ter diferentes implementações
      dependendo da subclasse (`Guerreiro` ou `Mago`).
    - Isso permite que cada tipo de personagem tenha sua própria estratégia de ataque.

5. **Classe Utilitária `Dado`**:
    - A classe `Dado` simula a aleatoriedade de um jogo de RPG, utilizando o método `rolar(int faces)` para gerar
      valores aleatórios, como dano ou chance de acerto.
