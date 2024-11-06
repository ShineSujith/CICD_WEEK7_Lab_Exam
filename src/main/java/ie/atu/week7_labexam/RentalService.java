package ie.atu.week7_labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RentalService{
    private final List<Rental> myList = new ArrayList<>();
    private final List<Rental> renterList = new ArrayList<>();

    public List<Rental> createRental(Rental rental) {
        myList.add(rental);
        return myList;
    }

    public List<Rental> getRentalByCode(String rentalCode) {
        int i = 0;
        for (Rental r: myList){
            if(r.getRentalCode() == rentalCode) {
                break;
            }
            i++;
        } throw new NoSuchElementException("Rental Not Found");
        return myList.get(i);
    }

    public List<Rental> editRentalByCode(Rental rental, String rentalCode) {
        for (Rental r: myList){
            if(r.getRentalCode() == rentalCode) {
                r.setRentalCode(rental.getCarModel());
                r.setRentalCode(rental.getRenterName());
                r.setRentalCode(rental.getRenterEmail());
            }
        }
        return myList;
    }

    public List<Rental> cancelRentalByCode(String rentalCode) {
        myList.removeIf(rental -> rental.getRentalCode() == rentalCode);
        return myList;
    }

}
