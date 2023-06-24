// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 98 ; // вес в килограммах
        double height = 1.87; // рост в метрах
        int bmi = service.calculate(weight, height);

        System.out.println(bmi);



    }
}