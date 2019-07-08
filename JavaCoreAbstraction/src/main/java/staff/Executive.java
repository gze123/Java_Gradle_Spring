package staff;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Executive extends Staff {
    private int annualLeave;
    private BigDecimal salary;

    @Override
    int annualLeave() {
        return 21;
    }

    @Override
    double increment() {
        return 1.15;
    }

    public Executive(String department, String title, BigDecimal salary) {
        super(department, title, salary);
        this.salary = salary;
    }

    @Override
    public String toString() {
        BigDecimal salary1 = salary.multiply(BigDecimal.valueOf(increment()));
        salary1 = salary1.setScale(2,RoundingMode.CEILING);
        return "Executive{" + " department=" + getDepartment() +
                ", title=" +getTitle()+", annual leave=" + annualLeave() +
                ", salary=" + salary1 +
                '}';
    }
}
