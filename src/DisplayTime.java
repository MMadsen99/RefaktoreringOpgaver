import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        minSek();

    }
    public static void minSek() {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Skriv hvor mange Sekunder du har: ");
        int Sekunder = input.nextInt();

        int minutter = Sekunder / 60; // Find minutter in Sekunder
        int overflødigeSekunder = Sekunder % 60; // Seconds remaining
        System.out.println(Sekunder + " Sekunder is " + minutter +
                " minutter og " + overflødigeSekunder + " Sekunder");
    }
}
class FahrenheitToCelsius {
    public static void main(String[] args) {
        FahrenToCelsius();
    }
    public static void FahrenToCelsius(){
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv graden i fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " er Celsius");
    }
}
class ShowCurrentTime {
    public static void main(String[] args) {
        CurrentTime();
    }

    public static void  CurrentTime() {


        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long alleMillisekunder = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSekunder= alleMillisekunder / 1000;

        // Compute the current second in the minute in the hour
        long nuværendesekundt = totalSekunder % 60;

        // Obtain the total minutes
        long alleminuterne = totalSekunder / 60;

        // Compute the current minute in the hour
        long alleMinutterneITimen = alleminuterne % 60;

        // Obtain the total hours
        long Alletimerne = alleminuterne / 60;

        // Compute the current hour
        long nuværerndetime = Alletimerne % 24;

        // Display results
        System.out.println("klokken er nu " + nuværerndetime + ":"
                + alleMinutterneITimen + ":" + nuværendesekundt + " GMT");
    }
}
class ComputeLoan {
    public static void main(String[] args) {
        Computerlån();
    }
    public static void Computerlån(){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter yearly interest rate
        System.out.print("Skriv årlig rentesats, f.eks 8.25: ");
        double årligRente = input.nextDouble();

        // Obtain monthly interest rate
        double månedligRente = årligRente / 1200;

        // Enter number of years
        System.out.print(
                "Skriv hvor mange år som eninteger, f.eks 5: ");
        int år = input.nextInt();

        // Enter loan amount
        System.out.print("hvor meget låner du, f.eks 12000: $");
        double låneBeløb = input.nextDouble();

        // Calculate payment
        double Måndeligbetaling = låneBeløb * månedligRente / (1
                - 1 / Math.pow(1 + månedligRente, år * 12));
        double samletBetaling = Måndeligbetaling * år * 12;

        // Display results
        System.out.println("Den måndlige betaling er $" +
                (int)(Måndeligbetaling * 100) / 100.0);
        System.out.println("Den totale betaling er $" +
                (int)(samletBetaling * 100) / 100.0);
    }
}
class ComputeChange {
    public static void main(String[] args) {
        ComputeChanger();
    }

    public static void ComputeChanger(){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the beløb
        System.out.print(
                "Skriv antal af dollars i decimaltal, f.eks 11.56: ");
        double beløb = input.nextDouble();

        int resterendeBeløb = (int)(beløb * 100);

        // Find the number of one dollars
        int Dollars = resterendeBeløb / 100;
        resterendeBeløb = resterendeBeløb % 100;

        // Find the number of quarters in the remaining beløb
        int Quarters = resterendeBeløb / 25;
        resterendeBeløb = resterendeBeløb % 25;

        // Find the number of dimes in the remaining beløb
        int Dimes = resterendeBeløb / 10;
        resterendeBeløb = resterendeBeløb % 10;

        // Find the number of nickels in the remaining beløb
        int Nickels = resterendeBeløb / 5;
        resterendeBeløb = resterendeBeløb % 5;

        // Find the number of pennies in the remaining beløb
        int Pennies = resterendeBeløb;

        // Display results
        System.out.println("Your beløb " + beløb + " consists of");
        System.out.println("    " + Dollars + " dollars");
        System.out.println("    " + Quarters + " quarters ");
        System.out.println("    " + Dimes + " dimes");
        System.out.println("    " + Nickels + " nickels");
        System.out.println("    " + Pennies + " pennies");
    }
}
