public class FlyingBird extends Bird{

    public FlyingBird(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return "I can fly";
    }
}
