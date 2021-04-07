fun main(){
    oddNumbers()
   people("Fajiri","Jamari","Alpha","Beth","liz")
   //multiply()


    var age= robot(9)
line()

}
fun oddNumbers(){
    for (numbers in 1..100){
        if (numbers%2!=0){
            println(numbers)
        }
    }
}
fun people(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    var b =arrayOf(name1,name2,name3,name4,name5,)
    for (k in b )
        if (k.length>5) {
            println(k)

        }
    return b

}
fun multiply() {

    for (m in 1..100) {
        if (m % 3 == 0) {
            println("fizz")
        }
        if (m % 5 == 0) {
            println("buzz")
        }
        if (m%3==0 && m%5==0){
            println("fizz buzz")
        }
        else{
            println(m)
    }

    }}
    fun robot(age: Int) {

        if (age < 6) {
            println("milk")
        }
        else if (age < 15) {
            println("fanta")

        }
        else {
            println("cocacola")
        }
    }

    fun line() {
        for (p in 1..100) {
            println(p)

            if (p % 3 == 0) {
                println("fizz")
            }
            if (p % 3 == 0 && p % 5 == 0) {
                println("buzz")

            }
            if (p % 3 == 0 && p % 5 == 0) {
                println("fizzbuzz")

            }
        }
    }