public class Swallow extends FlyingBird{

    public Swallow(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return super.fly() + ", I am swallow";
    }
}
