package java_steps.step2.cooking;

class Rice implements Food {

    @Override
    public String getName() {
        return "Rice";
    }

    @Override
    public int getTemperature() {
        return 100;
    }

    @Override
    public int getTime() {
        return 20;
    }

}