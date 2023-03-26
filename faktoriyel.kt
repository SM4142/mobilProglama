fun main(){
    var fonk =hesapla(7)
    println("7'nin faktoriyeli :$fonk")
}
fun hesapla(sayi:Int):Int{
    var carpım =1
    for (i in sayi downTo 1){
        carpım*=i }
    return carpım
}