# Collections

 Estrutura de coleções Java é um conjunto de classes e interfaces que implementam estruturas de dados de coleção comumente reutilizáveis.

 # Para que serve?

 Sua principal função é agrupar muitos elementos em uma única unidade. Em Java, há diversos tipos e muitos deles estão representados no repositório.

![Hierarquia de Collections](https://github.com/andrepinotti/Collections-/assets/115902096/121d2f22-4225-4e27-8557-939abd19ae7b)

# Interface List:

A interface List fornece métodos que permitem adição, remoção e acesso a elementos por índice. Além disso, permite iterar pelos elementos na ordem em que foram inseridos.

# ArrayList

Implementa a interface List e usa um array dinamicamente redimensionável para armazenar os elementos. Ele é eficiente para acesso aleatório, pode ser menos eficiente em operações de inserção ou remoção no meio da lista, menos eficiente para operações de inserção e remoção no meio, utiliza menos memória em comparação com **LinkedList**.

# LinkedList

Também implementa a interface List, armazena os elementos em uma lista duplamente encadeada. Essa implementação é eficiente para operações de inserção e remoção no meio da lista, pode ser menos eficiente para acesso aleatório, devido sua estrutura ser uma lista encadeade, utiliza mais memória em comparação com a **ArrayList**.

# Considerações

-Escolha **ArrayList** quando precisar de acesso rápido e frequente a elementos por índice. <br>
-Escolha **LinkedList** quando precisar realizar frequentemente operações de inserção e remoção no meio da lista.

# Interface Map

 A interface **Map** é projetada para armazenar dados na forma de pares chave-valor, onde cada chave serve como uma identificação única associada a um valor específico. 
 Ex: Map<String, Integer> meuMapa = new HashMap<>();
  meuMapa.put("Chave1", 10);
  meuMapa.put("Chave2", 20);

# HashMap<K, V>

Possui implementação padrão, não garante ordem de iteração. Eficiente para operações de busca, inserção e remoção.
