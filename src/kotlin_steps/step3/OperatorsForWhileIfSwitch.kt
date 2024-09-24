package kotlin_steps.step3
fun demoSimple(myPetsNum: Int) {
    if (myPetsNum > 5) {
        println("I have $myPetsNum")
        println("You are crazy!")
    }else{
        println("How nice!")
    }
}

fun demoExt(vararg myPetsNames: Int) {
    //for можно использовать по-разному, например со счётчиком циклов

    for (counter in myPetsNames.indices) {
        println(myPetsNames[counter])
    }

    //или с указателем на элемент коллекции - массива или списка
    for (myPetsName in myPetsNames) {
        println(myPetsName)
    }

    //оператор цикла
    var index = 0
    while (index < myPetsNames.size) {
        println(myPetsNames[index])
        index++
    }

    //оператор цикла который выполняется хотя бы один раз
    var index2 = 0
    do {
        println(myPetsNames[index2])
    } while (++index2 < myPetsNames.size)


    //оператор условия
    if (myPetsNames.size >= 5) {
        println("You are crazy!")
    } else if (myPetsNames.size == 4) {
        println("You are strange.")
    } else if (myPetsNames.size == 3) {
        println("What a zoo!")
    } else if (myPetsNames.size == 2) {
        println("Why so much?")
    } else println("How nice!")


    //можно использовать оператор ветвления
    if (myPetsNames.size >= 5) {
        println("You are crazy!")
    } else {
        when (myPetsNames.size) {
            4 -> println("You are strange.")
            3 -> println("What a zoo!")
            2 -> println("Why so much?")
            1 -> println("How nice!")
        }
    }

    //или так
    val str = when {
        myPetsNames.size >= 5 -> "You are strange."
        myPetsNames.size >= 4 -> "You are strange."
        myPetsNames.size >= 3 -> println("What a zoo!")
        myPetsNames.size >= 2 -> println("Why so much?")
        myPetsNames.isNotEmpty() -> println("How nice!")
        else -> println("And I love animals.")
    }
    println(str)
}