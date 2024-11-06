package ie.atu.week7_labexam;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {

    private final RentalService myRental;

    public RentalController(RentalService myRental) {
        this.myRental = myRental;
    }

    @PostMapping("/rentals")
    public List<Rental> addRental(@RequestBody Rental rental) {
        return myRental.createRental(rental);
    }
    @GetMapping("/rentals/{rentalCode}")
    public List<Rental> getRental(@PathVariable String rentalCode) {
        return myRental.getRentalByCode(rentalCode);
    }
    @PutMapping("/rentals/{rentalCode}")
    public List<Rental> changeRental(@RequestBody Rental rental, @PathVariable String rentalCode) {
        return myRental.editRentalByCode(rental, rentalCode);
    }
    @DeleteMapping("/rentals/{rentalCode}")
    public List<Rental> deleteRental(@PathVariable String rentalCode) {
        return myRental.cancelRentalByCode(rentalCode);
    }
}
