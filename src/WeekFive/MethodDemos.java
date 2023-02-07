package WeekFive;

public class MethodDemos {
    public static void main(String[] args){
        calculateTotalPay();
        int fahrenheit= 43;
        System.out.printf("Celcius: %.1f\n",convertToCelsius(fahrenheit));

    }public static void calculateTotalPay(){
        int totalPay=2+2;
        System.out.println(totalPay);
    }
    public static Double convertToCelsius(int f_temp){
        double celsius=(f_temp-32)*5.0/9;
        return celsius;
    }
}
