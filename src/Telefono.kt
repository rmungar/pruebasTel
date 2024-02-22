class Telefono(val nombre: String, val marca: String) {
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }

    fun Colgar():String{
        return "Chao pescao"
    }
}