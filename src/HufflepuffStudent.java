public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String student, int spellPower, int transgress, int hardworking, int loyal, int honest) { //конструктор объектов типа HufflepuffStudent
        super(student, spellPower, transgress);
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

    public int sumOfPropertiesOfStudents() {
        return hardworking+loyal+honest;
    }

    public void compareStudentsOfHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int sumPropertiesOfFirstStudent = this.sumOfPropertiesOfStudents();
        int sumPropertiesOfSecondStudent = hufflepuffStudent.sumOfPropertiesOfStudents();
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(getStudent() + " лучший Пуфендуец, чем " + hufflepuffStudent.getStudent());
        } else if (sumPropertiesOfFirstStudent < sumPropertiesOfSecondStudent) {
            System.out.println(hufflepuffStudent.getStudent() + " лучший Пуфендуец, чем " + getStudent());
        } else {
            System.out.println(hufflepuffStudent.getStudent() + " равен " + getStudent());
        }
    }

    //метод toString
    @Override
    public String toString() {
        return
                "Студент Пуффендуй Имя: " + super.toString()
                        + ", Благородство: " + hardworking
                        + ", Честь: " + loyal
                        + ", Храбрость: " + honest;
    }
}
