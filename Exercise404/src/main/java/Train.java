// Refines the earlier TrainTrip class (which used a boolean "local" field)
// into a class hierarchy, the same way AShape was refined into Dot/Square/Circle.
public abstract class Train {
    protected String route;
    protected String schedule;

    protected Train(String route, String schedule) {
        this.route = route;
        this.schedule = schedule;
    }
}
