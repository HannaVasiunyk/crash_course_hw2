public class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return "I can't fly";
    }
}
