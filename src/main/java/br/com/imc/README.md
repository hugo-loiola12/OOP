# Desafio 03 - POO

Você foi designado a desenvolver um programa em Java que calcule o Índice de Massa Corporal (IMC) de uma pessoa, aplicando os conceitos fundamentais da Programação Orientada a Objetos (POO): encapsulamento, herança e polimorfismo.

## Objetivos do Exercício:

1. Criar uma classe base chamada `Pessoa`, que encapsule as informações de uma pessoa, como nome, peso e altura.
2. Implementar um método na classe `Pessoa` que calcule o IMC usando a fórmula:
3. Criar uma subclasse chamada `Atleta`, que herda de `Pessoa`, adicionando o atributo `esportePraticado` e um comportamento que ajusta o cálculo do IMC para atletas de nível de atividade alto (reduzindo o valor do IMC em 5%).
4. Usar polimorfismo para instanciar objetos do tipo `Pessoa` e `Atleta`, e calcular o IMC de ambos, exibindo os resultados no console.

## Regras:

- Utilize encapsulamento para proteger os atributos de `Pessoa` (`nome`, `peso` e `altura`), criando métodos `get` e `set` apropriados.
- Na classe `Atleta`, sobrescreva o método de cálculo do IMC para ajustar o valor por se tratar de um atleta.
- O programa deve instanciar pelo menos um objeto do tipo `Pessoa` e um do tipo `Atleta`, demonstrando o uso de polimorfismo na chamada do método `calcularIMC()`.

## Mostra no Console:

O programa deve imprimir o IMC de uma pessoa comum e de um atleta que pratica esporte de alto rendimento, mostrando que o cálculo do IMC do atleta foi ajustado.
