public class Main {

    public static void main(String[] args) {
        int number = 25;
        boolean isPrime = true;

        if(number == 1){
            System.out.printf("Sayi asal degildir : " + number);
            return;
        }
        if(number < 1){
            System.out.printf("Gecersiz sayi : " + number);
            return;
        }
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.printf("Sayi asaldir : " + number);
        }
        else{
            System.out.printf("Sayi asal degildir : " + number);
        }

    }
}
