Um projeto Java 17+ demonstrando o uso do MyBatis para persistência em banco de dados com H2 (banco em memória).

📌 Pré-requisitos
Java JDK 17+

Maven 3.6+

IntelliJ IDEA (ou outra IDE de sua preferência)

🚀 Como Executar o Projeto
1. Clone o Repositório

git clone git@github.com:Januario86/mybatis-poc.git
cd mybatis-poc

mybatis-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/mybatis/
│   │   │       ├── model/User.java          # Classe de modelo (entidade)
│   │   │       ├── mapper/UserMapper.java   # Interface do Mapper
│   │   │       ├── utils/MyBatisUtil.java   # Configuração do MyBatis
│   │   │       └── App.java                # Classe principal
│   │   └── resources/
│   │       ├── mybatis-config.xml           # Configuração global do MyBatis
│   │       └── com/example/mybatis/mapper/UserMapper.xml  # SQL Mappings
│   └── test/                               # (Opcional) Testes
├── pom.xml                                 # Dependências Maven
└── README.md                               # Este arquivo

🔧 Configuração do Banco de Dados
O projeto usa H2 Database em memória (jdbc:h2:mem:testdb).

URL: jdbc:h2:mem:testdb

Usuário: sa

Senha: (vazia)

A tabela users é criada automaticamente na inicialização.

 Funcionalidades Implementadas
✅ CRUD Completo

INSERT → Criar usuário

SELECT → Buscar todos ou por ID

UPDATE → Atualizar usuário

DELETE → Remover usuário

⚙️ Tecnologias Utilizadas
Java 17

MyBatis 3.5+ (Mapeamento SQL → Objetos Java)

H2 Database (Banco em memória para testes)

Lombok (Redução de boilerplate code)

Maven (Gerenciamento de dependências)
