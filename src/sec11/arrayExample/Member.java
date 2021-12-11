package sec11.arrayExample;

public class Member implements Comparable<Member> {
    String name;

    Member(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }
}
