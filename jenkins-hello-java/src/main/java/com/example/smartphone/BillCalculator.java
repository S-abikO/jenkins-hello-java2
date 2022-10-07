package com.example.smartphone;

public class BillCalculator {
    
    public static int getBillPerMonth(Option... option) {
        int bill = 0;
        if (option.length == 3) {
            bill = 1000;
            return bill;
        } else if (option.length > 0) {
            for (Option o : option) {
                bill += o.getBillPerMonth();
            }
            return bill;
        } else {
            return 0;
        }
    }
}
