package sec16.sec12.parallel;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("신용권", 10, Student.Sex.MALE),
                new Student("박수미", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.parallelStream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(
                        () -> new MaleStudent(), //사용자 정의 컨테이너
                        (r, t) -> r.accumulate(t), //r(컨테이너), t(요소)
                        (r1, r2) -> r1.combine(r2)); //r1 + r2(병렬 처리에서 적용)

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
