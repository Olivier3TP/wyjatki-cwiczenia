import java.lang.foreign.PaddingLayout;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            System.out.println(silnia(5));
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Adress adress = new Adress("12-122", "Wrocław", "123", "Długosza");
    }
    public static int silnia(int n){
        if(n < 0){
            throw new IllegalArgumentException("numer must be a positive number");
        }
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}