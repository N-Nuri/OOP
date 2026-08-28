package com.mycompany.traintrip;

/**
 *
 * @author Nuri
 */
public class TrainTrip {
    private Route route;
    private Schedule schedule;
    // TODO: doi ten field nay cho dung nghia trong de bai that
    // (mac dinh dat la "isExpress", sua lai neu de bai muon field khac)
    private boolean isExpress;

    public TrainTrip(Route route, Schedule schedule, boolean isExpress) {
        this.route = route;
        this.schedule = schedule;
        this.isExpress = isExpress;
    }

    public Route getRoute() {
        return route;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public static void main(String[] args) {
        
    }
}
