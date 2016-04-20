/**
 * Created by User on 06.04.2016.
 */
public class Exam {

    protected String Subject;
    protected int Mark;

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setMark(int Mark) {
        this.Mark = Mark;
    }
    public String toString() {
        String result = "About Exam \nSubject: " + this.Subject + "\nMark: " + this.Mark ;
        return result;
    }
}
