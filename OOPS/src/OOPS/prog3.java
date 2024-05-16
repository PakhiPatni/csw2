package OOPS;

class SystemDetails {
    private String modelName;
    private int modelNum;
    private String sim1;
    private String sim2;

    SystemDetails(String sim1, String sim2) {
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.modelName = "RedmiNote";
        this.modelNum = 8;
    }

    void setSim1(String sim1) {
        this.sim1 = sim1;
    }

    void setSim2(String sim2) {
        this.sim2 = sim2;
    }

    String getSim1() {
        return this.sim1;
    }

    String getSim2() {
        return this.sim2;
    }
}

class MobileApp {
    private String name;
    SystemDetails sd1;

    MobileApp(String name, SystemDetails sd1) {
        this.name = name;
        this.sd1 = sd1;
    }

    void getSimDetails() {
        System.out.println("UserName : "+this.name);
        System.out.println("SIM1 : "+sd1.getSim1()+" "+" & SIM2 : "+sd1.getSim2());
    }
}

public class prog3 {
    public static void main(String[] args) {
        SystemDetails sd1 = new SystemDetails("Airtel", "Vodafone");
        MobileApp m1 = new MobileApp("Pakhi", sd1);
        m1.getSimDetails();
    }
}
