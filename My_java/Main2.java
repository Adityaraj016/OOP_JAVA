package My_java;

interface PersonalLoan {
    void find_Simple_Interest(float principal, int year);
}

class Bank1 implements PersonalLoan {
    private float interest_rate;
    static final float INTEREST_RATE = 0.10f;

    Bank1() {
        this.interest_rate = INTEREST_RATE;
    }

    Bank1(float interest_rate) {
        this();
        this.interest_rate = interest_rate;
    }

    @Override
    public void find_Simple_Interest(float principal, int year) {
        float interest = (principal * interest_rate * year);
        System.out.println("Bank1 Simple Interest: " + interest);
    }
}

class Bank2 implements PersonalLoan {
    private float interest_rate;
    static final float INTEREST_RATE = 0.15f;

    Bank2() {
        this.interest_rate = INTEREST_RATE;
    }

    Bank2(float interest_rate) {
        this();
        this.interest_rate = interest_rate;
    }

    @Override
    public void find_Simple_Interest(float principal, int year) {
        float interest = (principal * interest_rate * year);
        System.out.println("Bank2 Simple Interest: " + interest);
    }
}

public class Main2 {
    public static void main(String[] args) {
        PersonalLoan bank1 = new Bank1();
        PersonalLoan bank2 = new Bank2();

        bank1.find_Simple_Interest(1000, 2);
        bank2.find_Simple_Interest(1000, 2);

        PersonalLoan bank1_custom = new Bank1(0.12f);
        bank1_custom.find_Simple_Interest(1000, 2);

        PersonalLoan bank2_custom = new Bank2(0.18f);
        bank2_custom.find_Simple_Interest(1000, 2);
    }
}
