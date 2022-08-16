class Pessoa (object):
    nome = None
    sexo = None
    idade = None

    def __init__(self,nome,sexo,idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade
        


class Cidadao (Pessoa):
    cpf = None
    def __init__(self, nome, sexo, idade,cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf



nome = input("digite o nome da pessoa: ")
sexo = input("Digite o sexo da pessoa: ")
idade = input("digite a idade da pessoa: ")
cpf = input("digite o cpf da pessoa: ")

cidadao = Cidadao(nome,sexo,idade,cpf)

print("Nome do cidadao " + cidadao.nome)
print("idade do cidadao " + cidadao.idade)
print("sexo do cidadao " + cidadao.sexo)
print("cpf do cidadao " + cidadao.cpf)
