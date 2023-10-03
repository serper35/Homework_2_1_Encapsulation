public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int magicPower, int trangressionDistance, int nobility, int honor, int courage) {
        super(fullName, magicPower, trangressionDistance);
        if (nobility <= 100 && honor <= 100 && courage <= 100) {
            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
        } else {
            throw new RuntimeException("Введены некорректные данные.");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String toString() {
        return  "Ученик - " + getFullName() + "\n--------------------" + "\nФакульетет - " + getClass() + ".\nСила магии - " + getMagicPower() + ".\nДальность трансгрессии - " + getTrangressionDistance()
                + ".\nБлагородство - " + getNobility() + ".\nЧесть - " + getHonor() + ".\nХрабрость - " + getCourage() + ".\n";
    }

    public void getBestStudentInFaculty(Gryffindor a, Gryffindor b) {
        int totalA = a.getCourage() + a.getHonor() + a.getNobility();
        int totalB = b.getCourage() + b.getHonor() + b.getNobility();

        if (totalA > totalB) {
            System.out.println(a.getFullName() + " лучший Гриффиндорец, чем " + b.getFullName() + ".\n");
        } else if (totalA == totalB) {
            System.out.println("Ученики: " + a.getFullName() + " и " + b.getFullName() + " равны по силе.\n");
        } else {
            System.out.println(b.getFullName() + " лучший Гриффиндорец, чем " + a.getFullName() + ".\n");
        }
    }
}
