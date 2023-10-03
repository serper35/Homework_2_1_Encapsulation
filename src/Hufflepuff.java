public class Hufflepuff extends Hogwarts {
    private int honesty;
    private int faith;
    private int hardworking;

    public Hufflepuff(String fullName, int magicPower, int trangressionDistance, int honesty, int faith, int hardworking) {
        super(fullName, magicPower, trangressionDistance);
        if (honesty <= 100 && faith <= 100 && hardworking <= 100) {
            this.hardworking = hardworking;
            this.faith = faith;
            this.honesty = honesty;
        } else {
            throw new RuntimeException("Введены некорректные данные.");
        }
    }

    public int getHonesty (){
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public String toString() {
        return  "Ученик - " + getFullName() + "\n--------------------" + "\nФакульетет - " + getClass() + ".\nСила магии - " + getMagicPower() + ".\nДальность трансгрессии - " + getTrangressionDistance()
                + ".\nЧестность - " + getHonesty() + ".\nВерность - " + getFaith() + ".\nТрудолюбивость - " + getHardworking() + ".\n";
    }

    public void getBestStudentInFaculty(Hufflepuff a, Hufflepuff b) {
        int totalA = a.getHonesty() + a.getFaith() + a.getHardworking();
        int totalB = b.getHonesty() + b.getFaith() + b.getHardworking();

        if (totalA > totalB) {
            System.out.println(a.getFullName() + " лучший Пуффендуец, чем " + b.getFullName() + ".\n");
        } else if (totalA == totalB) {
            System.out.println("Ученики: " + a.getFullName() + " и " + b.getFullName() + " равны по силе.\n");
        } else {
            System.out.println(b.getFullName() + " лучший Пуффендуец, чем " + a.getFullName() + ".\n");
        }
    }
}

