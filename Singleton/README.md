Padrão de Projeto: Singleton
Introdução

O padrão de projeto Singleton pertence ao grupo de padrões criacionais e tem como objetivo garantir que uma classe possua apenas uma instância durante toda a execução de um sistema. Além disso, o Singleton disponibiliza um ponto de acesso global e controlado a essa instância.
Esse padrão é amplamente utilizado em situações que exigem centralização de estado ou controle unificado de recursos, como gerenciadores de configurações, sistemas de log e serviços compartilhados.

1. Problema que o Singleton resolve

Em determinados contextos, permitir que uma classe seja instanciada diversas vezes pode gerar inconsistências e desperdício de recursos. Alguns exemplos de problemas que podem surgir sem um mecanismo de controle de instâncias são:

Estados duplicados ou divergentes entre objetos que deveriam compartilhar o mesmo comportamento.

Sobrecarga na memória, ao manter várias instâncias desnecessariamente.

Dificuldade de coordenação entre diferentes partes do sistema que dependem de um recurso comum.

Exemplos de situações reais:

Gerenciadores de configuração: o sistema inteiro deve utilizar um único conjunto de parâmetros.

Loggers: impedir múltiplos arquivos ou fluxos de log.

Controladores de acesso a recursos compartilhados.

Contadores globais ou geradores de identificadores.

Nesses cenários, é fundamental garantir que apenas uma instância seja criada e utilizada.

2. Solução proposta pelo Singleton

O padrão Singleton propõe três elementos fundamentais para solucionar o problema:

Construtor privado: impede que outras classes criem instâncias através do operador new.

Atributo estático que armazena a instância única: a própria classe mantém referência à instância.

Método de acesso público e estático: conhecido como getInstance(), permite acessar a instância única, criando-a se necessário.

Vantagens do padrão:

Garantia de existência de apenas uma instância.

Centralização no controle de um recurso.

Facilidade de acesso à instância através de um ponto global.

Limitações e riscos:

Pode introduzir acoplamento excessivo se utilizado sem necessidade.

Pode dificultar a realização de testes unitários.

Representa um estado global, o que pode impactar a organização do software se mal aplicado.

3. Diagrama UML do Singleton
classDiagram
    class Singleton {
        - Singleton instance
        - Singleton()
        + static getInstance() Singleton
        + someOperation()
    }


O diagrama representa a estrutura essencial do padrão: um construtor privado, um atributo estático para armazenar a instância única e um método público que retorna essa instância.

4. Exemplo utilizado no projeto

Neste repositório, o padrão Singleton é demonstrado por meio de um exemplo de um Logger simples.
A implementação garante que todas as partes do sistema que registram mensagens utilizem a mesma instância, centralizando o processo de registro.

A pasta src/ contém:

A implementação do Singleton (classe SingletonLogger).

Uma classe Main demonstrando o uso do padrão e a garantia de unicidade da instância.

5. Considerações sobre Thread Safety

Em sistemas que utilizam múltiplas threads, podem ocorrer situações em que mais de uma instância do Singleton seja criada simultaneamente. Para evitar esse problema, existem abordagens como:

Criação antecipada da instância (eager initialization).

Uso de métodos sincronizados.

Double-checked locking.

Padrão Holder (classe interna auxiliar).

O presente projeto utiliza a versão simples do Singleton, adequada para fins didáticos.

6. Situações em que o Singleton não é recomendado

O padrão Singleton não deve ser utilizado quando:

O sistema necessita criar múltiplas instâncias independentes da classe.

Há necessidade de alto nível de testabilidade, especialmente com mocks.

A aplicação utiliza princípios de injeção de dependência.

O desenvolvimento está sendo conduzido sem justificativa técnica clara para instância única.