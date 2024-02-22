class Telefono(val nombre: String, val marca: String) {
    init {
        require(nombre.isNotBlank())
        require(marca.isNotBlank())
    }

    override fun toString(): String {
        return "$nombre,$marca"
    }
}