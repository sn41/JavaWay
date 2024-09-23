package kotlin_steps.step2.cooking

internal open class RiceFood : Food {
    override fun getName() =  "Rice"
    override fun getTemperature() = 100
    override fun getTime()= 20
}