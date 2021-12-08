package sec08.Exercise.ex04;

public class OracleDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("OracleDao-select() 실행");
    }

    @Override
    public void insert() {
        System.out.println("OracleDao-insert() 실행");
    }

    @Override
    public void update() {
        System.out.println("OracleDao-update() 실행");
    }

    @Override
    public void delete() {
        System.out.println("OracleDao-delete() 실행");
    }
}
