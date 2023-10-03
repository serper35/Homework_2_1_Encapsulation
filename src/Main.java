public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 70,50,90,85,95);
        Gryffindor ron = new Gryffindor("Ron Weasley", 50,50,70,60,65);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 90,90,100,100,70);

        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 70, 70, 70, 70, 70);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 60, 60, 60, 60, 60);
        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 50, 50, 50, 50, 50);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 40, 40, 40, 40, 40, 40);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 40, 40, 40, 40, 40, 40);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 45, 45, 45, 45, 45, 45);

        Slytherin drako = new Slytherin("Draco Lucius Malfoy", 85, 85, 90, 75, 90, 85, 100);
        Slytherin graham = new Slytherin("Graham Montague", 45, 55, 20, 25, 0, 5, 2);
        Slytherin gregory = new Slytherin("Gregory Goyle", 55, 45, 10, 15, 0, 10, 3);

        System.out.println(harry);
        harry.getBestStudentInFaculty(harry, ron);
        harry.getBestStudent(harry,cedric);

        System.out.println(cedric);
        cedric.getBestStudentInFaculty(cedric,justin);

        System.out.println(cho);
        cho.setMind(0);
        System.out.println(cho);
        cho.getBestStudentInFaculty(cho, padma);

        System.out.println(drako);
        drako.getBestStudentInFaculty(drako, graham);
    }
}