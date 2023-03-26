fun main() {
    //1-350
    var tekToplam = 0
    var tekCarpim = 1
    var kareToplam = 0
    for (i in 1..350){
        if (i%2==0){
            kareToplam += i*i
        }
        else{
            tekToplam+=+i
            tekCarpim*=i
        }
    }
    println("1-350 arası tek sayıların toplamı:$tekToplam")
    println("1-350 arası tek sayıların carpımı:$tekCarpim")
    println("1-350 arası çift sayıların karelerinin toplamı:$kareToplam ")
}