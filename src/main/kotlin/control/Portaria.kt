package control

import busines.ConvidadoBusines
import entity.Convidado

class Portaria {

    private val convidadoBusines = ConvidadoBusines()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {

        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusines.maiorDeIdade(convidado.idade)) {
            return "Negado. Menos de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual o tipo de convite? ")
        if (!convidadoBusines.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido"
        }

        convidado.codigo = Console.readString("Qual o código do convite? ")
        if (!convidadoBusines.convidadoValido(convidado)) {
            return "Negado. Convite inválido"
        }

        return "Welcome!"
    }

}