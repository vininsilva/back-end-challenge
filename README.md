# back-end-challenge
### Desafio back-end

Tecnologias usadas:
- <a href="http://www.oracle.com/technetwork/java/javase/documentation/index.html">Java</a>
- <a href="https://spring.io">Spring</a>
- <a href="https://dev.mysql.com/doc/?">MySQL</a>
- <a href="https://maven.apache.org/guides/">Maven</a>

<hr>

## Utilizando a aplicação:

### Instalar MySQL

Seguir este guia de instalação: https://www.devmedia.com.br/instalando-e-configurando-a-nova-versao-do-mysql/25813

#### Criando Schema necessário para o projeto

1. Abra o MySQL Shell e insira a senha definida por você quando instalou o MySQL no passo anterior.

2. Um por vez, utilize os comandos:

```
create database challenge_db;
```

```
create user 'admin'@'localhost' identified by 'admin';
```

```
grant all on challenge_db.* to 'admin'@'localhost';
```

### Baixar e rodar o projeto do GitHub

Escolha um diretório de sua preferência e siga os passos a seguir

1. Abrir o terminal no mesmo caminho do diretório selecionado e utilizar o comando:

```
git clone https://github.com/vininsilva/back-end-challenge.git
```

2. Abra o <a href="https://spring.io/tools/sts/all">STS</a> e importe, como projeto Maven, o projeto baixado no item 1 dessa seção.

3. No caminho src/main/java Dentro do pacote br.com.challenge, clique com o botão direito na classe ChallengeApplication.
  Escolha a opção: Run as Spring Boot App.
  
Pronto! A Aplicação está no ar!

**NOTA:** *Sinta-se livre para rodar o projeto da maneira que for mais confortável. O uso do STS é apenas como exemplo*

Acesse a url: <a href="http://localhost:8080/api/accounts">localhost:8080/api/accounts</a>
