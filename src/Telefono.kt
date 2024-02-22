class Telefono(val nombre: String, val marca: String) {
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }

    override fun toString(): String {
        println("hola")
            return "$nombre,$marca"

    }

    fun enviar(mensaje:Mensaje){
        println("has enviado el mensaje de tipo ${mensaje.tipo} con el mensaje: ${mensaje.desc}")
    }

    fun recibir(mensaje: Mensaje){
        println("Acaba de llegar un mensage de tipo ${mensaje.tipo} con el mensaje: ${mensaje.desc}")
    }
}

data class Mensaje(val tipo:String, val desc:String)