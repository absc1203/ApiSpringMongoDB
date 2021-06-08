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

# Testando os Endpoints

## Camada controller
Na camada de controller temos a classe ``FuncionarioController`` com os endpoints da API, temos um CRUD (Create, Read, Update e Delete) incompleto já que nesse exemplo somente o CREATE e o READ foram utilizados.

![Controller](https://user-images.githubusercontent.com/43246064/121201048-994c9480-c84a-11eb-9eab-d8549dcf04be.png)

## Criando funcionario
Perceba que na model vista no tópico "Diferença de uma model de banco relacional e não relacional" possuí o ``Id`` como String, isso foi deixado propositalmente já que ele será preenchido automaticamente por um Hash, veja o exemplo abaixo.

![criando funcionario](https://user-images.githubusercontent.com/43246064/121205049-bb93e180-c84d-11eb-853f-18254c93a581.png)

## Buscando todos os funcionários
Esse método não tem muito detalhe, é um simples ``findAll`` para trazer todos os funcionários cadastrados.

![buscando funcionarios](https://user-images.githubusercontent.com/43246064/121206562-f2b6c280-c84e-11eb-9ef8-f21aca423218.png)

## Buscando funcionário por ID e buscando por NOME
Esses métodos são um pouco mais complexos já que exigem dados de entrada (parametros) para funcionar. Veja que duas maneiras de conseguir esses dados.

Uma delas é usando o ``@PathVariable`` para buscar na URL estática do domínio.
![busca id](https://user-images.githubusercontent.com/43246064/121211866-390e2080-c853-11eb-956b-ab9fc021cbe2.png)

Teste no Postman
![busca id postman](https://user-images.githubusercontent.com/43246064/121212809-103a5b00-c854-11eb-8d21-071a5834ade1.png)


Já na busca pelo nome o ``@RequestParam`` foi utilizado para pegar os dados da URL e fazer o método funcionar
![busca nome](https://user-images.githubusercontent.com/43246064/121212996-3cee7280-c854-11eb-9522-ffe5f9ad8a69.png)

Teste no Postman
![busca nome postman](https://user-images.githubusercontent.com/43246064/121213032-44ae1700-c854-11eb-93f6-931aac42acfc.png)


## Uma amostra de como ficam armazenados os dados no Robo 3T
![3t](https://user-images.githubusercontent.com/43246064/121213586-c140f580-c854-11eb-91ce-45dc98256a0d.png)

