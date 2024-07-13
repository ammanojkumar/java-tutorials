package controller;

import service.process.TimeService;

public class TimeController {

    TimeService timeService = new TimeService();

    public String getTime() {
        return timeService.getTime();
    }

    public static void main(String[] args) {
        System.out.println(new TimeController().getTime());
    }
}
