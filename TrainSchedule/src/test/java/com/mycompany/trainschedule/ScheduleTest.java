package com.mycompany.trainschedule;

import junit.framework.TestCase;

public class ScheduleTest extends TestCase {

    public void testConstructor() {
        Empty empty = new Empty();
        Cons localStopList = new Cons("Vo Van Ngan", empty);
        Cons localStopList1 = new Cons("Le Van Viet", localStopList);
        Cons expressStopList = new Cons("Dong Nai", empty);
        Cons expressStopList1 = new Cons("Vung Tau", expressStopList);

        Schedule localSchedule = new Schedule(
                "Ga Sai Gon", new Time(6, 0),
                "Ga Nha Trang", new Time(14, 30),
                localStopList1, new LocalTrain());

        Schedule expressSchedule = new Schedule(
                "Ga Sai Gon", new Time(20, 0),
                "Ga Ha Noi", new Time(11, 15),
                expressStopList1, new ExpressTrain());

        assertNotNull(localSchedule);
        assertNotNull(expressSchedule);
    }

    // test rieng cho dung bug tung gap: ExpressTrain phai tra ve "Express", khong phai "Local"
    public void testTrainTypeIsReportedCorrectly() {
        Schedule localSchedule = new Schedule(
                "Ga Sai Gon", new Time(6, 0),
                "Ga Nha Trang", new Time(14, 30),
                new Empty(), new LocalTrain());

        Schedule expressSchedule = new Schedule(
                "Ga Sai Gon", new Time(20, 0),
                "Ga Ha Noi", new Time(11, 15),
                new Empty(), new ExpressTrain());

        assertEquals("Local", localSchedule.getTrainType());
        assertEquals("Express", expressSchedule.getTrainType());
    }
}
