package lecture5_exception.hometask.fraction;

public class Runner {
    public static void main(String[] args) {
        FractionNumber n1 = new FractionNumberImpl(1, 2);
        FractionNumber n2 = new FractionNumberImpl();
        FractionNumber n3 = n1.div(n2);
        System.out.println(n3.getValue());
    }
}