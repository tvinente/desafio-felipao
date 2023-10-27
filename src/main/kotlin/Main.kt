val nomeHeroi = readln()!!.toString()
val xp = readln()!!.toDouble()
var nivel = ""

fun main() {

    when {
        xp <= 1.000 -> nivel = "Ferro"
        xp >= 1.001 && xp == 2.000 -> nivel = "Bronze"
        xp >= 2.001 && xp == 5.000 -> nivel = "Prata"
        xp >= 5.001 && xp == 6.000 -> nivel = "Ouro"
        xp >= 6.001 && xp == 7.000 -> nivel = "Platina"
        xp >= 7.001 && xp == 8.000 -> nivel = "Diamante"
        xp >= 8.001 && xp == 9.000 -> nivel = "Ascendente"
        xp >= 9.001 && xp == 10.000 -> nivel = "Imortal"
        xp > 10.001 -> nivel = "Imortal"

    }
    println("O Herói de nome $nomeHeroi está no nível de $nivel")

}



