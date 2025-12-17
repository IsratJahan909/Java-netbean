
package com.abc.advancemid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;





public class APISortMain {
 public static void main(String[] args) {
        List<APIEmployee> employees = Arrays.asList(
            new APIEmployee(1L, "Rakib", 25, LocalDate.of(2000, 5, 10), new BigDecimal("35000"), "Dhaka"),
            new APIEmployee(2L, "Anika", 28, LocalDate.of(1997, 3, 15), new BigDecimal("40000"), "Chittagong"),
            new APIEmployee(3L, "Jamal", 30, LocalDate.of(1995, 1, 20), new BigDecimal("45000"), "Khulna"),
            new APIEmployee(4L, "Hasan", 22, LocalDate.of(2003, 8, 5), new BigDecimal("30000"), "Sylhet")
        );

        System.out.println(" Sort by Name:");
        employees.stream()
                 .sorted(Comparator.comparing(APIEmployee::getName))
                 .forEach(System.out::println);

        System.out.println(" Sort by Age (Descending):");
        employees.stream()
                 .sorted(Comparator.comparing(APIEmployee::getAge).reversed())
                 .forEach(System.out::println);

        System.out.println(" Sort by Salary:");
        employees.stream()
                 .sorted(Comparator.comparing(APIEmployee::getSalary))
                 .forEach(System.out::println);
    }
}




