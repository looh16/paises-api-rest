
Exemplo no formato JSON, para inserir ou alterar um Pais
{
    "nome": "tssss",
    "capital": "j",
    "regiao": "m",
    "subRegiao": "x",
    "area": 1
	
}


--------****** Possibilita ordenar os países por qualquer uma das suas propriedades, passando como parâmetros o nome da propriedade e o tipo de ordenação (DESC ou ASC) *******-------
localhost:8080/pais/ordenar?propriedade=identificador&direcao=DESC (Método Get)
localhost:8080/pais/ordenar?propriedade=nome&direcao=DESC (Método Get)
localhost:8080/pais/ordenar?propriedade=capital&direcao=DESC (Método Get)
localhost:8080/pais/ordenar?propriedade=regiao&direcao=DESC (Método Get)
localhost:8080/pais/ordenar?propriedade=subRegiao&direcao=DESC (Método Get)
localhost:8080/pais/ordenar?propriedade=area&direcao=DESC (Método Get)

localhost:8080/pais/ordenar?propriedade=identificador&direcao=ASC (Método Get)
localhost:8080/pais/ordenar?propriedade=nome&direcao=ASC (Método Get)
localhost:8080/pais/ordenar?propriedade=capital&direcao=ASC (Método Get)
localhost:8080/pais/ordenar?propriedade=regiao&direcao=ASC (Método Get)
localhost:8080/pais/ordenar?propriedade=subRegiao&direcao=ASC (Método Get)
localhost:8080/pais/ordenar?propriedade=area&direcao=ASC (Método Get)


--------****** Possibilita criar/adicionar países *******-------
localhost:8080/pais (Método Post)


--------****** Possibilita listar todos os países criados/adicionados *******-------
localhost:8080/pais (Método Get)

--------****** Possibilita alterar os dados de um determinado pais, passando como parâmetro o id do país que se pretende fazer alteração (substituir o 29 pelo id do país que se pretende fazer alteração) *******-------
localhost:8080/pais/29 (Método Put)

--------****** Possibilita apagar um determinado pais, passando como parâmetro o id do país que se pretende apagar (substituir o 30 pelo id do país que se pretende fazer apagar) *******-------

localhost:8080/pais/30 (Método Delete)



Tecnologias a utilizadas
A API foi desenvolvida em Java e a base de dados utilizada foi MySQL. o nome da base de dados é paises_db.