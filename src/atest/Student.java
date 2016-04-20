/**
 * Created by User on 06.04.2016.
 */
public class Student {
    protected String Name;
    protected String SecondName;
    protected String Exam;
    protected int AverageMark;
    protected Exam[] examsArray;
    protected int number;

    public Student(){
        this.examsArray = new Exam[10];
        this.number = 0;
    }

}
