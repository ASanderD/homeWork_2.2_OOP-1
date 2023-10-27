public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, String faculty, int spellPower, int transgress, int smart, int wise, int witty, int creativity) { //конструктор объектов типа Ravenclaw
        super(name, surname, faculty, spellPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    //геттеры, сеттеры
    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int fullOfCreativity) {
        this.creativity = fullOfCreativity;
    }

    //метод toString
    @Override
    public String toString() {
        return
                "Студент Когтевран Имя: " + super.toString()
                        + ", Ум: " + smart
                        + ", Мудрость: " + wise
                        + ", Остроумие: " + witty
                        + ", Творчество: " + creativity;
    }

}
