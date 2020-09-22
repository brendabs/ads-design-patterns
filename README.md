# SAS

Atividade desenvolvida como requisito parcial de avaliação na disciplina Análise e Desenvolvimento de Sistemas do curso de Sistemas de Informação do Centro Universitário de Patos de Minas, sob orientação do professor Filipe Guelber Melo.

## Objetivo

O objetivo foi a implementação de um Caso de Uso representando o cadastro de uma Análise de Solo.

## Design Patterns Utilizados

* Template
* Strategy
* Bridge

## Justificativa do uso de cada Pattern

* Template: sequência de passos. A Análise não pode ser exportada sem antes ser devidamente processada e o Relatório não pode ser exportado sem também ser previamente processado.
* Strategy: alteração do comportamento da exportação do relatório em tempo de execução.
* Bridge: união de dois padrões. O Template é responsável pelo gerenciamento da ordem sequencial de passos no processo da criação da análise e o Strategy irá garantir a mudança de comportamento dos possíveis tipos de exportação do relatório em tempo de execução.

## Autores

* brendabs => Brenda Braga de Santana
* ederwms => Éder Willian Moreira Sousa