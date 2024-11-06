package ie.atu.week7_labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    private String rentalCode;
    private String carModel;
    private String renterName;
    private String renterEmail;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private Decimal dailyRate;
}
