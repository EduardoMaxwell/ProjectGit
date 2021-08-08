fun main(args: Array<String>) {
    println(max(2,4))
    println(min(2,4))
}

/*
*    retorna o maior valor
*/
fun max(x: Int, y: Int) = if(x > y) x else y

/*
*    retorna o menor valor
*/
fun min(a: Int, b: Int) = if(a < b) a else b