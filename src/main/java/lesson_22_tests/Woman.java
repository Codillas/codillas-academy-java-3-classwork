package lesson_22_tests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Woman {

    private String name;

    private LocalDate lastManicureDate;

    private double balanceForBeautyServices;

    public boolean isHappy() {

        LocalDate currentDate = LocalDate.now();
        long weeks = ChronoUnit.WEEKS.between(lastManicureDate, currentDate);

        if (weeks <= 2 && balanceForBeautyServices >= 1000) {
            return true;
        } else {
            return false;
        }
    }


}
