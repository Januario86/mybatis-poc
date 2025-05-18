Um projeto Java 17+ demonstrando o uso do MyBatis para persistência em banco de dados com Postgres

📌 Pré-requisitos
Java JDK 17+
Postgres(Docker opcional)
Maven 3.6+

IntelliJ IDEA (ou outra IDE de sua preferência)

🚀 Como Executar o Projeto
1. Clone o Repositório

git clone git@github.com:Januario86/mybatis-poc.git
cd mybatis-poc

🔧 Configuração do Banco de Dados
O projeto usa postgres

URL: jdbc:postgresql://localhost:5432/meudb
Usuário: sa
Senha: sa

Criar a  tabela users 
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

 Funcionalidades Implementadas
✅ CRUD Completo

INSERT → Criar usuário

SELECT → Buscar todos ou por ID

UPDATE → Atualizar usuário

DELETE → Remover usuário

⚙️ Tecnologias Utilizadas
Java 17

MyBatis 3.5+ (Mapeamento SQL → Objetos Java)

Postgres (Banco Relacional)

Lombok (Redução de boilerplate code)

Maven (Gerenciamento de dependências)
