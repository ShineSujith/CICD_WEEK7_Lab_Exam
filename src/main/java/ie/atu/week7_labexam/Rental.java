package ie.atu.week7_labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    private String rentalCode;
    private String carModel;
    private String renterName;
    private String renterEmail;
    private String rentalStartDate;
    private String rentalEndDate;
    private float dailyRate;
}
