package academiaDev.model;

public class Enrollment {
    private Student student;
    private Course course;
    private double progress;

    public Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
        this.progress = 0;

        public Course getCourse(){
            return course;
        }

        public double getProgress(){
            return progress;
        }
        public void updateProgress(double progress){
            if (progress < 0 || progress > 100) {
                throw new IllegalArgumentExpection("Progress invalid");
            }
        }
        this.progress = progress;
    }
}