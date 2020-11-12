public class Chicken extends NonFlyingBird{

    public Chicken(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return super.fly() + ", I am chicken";
    }
}
