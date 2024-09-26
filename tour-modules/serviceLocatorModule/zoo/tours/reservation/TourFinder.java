package zoo.tours.reservation;

import zoo.tours.api.Tour;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class TourFinder {

    public static Tour findSingleTour() {
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader) {
            return tour;
        }
        return null;
    }

    public static List<Tour> findAllTour() {
        List<Tour> tours = new ArrayList<>();
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader) {
            tours.add(tour);
        }
        return tours;
    }
}
