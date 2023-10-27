public class Slytherin extends Hogwarts {
    private int cunnning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, String faculty, int spellPower, int transgress, int cunnning, int determination, int ambition, int resourcefulness, int lustForPower) {//конструктор объектов типа Slytherin
        super(name, surname, faculty, spellPower, transgress);
        this.cunnning = cunnning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    //геттеры, сеттеры
    public int getCunning() {
        return cunnning;
    }

    public void setCunnning(int cunnning) {
        this.cunnning = cunnning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    //метод toString
    @Override
    public String toString() {
        return
                "Студент Слизерин Имя: " + getName()
                        + ", Фамилия: " + getSurname()
                        + ", Факультет: " + getFaculty()
                        + ", Сила магии: " + getSpellPower()
                        + ", Расстояние трансгрессии: " + getTransgress()
                        + ", хитрость: " + cunnning
                        + ", решительность: " + determination
                        + ", амбициозность: " + ambition
                        + ", находчивость: " + resourcefulness
                        + ", жажда власти: " + lustForPower;
    }
}
