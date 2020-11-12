public class Penguin extends NonFlyingBird{

    public Penguin(boolean layEggs, boolean feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String fly() {
        return super.fly() + ", I am penguin";
    }
}
