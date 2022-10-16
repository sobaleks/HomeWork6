public class CreditCard {

    String schet;
    int sum;

    int zachislenie(int a) {
        sum = sum + a;
        return sum;
    }

    int spisanie(int b) {
        sum = sum - b;
        return sum;
    }

    void info() {
        System.out.println("Номер счета : " + schet);
        System.out.println("Сумма на карте " + sum);
    }

    public CreditCard(String schet, int sum) {
        this.schet = schet;
        this.sum = sum;
    }
}
