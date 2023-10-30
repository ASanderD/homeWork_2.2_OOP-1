public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String student, int spellPower, int transgress, int smart, int wise, int witty, int creativity) { //конструктор объектов типа RavenclawStudent
        super(student, spellPower, transgress);
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

    public void setCreativity(int Creativity) {
        this.creativity = Creativity;
    }

    public int sumOfPropertiesOfStudents() {
        return smart + wise + witty + creativity;
    }

    public void compareStudentsOfRavenclaw(RavenclawStudent ravenclawStudent) {
        int sumPropertiesOfFirstStudent = this.sumOfPropertiesOfStudents();
        int sumPropertiesOfSecondStudent = ravenclawStudent.sumOfPropertiesOfStudents();
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(getStudent() + " лучший Когтевранец, чем " + ravenclawStudent.getStudent());
        } else if (sumPropertiesOfFirstStudent < sumPropertiesOfSecondStudent) {
            System.out.println(ravenclawStudent.getStudent() + " лучший Когтевранец, чем " + getStudent());
        } else {
            System.out.println(ravenclawStudent.getStudent() + " равен " + getStudent());
        }
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
