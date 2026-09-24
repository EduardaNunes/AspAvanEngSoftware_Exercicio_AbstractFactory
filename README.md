# Abstract Factory: Academia de Muay Thai

Exercício da disciplina **Aspectos Avançados de Engenharia de Software** implementando o padrão de projeto **Abstract Factory**.

## Tema

O projeto modela um **Nak Muay** (lutador de Muay Thai). O tipo de aula define qual treino e equipamento devem ser chamados:

- **Técnico:** treino de fundamentos e equipamento leve.
- **Sparring:** Luta completa e equipamento mais pesado.

## Mapeamento do padrão

| Papel no padrão | Classe |
|---|---|
| Fábrica abstrata | `FabricaAbstrata` |
| Fábricas concretas | `FabricaTecnico`, `FabricaSparring` |
| Produtos abstratos | `Treino`, `Equipamento` |
| Produtos concretos | `TreinoTecnico`, `TreinoSparring`, `EquipamentoTecnico`, `EquipamentoSparring` |
| Cliente | `NakMuay` |

O cliente (`NakMuay`) conhece apenas a fábrica abstrata e as interfaces dos produtos, nunca as classes concretas. Trocar a fábrica troca a família inteira de objetos de uma só vez.
