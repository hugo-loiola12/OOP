# Sistema de Simulação de Transportes

Este projeto simula diferentes tipos de transporte, como Carro, Bicicleta e Ônibus, utilizando conceitos de Programação Orientada a Objetos (POO), como interfaces e polimorfismo.

## Descrição

O sistema simula diferentes meios de transporte, onde cada um deles implementa a interface `Transporte`. A interface contém o método `mover()`, que deve ser implementado pelas classes concretas. Cada classe de transporte apresenta um comportamento específico ao se mover.

## Requisitos

### 1. Interface `Transporte`
Uma interface chamada `Transporte` deve ser criada com o seguinte método:

- `void mover()`: Este método será implementado por todas as classes que representam meios de transporte.

### 2. Classes que implementam a interface `Transporte`

As seguintes classes devem ser criadas e implementar a interface `Transporte`:

- **Carro**: O método `mover()` deve imprimir: `"O carro está se movendo pelas estradas."`.
- **Bicicleta**: O método `mover()` deve imprimir: `"A bicicleta está sendo pedalada."`.
- **Ônibus**: O método `mover()` deve imprimir: `"O ônibus está se movendo pela rota urbana."`.

## Conceitos Utilizados

- **Interface**: A interface `Transporte` define o "contrato" que todas as classes de transporte devem seguir, garantindo que todas implementem o método `mover()`.
- **Polimorfismo**: Ao usar a interface `Transporte` como tipo de variável, é possível tratar todos os tipos de transporte de forma uniforme, independentemente da classe concreta.

## Exemplo de Uso

Aqui está um exemplo de como o sistema pode ser utilizado:

```java
public class Main {
    public static void main(String[] args) {
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();
        Transporte onibus = new Onibus();

        carro.mover();
        bicicleta.mover();
        onibus.mover();
    }
}
```

## Dicas
- Utilize o polimorfismo para tratar todos os meios de transporte de forma uniforme.
- A `interface` Transporte é o "contrato" que define o comportamento comum entre os diferentes tipos de transporte.
