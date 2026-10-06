Sobre o projeto

Este projeto foi desenvolvido como parte de um desafio de processo seletivo, com o objetivo de criar um sistema simples para realizar o cadastro e o gerenciamento de candidatos.

A ideia principal foi colocar em prática os conhecimentos que venho desenvolvendo em Java, principalmente conceitos de Programação Orientada a Objetos. Durante o desenvolvimento, fui construindo o sistema por partes, começando pela criação do candidato e de suas informações e, depois, adicionando as funcionalidades necessárias para manipular esses dados.

O sistema permite cadastrar candidatos, consultar e listar os candidatos cadastrados, editar suas informações e também remover um candidato quando necessário. Além disso, foram criadas opções para representar a escolaridade e a situação da inscrição de forma mais organizada, utilizando enum.

Como o sistema foi pensado

A classe Candidato representa cada pessoa cadastrada no processo seletivo. Nela ficam armazenadas informações como nome, CPF, data de nascimento, e-mail, telefone, cidade, vaga pretendida, escolaridade e situação da inscrição.

Para manter o código mais organizado, as responsabilidades foram separadas em diferentes classes. A parte de model concentra as informações que representam os candidatos, enquanto a camada de service fica responsável pelas operações realizadas sobre eles.

O Main é utilizado para executar o sistema e testar as funcionalidades desenvolvidas, criando candidatos e realizando operações sobre eles.

Durante o desenvolvimento, também foram utilizados conceitos como classes, objetos, atributos, métodos, construtores, encapsulamento, getters, setters, enums e listas.

Funcionalidades
O sistema possui as seguintes funcionalidades:
Cadastrar candidatos
Listar candidatos cadastrados
Consultar candidatos
Editar informações dos candidatos
Remover candidatos
Organizar candidatos pelo peso da candidatura
Controlar a situação da inscrição



Dados do candidato

Cada candidato possui as seguintes informações:
ID
Nome completo
CPF
Data de nascimento
E-mail
Telefone
Cidade
Vaga pretendida
Escolaridade
Situação da inscrição


Como executar

1. Pré-requisitos
É necessário ter o Java JDK 21 ou superior instalado.

Para verificar a versão do Java:
java -version

2. Clonar o projeto
git clone https://github.com/N1gum1/sistema-processo-seletivo.git

Entre na pasta:
cd processo-seletivo

3. Compilar
Caso esteja utilizando a estrutura atual do projeto, compile os arquivos Java com:
javac -d out $(find src -name "*.java")

4. Executar
java -cp out Main



Objetivo

O objetivo do projeto é desenvolver um sistema simples para auxiliar no gerenciamento de candidatos de um processo seletivo, aplicando conceitos de programação orientada a objetos, organização de classes, enums, métodos, encapsulamento e manipulação de dados em Java.

Estrutura do projeto

processo-seletivo/
├── src/
│   └── main/
│       └── java/
│           ├── model/
│           │   ├── Candidato.java
│           │   ├── Escolaridade.java
│           │   └── SituacaoInscricao.java
│           │
│           ├── service/
│           │   └── CandidatoService.java
│           │
│           └── Main.java
│
└── README.md

Autora

Rebecca
Sistema desenvolvido como projeto de processo seletivo.
