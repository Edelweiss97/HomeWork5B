
public class Boss {

    private int bossHealth;
    private int bossDamage;
    private int bossDefenceType;
    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(int bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;


    }
    public void bossChangeDefence(){
        Random random = new Random();
        int r = random.nextInt(20);
        System.out.println(bossDefenceType + r);
    }
}