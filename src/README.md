# Lista Duplamente Ligada
### Métodos
```java
int size(); // Retorna o tamanho da lista
boolean isEmpty(); // Retorna true se this.start apontar para this.end, false em outro caso
ListNode first(); // Retorna o 1º elemento, o nó posterior a this.start
ListNode last(); // Retorna o nº elemento, o nó anterior a this.end
ListNode before(ListNode p); // Retorna o nó anterior a p
ListNode after(ListNode p); // Retorna o nó posterior a p
Object replaceElement(ListNode n, Object o); // Substitui o valor armazenado em n por o, e retorna o valor substituido
ListNode insertBefore(ListNode n, Object o); // Insere um novo nó antes de n, armazenando o
ListNode insertAfter(ListNode n, Object o); // Insere um novo nó após n, armazenando o
ListNode insertFirst(Object o); // Insere um novo nó no início da lista, armazenando o
ListNode insertLast(Object o); // Insere um novo nó no final da lista, armazenando o
Object remove(ListNode n); // Remove o nó n da lista, retornando seu valor
```
