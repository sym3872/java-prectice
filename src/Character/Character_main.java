package Character;

public class Character_main {
    static void main(String[] args) {
        Character c1 = new Character("전사",100,30);
        Character c2 = new Character("마법사",70,40);

        c1.attack(c2);
        c2.attack(c1);
        c1.attack(c2);
        c1.attack(c2);
        c2.attack(c1);
        System.out.println("============결과============");
        c1.printInfo();
        c2.printInfo();
    }

}
