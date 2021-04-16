fun main() {

    oddNumbers()
    names()
    descision()
    multiples()
}

fun oddNumbers(){
    for(number in 1..100)
        if (number%2==1){
        println(number)
    }
}

fun names(){
    var names = arrayOf("Mary","Judith","Agness","Patience")
    for (name in names)
    if(name.length>5){
        println(name)
    }
}

fun descision(){
    var age = 2
    if (age<6){
        println("Serve a glass of milk")
    }
    else if(age<15){
        println("Serve a bottle of Fanta Orange")
    }
    else{
        println("Serve a bottle of Coca Cola")
    }
}
fun multiples(){
    for (num in 1..100){
        if (num%3 ==0){
            println("Fizz")
        }
            else if(num%5 ==0){
                println("Buzz")
            }
          else if(num%15 ==0){
                println("Fizz Buzz")
                }
else     {println(num)

            }
}
}