public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, String faculty, int spellPower, int transgress, int nobility, int honor, int bravery) { //конструктор объектов типа Gryffindor
        super(name, surname, faculty, spellPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    //геттеры, сеттеры
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    //метод toString
    @Override
    public String toString() {
        return
                "Студент Гриффиндор"+ super.toString()
                        + ", Благородство: " + nobility
                        + ", Честь: " + honor
                        + ", Храбрость: " + bravery;
    }
}
