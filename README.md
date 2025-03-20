# 	:shirt: Sistema de Gestão de Estoque - Loja de Roupas DUDZ _(em progresso)_

## 📌 Descrição do Projeto
Este é um sistema para gestão de estoque de uma loja de roupas. Ele permite o cadastro de produtos, controle de quantidades, atualização de status (disponível/em falta) e geração de relatórios.

## 🚀 Funcionalidades
- 📋 **Cadastro de produtos**: Nome, categoria, tamanho, cor, preço e quantidade em estoque.
- 🔄 **Atualização de estoque**: Entrada e saída de produtos.
- 📊 **Relatórios**: Produtos mais vendidos, estoque mínimo, histórico de movimentações.
- 🔍 **Pesquisa de produtos**: Filtragem por nome, categoria ou disponibilidade.

## 🏗️ Tecnologias Utilizadas
- **Back-end**: Java (Spring Boot)
- **Front-end**: JavaScript (React)
- **Banco de Dados**: PostgreSQL
- **Metodologia**: Scrum (sprints semanais)

## 📑 User Stories
### 🛍️ Cadastro de Produto
**Como** gerente da loja, **quero** cadastrar novos produtos no sistema **para** manter o controle do estoque atualizado.

✅ **Critérios de Aceitação:**
- O produto deve conter nome, categoria, tamanho, cor, preço e quantidade.
- O sistema deve validar se o nome do produto já existe.

### 📦 Atualização de Estoque
**Como** funcionário da loja, **quero** registrar entradas e saídas de produtos **para** manter o estoque sempre correto.

✅ **Critérios de Aceitação:**
- O sistema deve permitir a atualização da quantidade dos produtos.
- Caso um produto atinja o estoque mínimo, deve ser gerado um alerta.

## 📊 Diagramas UML
### 🗂️ Fluxo de Cadastro de Produtos
![Fluxo de Cadastro] <!-- (docs/fluxo-cadastro-produto.png) -->

### 📦 Fluxo de Atualização de Estoque
![Fluxo de Estoque] <!-- (docs/fluxo-atualizacao-estoque.png) -->

## 🛠️ Como Executar o Projeto
1. Clone este repositório:
```bash
 git clone https://github.com/teu-usuario/dudz.git
```
2. Instale as dependências do projeto:
```bash
 cd dudz
 npm install
```
3. Inicie o servidor back-end:
```bash
 cd backend
 mvn spring-boot:run
```
4. Inicie o front-end:
```bash
 cd frontend
 npm start
```

## 🏆 Contribuições
Sinta-se à vontade para contribuir enviando *pull requests* ou abrindo *issues*.

---

:bulb: **Desenvolvido para otimizar a gestão de estoques e melhorar o controle de vendas!**
