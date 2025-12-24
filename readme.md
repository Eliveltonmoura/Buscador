# Consulta de CEP e Geração de Arquivo JSON

Este projeto em **Java** realiza a consulta de um endereço a partir de um **CEP**, consome uma **API pública**, converte os dados retornados em um objeto Java e gera automaticamente um arquivo **.json** formatado utilizando a biblioteca **Gson**.

O objetivo principal é praticar conceitos fundamentais de desenvolvimento backend, como consumo de APIs, serialização de objetos, organização de código e manipulação de arquivos.

---

## 📌 Funcionalidades

* Consulta de endereço via API de CEP
* Conversão da resposta para um objeto Java
* Geração de arquivo `.json` com formatação legível (Pretty Printing)
* Organização do projeto em classes com responsabilidades bem definidas

---

## 🛠️ Tecnologias Utilizadas

* Java
* Gson
* API de consulta de CEP
* Manipulação de arquivos com `FileWriter`

---

## 📂 Estrutura do Projeto

```
📁 src
 ├── Principal.java          // Classe principal da aplicação
 ├── ConsultaCep.java        // Responsável por consultar a API de CEP
 ├── Endereco.java           // Classe modelo do endereço
 └── GeradorDeArquivo.java   // Gera o arquivo JSON a partir do objeto Endereco
```

---

## ▶️ Como Executar

1. Clone este repositório
2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code, etc.)
3. Certifique-se de que a biblioteca **Gson** está adicionada ao projeto
4. Execute a classe `Principal.java`
5. Informe um CEP válido
6. O arquivo `.json` será gerado no diretório do projeto

---

## 📄 Exemplo de Saída

O arquivo gerado terá o nome baseado no CEP informado e conterá os dados do endereço em formato JSON formatado.

---

## 🎯 Objetivo de Aprendizado

Este projeto foi desenvolvido com foco em:

* Prática de Java orientado a objetos
* Consumo de APIs REST
* Serialização de dados
* Escrita de código limpo e organizado

---

## 👨‍💻 Autor

**Elivelton Moura**
Estudante de Engenharia da Computação | Entusiasta de Backend e Sistemas Embarcados

---

🚀 Projeto desenvolvido para fins de estudo e evolução contínua na programação.
