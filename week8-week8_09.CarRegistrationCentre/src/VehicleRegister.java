
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();

    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }

        return false;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate r : owners.keySet()) {
            System.out.println(r);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<String>();
        for (RegistrationPlate r : owners.keySet()) {
            if (!list.contains(owners.get(r))) {
                list.add(owners.get(r));
                System.out.println(owners.get(r));
            }

        }
    }

}
