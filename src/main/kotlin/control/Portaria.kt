package control

import busines.ConviteBusines

class Portaria {

    private val conviteBusines = ConviteBusines()
    init {
        println("Portaria inicializada")
        println(controle())
    }

   private fun controle(): String {

        val idade = Console.readInt("Qual sua idade? ")
        if (idade < 18) {
            return "Negado. Menos de idade não são permitidos."
        }

        val tipoConvite = Console.readString("Qual o tipo de convite? ")
        if(!conviteBusines.tipoValido(tipoConvite)){
            return "Negado. Convite inválido"
        }

       val codigo = Console.readString("Qual o código do convite? ")
       if(!conviteBusines.codigoValido(codigo, tipoConvite)){
           return "Negado. Convite inválido"
       }

       return "TODO!"
    }

}