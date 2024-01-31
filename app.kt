import java.util.*
import kotlin.math.pow

fun main()
{
    //ex1
    var a=readln()!!.toDouble()
    var b=readln()!!.toDouble()
    when
    {
        a>b-> a+=1
        b>a->b+=1
        (a==b)-> a=a.pow(3)
    }

    println("$a,$b")



}