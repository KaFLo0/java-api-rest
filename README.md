# java-api-rest
Desenvolvimento de uma API REST usando a linguagem Java

## Importante! 🚨
Eu ainda vou melhorar vários pontos dessa API, e corrigir alguns erros que estão acontecendo, como por exemplo toda vez que uma pessoa colocar um Json que seja igual a um existente no banco de dados, o id incrementa automaticamente mesmo sem ter nenhuma inserção válida para o banco de dados.<br>
Eu decidi publicar agora pois o bootcamp Santander 2023 na DIO acaba amanhã (22/10/2023) e eu tenho que entregar este projeto para finalização do bootcamp 😣<br>

## Diagrama
```mermaid
classDiagram
class User {
  -id: int
  -name: string
  -account: Account
  -card: Card
  -features: Feature[]
  -news: News[]
}
class Account {
  -id: int
  -number: string
  -agency: string
  -balance: float
  -limit: float
}
class Card {
  -id: int
  -number: string
  -limit: float
}
class Feature {
  -id: int
  -icon: string
  -description: string
}
class News {
  -id: int
  -icon: string
  -description: string
}

User "1" *-- "1" Account
User "1" *-- "1" Card
User "1" *-- "N" Feature
User "1" *-- "N" News
```

### 💖 Agradecimentos 💖
Quero deixar gravado aqui o quão bom e enriquecedor foi esse bootcamp, consegui evoluir muito como programador ao decorrer das últimas semanas.<br>
<strong>Agradeço de coração ao <em>Santander</em> e a toda equipe da <em>DIO</em> por essa oportunidade única na minha relativamente recente trilha como um desenvolvedor!<strong>💓
