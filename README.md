# 📚 Aula de Spring Boot

Pequeno sistema (API REST) de **usuários e departamentos**, desenvolvido com Spring Boot para fins educacionais.

Este projeto segue a seguinte **visão de estudos**:

- ✅ Buscar todos os usuários
- ✅ Buscar um usuário pelo seu ID
- ✅ Inserir um novo usuário

---

## 📖 Conteúdo abordado na aula

- 🚀 Criação do projeto com Spring Boot
- 🧩 Implementação do modelo de domínio (User e Department)
- 🔁 Mapeamento objeto-relacional com JPA
- 🛠️ Configuração do banco de dados H2
- 🌐 Criação dos endpoints da API REST

---

## 🧱 Estrutura do Projeto

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

---

###  🔄 Desenvolvimento moderno: relacional → objeto → JSON

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

---

## 🔌 Endpoints disponíveis

- `GET /users` → Lista todos os usuários
- `GET /users/{id}` → Retorna um usuário pelo ID
- `POST /users` → Cria um novo usuário

---

#### 💾 Configuração do banco H2 (persistente)

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### 🗃️ Script de dados iniciais

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
