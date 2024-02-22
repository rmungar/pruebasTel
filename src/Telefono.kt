class Telefono(val nombre: String, val marca: String) {
    var estado: Boolean = false
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }
    fun encender(){
        estado = true
        println("ENCENDIENDO....")
    }
    fun apagar(){
        estado = false
        println("APAGANDO....")
    }

    fun enviar(mensaje:Mensaje){
        println("has enviado el mensaje de tipo ${mensaje.tipo} con el mensaje: ${mensaje.desc}")
    }

    fun recibir(mensaje: Mensaje){
        println("Acaba de llegar un mensage de tipo ${mensaje.tipo} con el mensaje: ${mensaje.desc}")
    }

    fun Contestar(){
        println("Abierto.")
        println("Hola , que tal ?")
    }

    override fun toString(): String {
        return "$nombre,$marca"
    }
}

data class Mensaje(val tipo:String, val desc:String){
    override fun toString(): String {
        return "Un $tipo que contiene: $desc"
    }
}