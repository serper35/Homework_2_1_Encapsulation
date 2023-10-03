public class Slytherin extends Hogwarts  {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String fullName, int magicPower, int trangressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, magicPower, trangressionDistance);
        if (cunning <= 100 && determination <= 100 && ambition <= 100 && resourcefulness <= 100 && thirstForPower <= 100) {
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.thirstForPower = thirstForPower;
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public String toString() {
        return "Ученик - " + getFullName() + "\n--------------------" + "\nФакульетет - " + getClass() + ".\nСила магии - " + getMagicPower() + ".\nДальность трансгрессии - " + getTrangressionDistance()
                + ".\nХитрость - " + getCunning() + ".\nРешительность - " + getDetermination() + ".\nАмбициозность - " + getAmbition() + ".\nНаходчивость - " + getResourcefulness() + ".\nЖажда власти - " + getThirstForPower()  + ".\n";
    }

    public void getBestStudentInFaculty(Slytherin a, Slytherin b) {
        int totalA = a.getCunning() + a.getDetermination() + a.getAmbition() + a.getResourcefulness() + a.getThirstForPower();
        int totalB = b.getCunning() + b.getDetermination() + b.getAmbition() + b.getResourcefulness() + b.getThirstForPower();

        if (totalA > totalB) {
            System.out.println(a.getFullName() + " лучший Слизеринец, чем " + b.getFullName() + ".\n");
        } else if (totalA == totalB) {
            System.out.println("Ученики: " + a.getFullName() + " и " + b.getFullName() + " равны по силе.\n");
        } else {
            System.out.println(b.getFullName() + " лучший Слизеринец, чем " + a.getFullName() + ".\n");
        }
    }
}
