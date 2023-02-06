
public class Recursividad {
    public  void Binario(int n) {
        if (n < 2) {
            System.out.println(n);
        } else {
            Binario(n / 2);
            System.out.println(n % 2);
        }
    }
    
}
