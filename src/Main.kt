fun main() {
    val tel = Telefono("Xiaomi", "Redmi")
    val tel2 = Telefono("Raul","Xiaomi")
    tel.encender()
    tel2.encender()
    println(tel2.Contestar())
    println(tel.Colgar())




    tel.apagar()

}