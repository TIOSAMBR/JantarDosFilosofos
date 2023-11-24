# JantarDosFilosofos

# Descrição do Código - Jantar dos Filósofos em Java com Threads

# 1. Classe Filosofo:

Atributos:
id: Identificador único do filósofo.
garfoEsquerdo: Lock representando o garfo à esquerda do filósofo.
garfoDireito: Lock representando o garfo à direita do filósofo.
Método pensar():

Simula o ato de pensar por um período de tempo (1 segundo).
Método comer():

Simula o ato de comer por um período de tempo (1 segundo).
Método run():

Executa a lógica do filósofo em um loop infinito:
Pensar.
Tentar pegar os garfos à esquerda e à direita.
Comer.
Liberar os garfos.

# 2. Classe JantarDosFilosofos:

Método main():
Inicializa o número de filósofos e um array de locks representando os garfos.
Inicializa as threads dos filósofos e os seus respectivos garfos, criando uma mesa redonda.

# 3. Comentários Adicionados:

Comentários foram incluídos para elucidar as etapas críticas do código.
Identificação de ações como pensar, pegar garfos, comer e liberar garfos.
Inicialização dos garfos e das threads dos filósofos.
Este código Java utiliza o conceito de locks (ReentrantLock) para garantir exclusão mútua e resolver o problema clássico do Jantar dos Filósofos, onde os filósofos alternam entre ações de pensar e comer, evitando impasses ao acessar os garfos compartilhados.
