package java_steps.step2.cooking;

//use printf
//https://javarush.com/groups/posts/68415-kofe-breyk-279-rukovodstvo-dlja-nachinajujshikh-po-outputprint-v-java

public class MultiCooker implements Cooker {
    String cookerName;
    MultiCooker(String cookerName){
        this.cookerName = cookerName;
    }
    
    @Override
    public void cook(Food food) {
        String foodName = food.getName();
        int time = food.getTime();
        int temperature = food.getTemperature();

        String answer =  "Я, "
                + cookerName
                + " готовила "
                + foodName
                + " "
                +  time
                + " минут, при "
                + temperature
                + "градусах";

        System.out.println(answer);

        //а можно использовать форматированный вывод
        //System.out.printf("Я, %S готовила %S %s минут, при %s градусах \n", cookerName, foodName, time, temperature);
    }

}