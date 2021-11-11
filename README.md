# API Cities

## 🚀 Começando

**Problema**: O Brasil é um país com uma extensão territórial muito grande, consequentemente tem muitos estados e muitas cidades. Por esse motivo fica difícil trabalhar com essa grande massa de dados.

**Solução**: Sendo assim, foi criado essa API para facilitar o uso das cidades e estados brasileiros. Esta API disponibiliza [endpointers](#1) para fazer as consultas.

## ✒️ Autor
> **Felipe Yuri Silva Bonfillioli**  - [Email](felipys@gmail.com)


## 📌 Tecnologias e Requisitos
- Java 
- Springboot 
- Gradle
- Hibernate
- PostgreSQL

## 🔧 Instalação

1. Clonar repositório utilizando o comando abaixo.

```bash
git clone https://github.com/felipe-yuri/api-cities.git
```

2. Importar o projeto eu sua IDE de preferência
   
3. Startar o projeto através do springboot application

## ⚙️ <a name="1"></a>Endpointers

1.Todos os estados brasileiros.

```bash
[GET] https://pure-mountain-10125.herokuapp.com/states
```

2.Todas as cidades brasileiras

```bash
[GET] https://pure-mountain-10125.herokuapp.com/cities
```

3.Cidade por nome.

```bash
[GET] https://pure-mountain-10125.herokuapp.com/cities/name/{city}

Ex: https://pure-mountain-10125.herokuapp.com/cities/name/Petrolina
```

4.Todos os paises.

```bash
[GET] https://pure-mountain-10125.herokuapp.com/countries
```
