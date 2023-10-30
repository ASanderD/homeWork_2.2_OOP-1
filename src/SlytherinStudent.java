public class SlytherinStudent extends HogwartsStudent {
    private int cunnning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String student, int spellPower, int transgress, int cunnning, int determination, int ambition, int resourcefulness, int lustForPower) {//конструктор объектов типа SlytherinStudent
        super(student, spellPower, transgress);
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

    public int sumOfPropertiesOfStudents() {
        return cunnning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareStudentsOfSlitherin(SlytherinStudent slytherinStudent) {
        int sumPropertiesOfFirstStudent = this.sumOfPropertiesOfStudents();
        int sumPropertiesOfSecondStudent = slytherinStudent.sumOfPropertiesOfStudents();
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(getStudent() + " лучший Слизеринец, чем " + slytherinStudent.getStudent());
        } else if (sumPropertiesOfFirstStudent < sumPropertiesOfSecondStudent) {
            System.out.println(slytherinStudent.getStudent() + " лучший Слизеринец, чем " + getStudent());
        } else {
            System.out.println(slytherinStudent.getStudent() + " равен " + getStudent());
        }
    }

    //метод toString
    @Override
    public String toString() {
        return
                "Студент Слизерин Имя: " + super.toString()
                        + ", хитрость: " + cunnning
                        + ", решительность: " + determination
                        + ", амбициозность: " + ambition
                        + ", находчивость: " + resourcefulness
                        + ", жажда власти: " + lustForPower;
    }
}
