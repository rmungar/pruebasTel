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
}