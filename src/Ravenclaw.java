public class Ravenclaw extends Hogwarts  {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String fullName, int magicPower, int trangressionDistance, int mind, int wisdom, int wit, int creation) {
        super(fullName, magicPower, trangressionDistance);
        if (mind <= 100 && wisdom <= 100 && wit <= 100 && creation <= 100) {
            this.mind = mind;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creation = creation;
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String toString() {
        return  "Ученик - " + getFullName() + "\n--------------------" + "\nФакульетет - " + getClass() + ".\nСила магии - " + getMagicPower() + ".\nДальность трансгрессии - " + getTrangressionDistance()
                + ".\nУм - " + getMind() + ".\nМудрость - " + getWisdom() + ".\nОстроумие - " + getWit() + ".\nТворчество - " + getCreation()  + ".\n";
    }

    public void getBestStudentInFaculty(Ravenclaw a, Ravenclaw b) {
        int totalA = a.getMind() + a.getWit() + a.getWisdom() + a.getCreation();
        int totalB = b.getMind() + b.getWit() + b.getWisdom() + b.getCreation();

        if (totalA > totalB) {
            System.out.println(a.getFullName() + " лучший Когтевранец, чем " + b.getFullName() + ".\n");
        } else if (totalA == totalB) {
            System.out.println("Ученики: " + a.getFullName() + " и " + b.getFullName() + " равны по силе.\n");
        } else {
            System.out.println(b.getFullName() + " лучший Когтевранец, чем " + a.getFullName() + ".\n");
        }
    }
}
