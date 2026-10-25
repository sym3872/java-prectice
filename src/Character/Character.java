package Character;

public class Character {
    String name;
    int hp;
    int attackPower;

    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }
    public void attack(Character target){
        if (hp>0){
            System.out.println(this.name+"->"+target.name);
            System.out.println(target.name+"가 "+this.attackPower+"의 피해를 받았습니다.");
            target.takeDamage(this.attackPower);
            target.isAlive();
        }
        else{
            System.out.println("체력이 0인 캐릭터는 공격할수없습니다.");
        }

    }
    public void takeDamage(int damage){
        hp -= damage;

        if(hp<0){
            hp = 0;
        }
    }
    public void isAlive(){
        if(hp<=0){
            System.out.println("캐릭터 사망!");
        }
    }

    public void printInfo(){
        System.out.println(name+":"+ hp);
    }
}
