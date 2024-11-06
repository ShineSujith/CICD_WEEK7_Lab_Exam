package ie.atu.week7_labexam;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {
    @PostMapping("/rentals")
    public List<Rental> addRental(@RequestBody Rental rental) {

    }
    @GetMapping("/rentals/{rentalCode}")
    public List<Rental> getRental(String rentalCode) {

    }
    @PutMapping("/rentals/{rentalCode}")
    public List<Rental> changeRental(@RequestBody Rental rental, String rentalCode) {

    }
    @DeleteMapping("/rentals/{rentalCode}")
    public List<Rental> deleteRental(@RequestBody Rental rental, String rentalCode) {

    }
}
