public class CompareStudents { // класс для реализации методов сравнения студентов
    public void compareStudentsOfGryffindor(Gryffindor[] studentsOfGryffindor, String surnameOfFirstStudent, String surnameOfSecondStudent) { //метод для сравнения 2-х студентов факультета Гриффиндор
        int sumPropertiesOfFirstStudent = 0; //создание целочисленной переменной для подсчета суммы баллов свойств 1 студента
        int sumPropertiesOfSecondStudent = 0; //создание целочисленной переменной для подсчета суммы баллов свойств 2 студента
        boolean equalOfFirstStudent = false; // логическая переменная для проверки на наличие 1 студента на факультете
        boolean equalOfSecondStudent = false; // логическая переменная для проверки на наличие 2 студента на факультете

        for (int i = 0; i < studentsOfGryffindor.length; i++) { // Проверка наличия студента на факультете
            if (surnameOfFirstStudent.equals(studentsOfGryffindor[i].getSurname())) {
                equalOfFirstStudent = true;
            }
            if (surnameOfSecondStudent.equals(studentsOfGryffindor[i].getSurname())) {
                equalOfSecondStudent = true;
            }
        }
        if (!equalOfFirstStudent) {
            System.out.println("Студент " + surnameOfFirstStudent + " не учится на факультете Пуффендуй");
            return;
        }
        if (!equalOfSecondStudent) {
            System.out.println("Студент " + surnameOfSecondStudent + " не учится на факультете Пуффендуй");
            return;
        }

        for (int i = 0; i < studentsOfGryffindor.length; i++) {
            if (surnameOfFirstStudent.equals(studentsOfGryffindor[i].getSurname())) {
                sumPropertiesOfFirstStudent = studentsOfGryffindor[i].getNobility() + studentsOfGryffindor[i].getHonor() + studentsOfGryffindor[i].getBravery();
            }
            if (surnameOfSecondStudent.equals(studentsOfGryffindor[i].getSurname())) {
                sumPropertiesOfSecondStudent = studentsOfGryffindor[i].getNobility() + studentsOfGryffindor[i].getHonor() + studentsOfGryffindor[i].getBravery();
            }
        }
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " лучший Гриффиндорец, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " лучший Гриффиндорец, чем " + surnameOfFirstStudent);
        }
    }

    public void compareStudentsOfSlytherin(Slytherin[] studentsOfSlytherin, String surnameOfFirstStudent, String surnameOfSecondStudent) { //метод для сравнения 2-х студентов факультета Слизерин
        int sumPropertiesOfFirstStudent = 0;
        int sumPropertiesOfSecondStudent = 0;
        boolean equalOfFirstStudent = false;
        boolean equalOfSecondStudent = false;

        for (int i = 0; i < studentsOfSlytherin.length; i++) {// Проверка наличия студента на факультете
            if (surnameOfFirstStudent.equals(studentsOfSlytherin[i].getSurname())) {
                equalOfFirstStudent = true;
            }
            if (surnameOfSecondStudent.equals(studentsOfSlytherin[i].getSurname())) {
                equalOfSecondStudent = true;
            }
        }
        if (!equalOfFirstStudent) {
            System.out.println("Студент " + surnameOfFirstStudent + " не учится на факультете Пуффендуй");
            return;
        }
        if (!equalOfSecondStudent) {
            System.out.println("Студент " + surnameOfSecondStudent + " не учится на факультете Пуффендуй");
            return;
        }

        for (int i = 0; i < studentsOfSlytherin.length; i++) {
            if (surnameOfFirstStudent.equals(studentsOfSlytherin[i].getSurname())) {
                sumPropertiesOfFirstStudent = studentsOfSlytherin[i].getCunning() + studentsOfSlytherin[i].getDetermination() + studentsOfSlytherin[i].getAmbition() + studentsOfSlytherin[i].getResourcefulness() + studentsOfSlytherin[i].getLustForPower();
            }
            if (surnameOfSecondStudent.equals(studentsOfSlytherin[i].getSurname())) {
                sumPropertiesOfSecondStudent = studentsOfSlytherin[i].getCunning() + studentsOfSlytherin[i].getDetermination() + studentsOfSlytherin[i].getAmbition() + studentsOfSlytherin[i].getResourcefulness() + studentsOfSlytherin[i].getLustForPower();
            }
        }
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " лучший Слизеринец, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " лучший Слизеринец, чем " + surnameOfFirstStudent);
        }
    }

    public void compareStudentsOfHufflepuff(Hufflepuff[] studentsOfHufflepuff, String surnameOfFirstStudent, String surnameOfSecondStudent) { //метод для сравнения 2-х студентов факультета Пуффендуй
        int sumPropertiesOfFirstStudent = 0;
        int sumPropertiesOfSecondStudent = 0;
        boolean equalOfFirstStudent = false;
        boolean equalOfSecondStudent = false;

        for (int i = 0; i < studentsOfHufflepuff.length; i++) { // Проверка наличия студента на факультете
            if (surnameOfFirstStudent.equals(studentsOfHufflepuff[i].getSurname())) {
                equalOfFirstStudent = true;
            }
            if (surnameOfSecondStudent.equals(studentsOfHufflepuff[i].getSurname())) {
                equalOfSecondStudent = true;
            }
        }
        if (!equalOfFirstStudent) {
            System.out.println("Студент " + surnameOfFirstStudent + " не учится на факультете Пуффендуй");
            return;
        }
        if (!equalOfSecondStudent) {
            System.out.println("Студент " + surnameOfSecondStudent + " не учится на факультете Пуффендуй");
            return;
        }

        for (int i = 0; i < studentsOfHufflepuff.length; i++) {

            if (surnameOfFirstStudent.equals(studentsOfHufflepuff[i].getSurname())) {
                sumPropertiesOfFirstStudent = studentsOfHufflepuff[i].getHardworking() + studentsOfHufflepuff[i].getLoyal() + studentsOfHufflepuff[i].getHonest();
            }
            if (surnameOfSecondStudent.equals(studentsOfHufflepuff[i].getSurname())) {
                sumPropertiesOfSecondStudent = studentsOfHufflepuff[i].getHardworking() + studentsOfHufflepuff[i].getLoyal() + studentsOfHufflepuff[i].getHonest();
            }
        }
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " лучший Пуффендуец, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " лучший Пуффендуец, чем " + surnameOfFirstStudent);
        }
    }

    public void compareStudentsOfRavenclaw(Ravenclaw[] studentsOfRavenclaw, String surnameOfFirstStudent, String surnameOfSecondStudent) { //метод для сравнения 2-х студентов факультета Когтевран
        int sumPropertiesOfFirstStudent = 0;
        int sumPropertiesOfSecondStudent = 0;
        boolean equalOfFirstStudent = false;
        boolean equalOfSecondStudent = false;

        for (int i = 0; i < studentsOfRavenclaw.length; i++) { // Проверка наличия студента на факультете
            if (surnameOfFirstStudent.equals(studentsOfRavenclaw[i].getSurname())) {
                equalOfFirstStudent = true;
            }
            if (surnameOfSecondStudent.equals(studentsOfRavenclaw[i].getSurname())) {
                equalOfSecondStudent = true;
            }
        }
        if (!equalOfFirstStudent) {
            System.out.println("Студент " + surnameOfFirstStudent + " не учится на факультете Пуффендуй");
            return;
        }
        if (!equalOfSecondStudent) {
            System.out.println("Студент " + surnameOfSecondStudent + " не учится на факультете Пуффендуй");
            return;
        }

        for (int i = 0; i < studentsOfRavenclaw.length; i++) {
            if (surnameOfFirstStudent.equals(studentsOfRavenclaw[i].getSurname())) {
                sumPropertiesOfFirstStudent = studentsOfRavenclaw[i].getSmart() + studentsOfRavenclaw[i].getWise() + studentsOfRavenclaw[i].getWitty() + studentsOfRavenclaw[i].getCreativity();
            }
            if (surnameOfSecondStudent.equals(studentsOfRavenclaw[i].getSurname())) {
                sumPropertiesOfSecondStudent = studentsOfRavenclaw[i].getSmart() + studentsOfRavenclaw[i].getWise() + studentsOfRavenclaw[i].getWitty() + studentsOfRavenclaw[i].getCreativity();
            }
        }
        System.out.println("Сумма баллов 1 студента равна: " + sumPropertiesOfFirstStudent);
        System.out.println("Сумма баллов 2 студента равна: " + sumPropertiesOfSecondStudent);
        if (sumPropertiesOfFirstStudent > sumPropertiesOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " лучший Когтевранец, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " лучший Когтевранец, чем " + surnameOfFirstStudent);
        }
    }

    public void compareStudentsOfHogwarts(Hogwarts[] studentsOfHogwarts, String surnameOfFirstStudent, String surnameOfSecondStudent) { //метод для сравнения 2-х студентов Хогвартса
        int spellPowerOfFirstStudent = 0;
        int spellPowerOfSecondStudent = 0;
        int transgressOfFirstStudent = 0;
        int transgressOfSecondStudent = 0;
        boolean equalOfFirstStudent = false;
        boolean equalOfSecondStudent = false;

        for (int i = 0; i < studentsOfHogwarts.length; i++) {
            if (surnameOfFirstStudent.equals(studentsOfHogwarts[i].getSurname())) {// Проверка наличия студента в университете
                equalOfFirstStudent = true;
            }
            if (surnameOfSecondStudent.equals(studentsOfHogwarts[i].getSurname())) {
                equalOfSecondStudent = true;
            }
        }
        if (!equalOfFirstStudent) {
            System.out.println("Студент " + surnameOfFirstStudent + " не учится в Хогвартс");
            return;
        }
        if (!equalOfSecondStudent) {
            System.out.println("Студент " + surnameOfSecondStudent + " не учится в Хогвартс");
            return;
        }
        for (int i = 0; i < studentsOfHogwarts.length; i++) {
            if (studentsOfHogwarts[i].getSurname().equals(surnameOfFirstStudent)) {
                spellPowerOfFirstStudent = studentsOfHogwarts[i].getSpellPower();
                transgressOfFirstStudent = studentsOfHogwarts[i].getTransgress();
            }
            if (studentsOfHogwarts[i].getSurname().equals(surnameOfSecondStudent)) {
                spellPowerOfSecondStudent = studentsOfHogwarts[i].getSpellPower();
                transgressOfSecondStudent = studentsOfHogwarts[i].getTransgress();
            }
        }
        if (spellPowerOfFirstStudent > spellPowerOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " обладает большей мощностью магии, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " обладает большей мощностью магии, чем " + surnameOfFirstStudent);
        }
        if (transgressOfFirstStudent > transgressOfSecondStudent) {
            System.out.println(surnameOfFirstStudent + " обладает большим расстоянием трансгрессии, чем " + surnameOfSecondStudent);
        } else {
            System.out.println(surnameOfSecondStudent + " обладает большим расстоянием трансгрессии, чем " + surnameOfFirstStudent);
        }
    }
}
