package ProjectOOPs;

public class MarksTester {
    public static void main(String[] args) {
        StudentA a = new StudentA(88,90,75);
        a.getPercentage();
        System.out.println("The average percentage of marks for student A are: "+a.getPercentage()+"%");
        StudentB b= new StudentB(95,77,84,71);
        System.out.println("The average percentage of marks for student B are: "+b.getPercentage()+"%");

    }
}
