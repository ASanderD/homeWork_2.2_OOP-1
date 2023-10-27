public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int spellPower;
    private int transgress;

    public Hogwarts(String name, String surname, String faculty, int spellPower, int transgress) { //конструктор объектов типа Hogwarts
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.spellPower = spellPower;
        this.transgress = transgress;
    }

    //геттеры, сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    //метод toString
    @Override
    public String toString() {
        return
                " Имя: " + name
                        + ", Фамилия: " + surname
                        + ", Факультет: " + faculty
                        + ", Сила магии: " + spellPower
                        + ", Расстояние трансгрессии: " + transgress;
    }
}
