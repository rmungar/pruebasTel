class Telefono(val nombre: String, val marca: String) {
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }

    override fun toString(): String {
        println("hola")
            return "$nombre,$marca"

    }

}