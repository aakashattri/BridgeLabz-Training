package java8.lambda_functions;

import java.util.*;

public class HospitalPatientIdPrintign {
    public static void main(String[]args) {
        List<Integer> patientIds=Arrays.asList(101,102,103);
        patientIds.forEach(System.out::println);
    }
}

