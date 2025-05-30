
📊 Comparação de Desempenho: ArrayList, HashSet e HashMap em Java

Este programa em Java compara o tempo de inserção e busca de elementos nas estruturas de dados:
- 📋 ArrayList
- 🔳 HashSet
- 🗺️ HashMap

🎯 Objetivo:
Avaliar o desempenho de estruturas de dados comuns em Java, medindo:
- Tempo de inserção ⏱️
- Tempo de busca 🔍

🛠️ O que o código faz:
1. Insere 100.000 elementos em cada estrutura.
2. Mede o tempo (em milissegundos) para:
   - Inserir os elementos.
   - Buscar todos os elementos inseridos.

🚀 Como executar:
Compile e execute com JDK 8 ou superior:

    javac Main.java
    java Main

📌 Exemplo de saída:

    Runtime Insertion Array List : 10 ms
    Runtime Insertion Hash Set : 6 ms
    Runtime Insertion Hash Map : 8 ms

    Runtime Search Array List : 500 ms
    Runtime Search Hash Set : 3 ms
    Runtime Search Hash Map : 4 ms

📚 Conclusão:
- 📋 `ArrayList` → Inserção rápida, busca lenta ❌
- 🔳 `HashSet` → Inserção e busca rápidas ✅
- 🗺️ `HashMap` → Ideal para chave-valor com busca eficiente ✅

