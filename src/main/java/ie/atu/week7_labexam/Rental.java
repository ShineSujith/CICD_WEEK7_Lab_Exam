package ie.atu.week7_labexam;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    @Pattern(regexp = "^RENT-[0-9]{4}$", message = "Rental Code format is invalid")
    private String rentalCode;
    @Max(value = 50, message = "Max value of 50 has been exceeded.")
    private String carModel;
    @Max(value = 100, message = "Max value of 100 has been exceeded.")
    private String renterName;
    @Email(message = "Invalid Email was entered.")
    private String renterEmail;
    @FutureOrPresent(message = "Rental start date is invalid.")
    private Date rentalStartDate;
    @Future(message = "Must be after the rental start date.")
    private Date rentalEndDate;
    @Positive(message = "Must be a positive value.")
    private DecimalFormat dailyRate;
}
