public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, String faculty, int spellPower, int transgress, int hardworking, int loyal, int honest) { //конструктор объектов типа Hufflepuff
        super(name, surname, faculty, spellPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    //геттеры, сеттеры
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    //метод toString
    @Override
    public String toString() {
        return
                "Студент Пуффендуй Имя: " + getName()
                        + ", Фамилия: " + getSurname()
                        + ", Факультет: " + getFaculty()
                        + ", Сила магии: " + getSpellPower()
                        + ", Расстояние трансгрессии: " + getTransgress()
                        + ", Благородство: " + hardworking
                        + ", Честь: " + loyal
                        + ", Храбрость: " + honest;
    }
}
