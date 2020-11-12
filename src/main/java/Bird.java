public abstract class Bird {

    private boolean layEggs;

    private boolean feathers;

    public Bird(boolean layEggs, boolean feathers) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

    public abstract String fly();

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }
}
