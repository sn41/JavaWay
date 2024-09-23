package java_steps.step2.cooking;

class Pilaf extends Rice {
    @Override
    public String getName() {
        return "Pilaf";
    }

    @Override
    public int getTime() {
        return 60;
    }
}