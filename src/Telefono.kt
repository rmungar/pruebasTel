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

    override fun toString(): String {
        println("hola")
            return "$nombre,$marca"
        }
    fun Contestar():String{
        return "Hola , que tal ?"
    }

    }

}