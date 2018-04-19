package buldingnursury;

import java.io.Serializable;

public class subject implements Serializable {

    private String subject_name;
    private String subject_id;
    private String dept_type;
    private int level;
    private double score = 0;

    static private int subject_number = 0;

    public subject() {
    }

    public subject(String subject_name, String dept_type, int level) {
        this.subject_name = subject_name;
        this.subject_id = setSubject_id(subject_name, dept_type);
        this.dept_type = dept_type;
        this.level = level;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public String setSubject_id(String s, String dept_type) {

        if (dept_type.equalsIgnoreCase("english")) {
            if (s.contains("math")) {
                return "ED-M" + this.level + this.getSubject_number();
            } else {
                if (s.contains("english")) {
                    return "ED-E" + this.level + this.getSubject_number();
                } else {
                    return "ED-A" + this.level + this.getSubject_number();
                }
            }

        } else 
            if (s.contains("math")) {
            return "AD-M" + this.level + this.getSubject_number();
        } else {
            if (s.contains("english")) {
                return "AD-E" + this.level + this.getSubject_number();
            } else {
                return "AD-A" + this.level + this.getSubject_number();
            }
        }

    }

    public String getDept_type() {
        return dept_type;
    }

    public void setDept_type(String dept_type) {
        this.dept_type = dept_type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int getSubject_number() {
        setSubject_number();
        return subject_number;
    }

    public static void setSubject_number() {
        subject.subject_number++;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "subject{" + "subject_name=" + subject_name + ", subject_id=" + subject_id + ", score=" + score + '}';
    }

}
