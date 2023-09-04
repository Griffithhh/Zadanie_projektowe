package Model;

public class Student {
    private String name;
    private String numberAlbumu;
    private String numberGroup;

    public Student(String imie, String numerAlbumu, String numerGrupy) {
        this.name = imie;
        this.numberAlbumu = numerAlbumu;
        this.numberGroup = numerGrupy;
    }

    public String getImie() {
        return name;
    }

    public String getNumerAlbumu() {
        return numberAlbumu;
    }

    public String getNumerGrupy() {
        return numberGroup;
    }

    @Override
    public String toString() {
        return "Student [imie=" + name + ", numerAlbumu=" + numberAlbumu + ", numerGrupy=" + numberGroup + "]";
    }

}