# API simples utilizando Spring e MongoDB


Projeto desenvolvido para expandir o conhecimento de Spring Boot para bancos NoSQL, aplicar alguns conceitos de SOLID e otimizando a estrutura e nomenclatura de variáveis baseado no conveito de Clean Code.



## Linguagens e Ferramentas
- Java 8
- Spring Boot (2.5.0)
- Robo 3T e MongoDB
- Postman para testar os endpoints

## Faça o clone do projeto
- git clone ``https://github.com/absc1203/ApiSpringMongoDB.git``
- Importe na sua IDE (Eclipse, IntelliJ, etc)
- E depois compile o arquivo ``EmpresaTesteApplication.java``

## Estrutura do Projeto
Foi utilizado o padrão MVC do Spring, cada camada com sua devida responsabilidade.

- Model
- Repository
- Service
- Controller

![pacotes](https://user-images.githubusercontent.com/43246064/121197390-a4ea8c00-c847-11eb-9877-caf0809fe1e4.png)

## Diferença de uma model de banco relacional e não relacional
Para o modelo relacional normalmente no Spring utilizamos o ``@Entity``, porém no NoSQL estamos falando de um banco orientado a documento, por isso para dizermos que nossa model é um documento utilizamos a notação ``@Document``.

![detalhe](https://user-images.githubusercontent.com/43246064/121199070-ff381c80-c848-11eb-9bde-69daafff4293.png)



