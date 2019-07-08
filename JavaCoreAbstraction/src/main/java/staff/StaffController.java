package staff;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StaffController {

    @RequestMapping("/staffList")
    public List<String> getStaffList(){
        Staff s1 = new Executive("it","dr", BigDecimal.valueOf(2500));
        Staff s2 = new NonExecutive("hr","ir",BigDecimal.valueOf(3000));
        Staff s3 = new Executive("hr","ir",BigDecimal.valueOf(3500));

        List<String> staffDetail  =new ArrayList<>();
        staffDetail.add(s1.toString());
        staffDetail.add(s2.toString());
        staffDetail.add(s3.toString());
        return staffDetail;

    }
}
