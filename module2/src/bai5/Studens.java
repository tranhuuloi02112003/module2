package bai5;

public class Studens {
    private String name = "John";
    private String classes = "C02";

    public Studens() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
class TestStudent{
    public static void main(String[] args) {
        Studens student = new Studens();
        student.setName("Loi");
        student.setClasses("TPM15");
    }
}
