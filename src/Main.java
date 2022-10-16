public class Main {
    public static void main(String[] args) {
        CreditCard card_1 = new CreditCard("134ASDB1323234", 400);
        CreditCard card_2 = new CreditCard("458ASHS1327734", 600);
        CreditCard card_3 = new CreditCard("654ASPB1324654", 550);
        System.out.println("Текущее состояние всех 3х карточек");
        System.out.println();
        card_1.zachislenie(60);
        card_2.zachislenie(130);
        card_3.spisanie(70);
        card_1.info();
        System.out.println();
        card_2.info();
        System.out.println();
        card_3.info();
    }
}