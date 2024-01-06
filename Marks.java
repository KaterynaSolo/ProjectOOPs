package ProjectOOPs;
/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor
of student A takes the marks in three subjects as its parameters and the
marks in four subjects as its parameters for student B. Test your code.
 */
 abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks{
    private int mathMark;
    private int scienceMark;
    private int chemistryMark;

    public StudentA(int mathMark, int scienceMark, int chemistryMark) {
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.chemistryMark = chemistryMark;
    }

    @Override
    double getPercentage() {
        int totalMarks=mathMark+scienceMark+chemistryMark;
        double avrPercentage = totalMarks/3.0;
        return avrPercentage;
    }
}
class StudentB extends Marks{
    private int mathMark;
    private int scienceMark;
    private int chemistryMark;
    private int englishMark;

    public StudentB(int mathMark, int scienceMark, int chemistryMark, int englishMark) {
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.chemistryMark = chemistryMark;
        this.englishMark = englishMark;
    }

    @Override
    double getPercentage() {
        int totalMarks= mathMark+scienceMark+chemistryMark+englishMark;
        double avrPercentage=  totalMarks/4.0;
        return avrPercentage;
    }
}
