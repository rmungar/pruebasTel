class Telefono(val nombre: String, val marca: String) {
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }
    fun Contestar():String{
        return "Hola , que tal ?"
    }
    fun Colgar():String{
        return "Chao pescao"
    }
}