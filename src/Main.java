public class Main {
    public static void main(String[] args) {
        humanBodyMassIndex humanBMI = new humanBodyMassIndex(58, 1.52);
        System.out.println(humanBMI.Conclusions());
    }
}

class humanBodyMassIndex {
    private static double BodyMassIndex;

    //Weight measure in kilograms
    //Height measure in meters
    public humanBodyMassIndex(double weight, double height) {
        BodyMassIndex = weight / Math.pow(height, 2);
    }

    public static String Conclusions() {
        String conclusion = "";
        if (BodyMassIndex >= 18.5 & BodyMassIndex < 25) {
            conclusion = "Your weight is normal!";
        }
        if (BodyMassIndex >= 25 & BodyMassIndex < 30) {
            conclusion = "Warning you close to overweight!";
        }
        if (BodyMassIndex >= 30) {
            conclusion = "You overweight!";
        }
        if (BodyMassIndex < 18.5) {
            conclusion = "You underweight!";
        }
        return "Conclusion: " + conclusion;
    }
}