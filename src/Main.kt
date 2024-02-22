fun main() {
    val tel = Telefono("Xiaomi", "Redmi")
    val tel2 = Telefono("Raul","Xiaomi")
    tel.encender()
    tel.enviar(Mensaje("email", "Hola"))
    tel2.encender()
    tel2.recibir(Mensaje("email","Hola"))
    println(tel2.Contestar())
    tel.apagar()
    tel2.apagar()

}