package kotlin_steps.step2.cooking

class MultiCooker(val cookerName: String) : Cooker {
    override fun cook(food: Food) {
        val foodName = food.getName()
        val time = food.getTime()
//        val temperature = food.getTemperature()

        //можно использовать форматированный вывод
        println("Я, $cookerName готовила $foodName $time минут, при ${food.getTemperature()} градусах")
    }
}