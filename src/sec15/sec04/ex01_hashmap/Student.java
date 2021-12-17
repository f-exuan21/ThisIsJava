package sec15.sec04.ex01_hashmap;

public class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return sno + name.hashCode();
        //Objects.hash(sno, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            if(student.sno == sno && student.name.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
