package rentingscooters.view;

import rentingscooters.domain.Scooter;
import rentingscooters.services.ScooterServiceImpl;

import java.util.Scanner;

public class ScooterView {

    private final ScooterServiceImpl scooterService;
    private final Scooter scooter;
    Scanner sc = new Scanner(System.in);

    public ScooterView(ScooterServiceImpl scooterService, Scooter scooter) {
        this.scooterService = scooterService;
        this.scooter = scooter;
    }


    public void createScooterView(){

        System.out.println("Ingrese el id del scooter");
        int id = sc.nextInt();
        scooter.setIdVehicle(id);


        scooterService.createScooter(scooter);
    }








}
