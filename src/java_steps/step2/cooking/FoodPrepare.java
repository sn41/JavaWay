package java_steps.step2.cooking;

public class FoodPrepare {
    public static void prepare() {
        MultiCooker roventa = new MultiCooker("Roventa");
        Cooker regularStove = new MultiCooker("Regular stove");

        Pilaf pilafPortion = new Pilaf();
        Rice ricePortion = new Rice();

        roventa.cook(pilafPortion);  //Я, ROVENTA готовила PILAF 60 минут, при 100 градусах
        roventa.cook(ricePortion);      //Я, ROVENTA готовила RICE 20 минут, при 100 градусах
        regularStove.cook(ricePortion);   //Я, REGULAR STOVE готовила RICE 20 минут, при 100 градусах
    }
}