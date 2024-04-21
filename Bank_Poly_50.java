class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 9.7;
    }
}

public class Bank_Poly_50{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        System.out.println("SBI, " + sbi.getRateOfInterest());
        System.out.println("ICICI, " + icici.getRateOfInterest());
        System.out.println("AXIS, " + axis.getRateOfInterest());
    }
}
