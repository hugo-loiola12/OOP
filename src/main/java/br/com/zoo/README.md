# Desafio: Sistema para um Zoológico Virtual

Você foi contratado para desenvolver um sistema para um zoológico virtual. O sistema precisa representar diferentes
tipos de animais, cada um com suas características específicas.

## Requisitos

Crie uma hierarquia de classes conforme descrito abaixo:

### 1. Classe Base: `Animal`

A classe base `Animal` deve ter:

- **Atributos:**
    - `nome`: Nome do animal
    - `idade`: Idade do animal
    - `peso`: Peso do animal
- **Métodos:**
    - `fazer_som()`: Método que imprime um som genérico do animal
    - `info()`: Método que retorna uma string com as informações do animal (nome, idade e peso)

### 2. Subclasse: `Mamifero`

A classe `Mamifero` deve herdar de `Animal` e adicionar:

- **Atributos:**
    - `pelagem`: Tipo de pelagem (ex: "curta", "longa", "não tem")
- **Métodos:**
    - `fazer_som()`: Sobrescreve o método `fazer_som()` da classe `Animal` para um som específico dos mamíferos

### 3. Subclasse: `Ave`

A classe `Ave` deve herdar de `Animal` e adicionar:

- **Atributos:**
    - `envergadura`: Envergadura das asas (em centímetros)
- **Métodos:**
    - `fazer_som()`: Sobrescreve o método `fazer_som()` da classe `Animal` para um som específico das aves

### 4. Classe `Main`

A classe `Main` deve:

- **Instanciar** diferentes tipos de animais, incluindo pelo menos um `Mamifero` e uma `Ave`.
- **Exibir** informações sobre cada animal utilizando o método `info()` da classe `Animal`.
- **Demonstrar** a utilização do método `fazer_som()` para mostrar os sons específicos dos mamíferos e das aves.
