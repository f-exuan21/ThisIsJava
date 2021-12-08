package sec08.Exercise.ex04;

public class MySqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("MysqlDao-select() 실행");
    }

    @Override
    public void insert() {
        System.out.println("MysqlDao-insert() 실행");
    }

    @Override
    public void update() {
        System.out.println("MysqlDao-update() 실행");
    }

    @Override
    public void delete() {
        System.out.println("MysqlDao-delete() 실행");
    }
}
