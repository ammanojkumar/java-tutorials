package zoo.visitor;

import zoo.tours.api.Tour;
import zoo.tours.reservation.TourFinder;

import java.util.List;

public class Tourist {

    public static void main(String[] args) {
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour " + tour);

        List<Tour> tours = TourFinder.findAllTour();
        System.out.println("All tours " + tours);
    }
}
