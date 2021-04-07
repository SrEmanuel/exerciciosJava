package entities;

public class Student {
    public String name;
    public double t1, t2, t3;

    public double finalGrade(){
        return this.t1 + this.t2 + this.t3;
    }
    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }else {
            return 0.0;
        }
    }
}
