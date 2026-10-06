Sistema desenvolvido em Java para gerenciamento de candidatos em um processo seletivo.

O projeto permite cadastrar, consultar, listar, editar e remover candidatos, além de organizar os candidatos de acordo com o peso da candidatura.

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

Autora

Rebecca
Sistema desenvolvido como projeto de processo seletivo.
