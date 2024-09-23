package kotlin_steps.step2.cooking


fun prepare() {
    val roventa = MultiCooker("Roventa")
    val regularStove: Cooker = MultiCooker("Regular stove")

    val pilafPortion = PilafFood()
    val ricePortion = RiceFood()

    roventa.cook(pilafPortion) //Я, ROVENTA готовила PILAF 60 минут, при 100 градусах
    roventa.cook(ricePortion) //Я, ROVENTA готовила RICE 20 минут, при 100 градусах
    regularStove.cook(ricePortion) //Я, REGULAR STOVE готовила RICE 20 минут, при 100 градусах
}