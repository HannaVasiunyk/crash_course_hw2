public class Eagle extends FlyingBird{

    public Eagle(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return super.fly() + ", I am eagle";
    }
}
