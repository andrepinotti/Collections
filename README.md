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

# LinkedHashMap

 Mantém uma lista duplamente ligada através de seus itens. A ordem de iteração é a ordem em que as chaves são inseridas no mapa. Se for necessário um mapa onde os elementos são iterados na ordem em que foram inseridos, use esta implementação.
 Ex:    linkedHashMap.put("Um", 1);
        linkedHashMap.put("Dois", 2);
        linkedHashMap.put("Três", 3);

# TreeMap

  Implementa a interface SortedMap. É baseado em uma estrutura de árvore vermelha-negra. Essa é uma árvore binária balanceada que garante que a altura da árvore permaneça relativamente pequena, o que contribui para a eficiência nas operações de inserção, remoção e busca. A ordenação no TreeMap é realizada com base nas chaves. A ordem natural das chaves é determinada pela implementação da interface Comparable pela classe das chaves ou por um comparador externo fornecido durante a criação do TreeMap. 

# Considerações

 Use HashMap se a ordem dos elementos não importa e a busca rápida é crítica.
 Use TreeMap se a ordem dos elementos é importante.
 Use LinkedHashMap se a ordem de inserção ou de acesso é importante.
 
# Interface Set

A interface Set representa uma coleção que não permite elementos duplicados. Cada elemento em um Set deve ser único. 
