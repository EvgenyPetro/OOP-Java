package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Product bread = new Bread("Столичный", 25.0, 4, "шт", 5, "ржаная");
        Product milk = new Milk("Домик в деревне", 75.5, 5, "шт", 1, 3.2, 4);
        Product lemonade = new Lemonade("Буратино", 46.2, 2, "шт", 2);
        Product eggs = new Eggs("Куриные", 49.4, 3, "уп", 27, 10);
        Product toiletPaper = new ToiletPaper("Белоснежка", 7.8, 1, "уп", 8, 3);
        Product diapers = new Diapers("Хагис", 799.9, 2, "уп", 24, 4, 17, 8);
        Product masks = new Masks("Халк", 150.0, 3, "шт", 7, false);
        Product pacifier = new Pacifier("Силиконовая", 70.0, 6, "шт", 0, true);
        program.getInfo(bread);
        program.getInfo(milk);
        program.getInfo(lemonade);
        program.getInfo(eggs);
        program.getInfo(toiletPaper);
        program.getInfo(diapers);
        program.getInfo(masks);
        program.getInfo(pacifier);
    }
}
