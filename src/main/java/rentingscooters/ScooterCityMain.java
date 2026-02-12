package rentingscooters;

import rentingscooters.domain.Scooter;
import rentingscooters.services.ScooterServiceImpl;
import rentingscooters.view.ScooterView;

public class ScooterCityMain {
    public static void main(String[] args) {

        ScooterServiceImpl scooterService = new ScooterServiceImpl();

        Scooter scooter = new Scooter();

        ScooterView scooterView = new ScooterView(scooterService, scooter);

        scooterView.createScooterView();
        scooterService.printScooter(scooter);

    }
}
