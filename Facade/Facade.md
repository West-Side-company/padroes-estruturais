# Padrão Estrutural Facade em um Sistema de Cinema

## Problema

Ao desenvolver um sistema de gerenciamento de um cinema, enfrentamos o desafio de lidar com várias funcionalidades complexas, como:

- Obtenção de detalhes dos filmes
- Reserva de ingressos
- Processamento de pagamentos

Se a classe `Cliente` interage diretamente com todas essas classes, ela se torna excessivamente acoplada, o que dificulta a manutenção do sistema e a adição de novas funcionalidades. Portanto, é necessário encontrar uma solução que simplifique essa interação e reduza o acoplamento.

## Solução

Utilizando o padrão **Facade**, podemos criar uma interface simplificada que encapsula a complexidade do sistema. A implementação é feita da seguinte maneira:
