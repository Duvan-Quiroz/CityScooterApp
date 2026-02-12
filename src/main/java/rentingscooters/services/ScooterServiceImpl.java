package rentingscooters.services;

import rentingscooters.domain.Scooter;

import java.util.ArrayList;

public class ScooterServiceImpl implements ScooterService{


    @Override
    public Scooter createScooter(Scooter scooter) {
        return scooter;
    }

    public void printScooter(Scooter scooter){
        System.out.println("Id de Scooter: " +scooter.getIdVehicle());
    }

    @Override
    public ArrayList<Scooter> getAllScooters() {
        return null;
    }

    @Override
    public Scooter getScooterById(int id) {
        return null;
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public void deleteScooter(int id) {

    }
}
