# GenericStack UML Diagram

```
        ┌───────────────────────────┐
        │     ArrayList<E>          │
        ├───────────────────────────┤
        │ + size(): int             │
        │ + add(E): boolean         │
        │ + remove(int): E          │
        │ + get(int): E             │
        │ + isEmpty(): boolean      │
        └─────────────▲─────────────┘
                      │
        ┌─────────────┴─────────────┐
        │     GenericStack<E>       │
        ├───────────────────────────┤
        │ + getSize(): int          │
        │ + peek(): E               │
        │ + push(E): void           │
        │ + pop(): E                │
        │ + isEmpty(): boolean      │
        │ + toString(): String      │
        └───────────────────────────┘
```