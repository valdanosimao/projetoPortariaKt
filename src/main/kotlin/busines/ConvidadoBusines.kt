package busines

import entity.Convidado

class ConvidadoBusines {
    fun tipoValido(tipo: String): Boolean {
        return (tipo == "comum" || tipo == "premium" || tipo == "luxo")
    }

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xt")
        else -> false
    }
}
