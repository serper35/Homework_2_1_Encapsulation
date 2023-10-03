public abstract class Hogwarts {
    private int magicPower;
    private int trangressionDistance;

    private String fullName;

    public Hogwarts(String fullName, int magicPower, int trangressionDistance) {
        if (magicPower <= 100 && trangressionDistance <= 100)  {
            this.magicPower = magicPower;
            this.trangressionDistance = trangressionDistance;
            this.fullName = fullName;
        } else {
            throw new RuntimeException("Введены некорректные данные.");
        }
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDistance() {
        return trangressionDistance;
    }

    public void setTrangressionDistance(int trangressionDistance) {
        this.trangressionDistance = trangressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void getBestStudentInFaculty() {
    }

    public void getBestStudent(Hogwarts a, Hogwarts b) {
        int totalA = a.getMagicPower() + a.getTrangressionDistance();
        int totalB = b.getMagicPower() + b.getTrangressionDistance();

        if (totalA > totalB) {
            System.out.println(a.getFullName() + " обладает бОльшей мощностью магии, чем " + b.getFullName() + ".\n");
        } else if (totalA == totalB) {
            System.out.println("Ученики: " + a.getFullName() + " и " + b.getFullName() + " равны по силе.\n");
        } else {
            System.out.println(b.getFullName() + " обладает бОльшей мощностью магии, чем " + a.getFullName() + ".\n");
        }
    }
}
