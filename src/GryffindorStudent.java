public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String student, int spellPower, int transgress, int nobility, int honor, int bravery) { //конструктор объектов типа GryffindorStudent
        super(student, spellPower, transgress);
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


    public int sumOfPropertiesOfStudents() {
        return nobility + honor + bravery;
    }

    public void compareStudentsOfGryffindor(GryffindorStudent gryffindorStudents) {
        int sumPropertiesOfFirstStudent = this.sumOfPropertiesOfStudents();
        int sumPropertiesOfSecondStudent = gryffindorStudents.sumOfPropertiesOfStudents();
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent>sumPropertiesOfSecondStudent) {
            System.out.println(getStudent() + " лучший Гриффиндорец, чем " + gryffindorStudents.getStudent());
        } else if (sumPropertiesOfFirstStudent < sumPropertiesOfSecondStudent) {
            System.out.println(gryffindorStudents.getStudent() + " лучший Гриффиндорец, чем " + getStudent());
        } else {
            System.out.println(gryffindorStudents.getStudent() + " равен " + getStudent());
        }
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
