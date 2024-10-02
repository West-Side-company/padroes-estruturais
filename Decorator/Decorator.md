# Exemplo de Padrão Decorator em Kotlin

## Descrição

Este projeto exemplifica a implementação do **padrão Decorator** em Kotlin, demonstrando como adicionar dinamicamente funcionalidades a objetos sem modificar suas classes originais. O cenário utilizado é o de uma lanchonete, onde o cliente pode começar com uma bebida simples (como um café) e adicionar complementos, como chocolate e chantilly.

## Problema

No cenário proposto, o cliente escolhe uma bebida básica e pode adicionar complementos de maneira flexível. O desafio é permitir que esses complementos sejam adicionados sem modificar a classe da bebida original, como `Cafe`, preservando a estrutura do código.

## Solução

A solução foi implementada utilizando o padrão Decorator, onde:
- Criamos uma interface `Bebida` que define o comportamento comum para todas as bebidas (descrição e preço).
- Implementamos a classe `Cafe`, que representa uma bebida simples.
- Utilizamos o `BebidaDecorator` para adicionar novos comportamentos (preço e descrição) sem alterar a classe `Cafe`.
- Adicionamos complementos, como `Chocolate` e `Chantilly`, estendendo o `BebidaDecorator`.

Isso permite criar combinações de bebidas com complementos de forma flexível, como um café com chocolate e chantilly, sem a necessidade de alterar o código da classe original `Cafe`.

## Arquivos

O projeto contém os seguintes arquivos:

- `Bebida.kt`: Interface para bebidas.
- `Cafe.kt`: Implementação de uma bebida simples (café).
- `BebidaDecorator.kt`: Classe abstrata que serve como base para os decoradores de bebida.
- `Chocolate.kt`: Classe que adiciona o complemento chocolate à bebida.
- `Chantilly.kt`: Classe que adiciona o complemento chantilly à bebida.
- `Main.kt`: Ponto de entrada do programa, com exemplos de uso.

## Como rodar

1. Certifique-se de que você tem o Kotlin instalado em sua máquina.
2. Compile os arquivos Kotlin.
3. Execute o arquivo `Main.kt` para ver o resultado dos exemplos de combinação de bebidas.

### Exemplo de Saída

```text
Café custa 2.0
Café com Chocolate custa 3.5
Café com Chocolate com Chantilly custa 4.25
