package staff;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NonExecutive extends Staff{

    private BigDecimal increment = new BigDecimal(1.10);
    private final int annualLeave  = 14;
    private BigDecimal salary;

    public NonExecutive(String department, String title, BigDecimal salary) {
        super(department, title, salary);
        this.salary = salary;
    }

    @Override
    int annualLeave() { return 21; }

    @Override
    double increment() {
        return 1.10;
    }

    @Override
    public String toString() {
        BigDecimal salary1 = salary.multiply(BigDecimal.valueOf(increment()));
        salary1 = salary1.setScale(2, RoundingMode.CEILING);
        return "NonExecutive{" +" department=" + getDepartment() +
                ", title=" +getTitle()+
                " annual leave=" + annualLeave() +
                ", salary=" +  salary1+
                '}';
    }
}

