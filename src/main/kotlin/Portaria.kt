class Portaria {

    fun controle() {

        val idade = Console.readInt("Qual sua idade? ")
        if (idade < 18) {
            println("Negado. Menos de idade não são permitidos.")
            return
        }

        val tipoConvite = Console.readString("Qual o tipo de convite? ")
        println(tipoConvite)
    }

}