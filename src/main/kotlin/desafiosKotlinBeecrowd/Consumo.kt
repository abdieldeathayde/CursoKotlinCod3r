package desafiosKotlinBeecrowd

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

import java.do.File
import java.in.InputStream


//import java.util.Locale
import java.util.Locale as Locale1

fun main() {
    try {

        val locale = Locale1("en", "US")

        Locale1.setDefault(locale)



        println(Locale1.getDefault())

        val x: Int
        val y: Double






        val bdr = File




        x = bdr.nextInt()
        bdr.nextLine()

        y = bdr.nextDouble()

        val currencyFormat = java.text.NumberFormat.getCurrencyInstance()
        val formattedCurremcy = currencyFormat.format(y)

        bdr.nextLine()

        val consumoMedio = x / y

        val round = String.format("%.3f", consumoMedio)

        println("$round km/l")


//        println("$formattedCurrency km/l")



        bdr.close()
    } catch(e: IOException) {
        e.printStackTrace()
    }



}