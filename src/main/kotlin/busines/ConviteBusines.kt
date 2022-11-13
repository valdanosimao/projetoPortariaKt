package busines

class ConviteBusines {
    fun tipoValido(tipo: String): Boolean {
      return (tipo == "comum" ||  tipo == "premium" || tipo == "luxo")
    }

    fun codigoValido(codigo: String, tipo: String): Boolean{
       return if(tipo == "comum" && codigo.startsWith("xt")){
            return true
        } else if (tipo == "premium" || tipo == "luxo") && codigo.startsWith("xt")){
             true
        } else{
            false
        }
    }
}