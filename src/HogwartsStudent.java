public abstract class  HogwartsStudent {
    private String student;
    private int spellPower;
    private int transgress;

    public HogwartsStudent(String student, int spellPower, int transgress) { //конструктор объектов типа HogwartsStudets
        this.student = student;
        this.spellPower = spellPower;
        this.transgress = transgress;
    }

    //геттеры, сеттеры
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
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

    public void printInfoAboutStudents() { //метод, который выводит на экран описание студента
        System.out.println(this);
    }

    public void compareStudentsBasicProperties(HogwartsStudent hogwartsStudent) { //метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
        int spellPowerOfFirstStudent = this.spellPower;
        int spellPowersOfSecondStudent = hogwartsStudent.spellPower;
        int transgressOfFirstStudent = this.transgress;
        int transgressOfSecondStudent = hogwartsStudent.transgress;
        System.out.println("Мощность магии 1 студента равна: " + spellPowerOfFirstStudent);
        System.out.println("Мощность магии 2 студента равна: " + spellPowersOfSecondStudent);
        if (spellPowerOfFirstStudent>spellPowersOfSecondStudent) {
            System.out.println(getStudent() + " обладает большей мощностью магии, чем " + hogwartsStudent.getStudent());
        } else if (spellPowerOfFirstStudent < spellPowersOfSecondStudent) {
            System.out.println(hogwartsStudent.getStudent() + " обладает большей мощностью магии, чем " + getStudent());
        } else {
            System.out.println(hogwartsStudent.getStudent() + " равен " + getStudent());
        }
        System.out.println("Расстояние трансгрессии 1 студента равна: " + transgressOfFirstStudent);
        System.out.println("Расстояние трансгрессии 2 студента равна: " + transgressOfSecondStudent);
        if (transgressOfFirstStudent>transgressOfSecondStudent) {
            System.out.println(getStudent() + " обладает большим расстоянием трансгрессии, чем " + hogwartsStudent.getStudent());
        } else if (transgressOfFirstStudent < transgressOfSecondStudent) {
            System.out.println(hogwartsStudent.getStudent() + " обладает большеим расстоянием трансгрессии, чем " + getStudent());
        } else {
            System.out.println(hogwartsStudent.getStudent() + " равен " + getStudent());
        }
    }

        //метод toString
    @Override
    public String toString() {
        return
                " Имя: " + student
                        + ", Сила магии: " + spellPower
                        + ", Расстояние трансгрессии: " + transgress;
    }
}
