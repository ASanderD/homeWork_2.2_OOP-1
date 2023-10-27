public class PrintStudents { // класс для реализации методов вывода информации в консоль

    public void printStudentsOfHogwarts(Hogwarts[] students) {// метод для вывода информации о студентах Хогвартса
        System.out.println("Количество студентов Хогвартс:" + students.length);// выводим информацию о количестве студентов Гриффиндора
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
    }

    public void printStudentsOfGryffindor(Gryffindor[] studentsOfGryffindor) {// метод для вывода информации о студентах Гриффиндор
        System.out.println("Количество студентов Гриффиндор: " + studentsOfGryffindor.length);// выводим информацию о количестве студентов Гриффиндора
        for (int i = 0; i < studentsOfGryffindor.length; i++) {
            System.out.println(studentsOfGryffindor[i]);
        }
        System.out.println();
    }

    public void printStudentsOfSlytherin(Slytherin[] studentsOfSlytherin) {// метод для вывода информации о студентах Слизерин
        System.out.println("Количество студентов Слизерин: " + studentsOfSlytherin.length);// выводим информацию о количестве студентов Пуффендуй
        for (int i = 0; i < studentsOfSlytherin.length; i++) {
            System.out.println(studentsOfSlytherin[i]);
        }
        System.out.println();
    }

    public void printStudentsOfHufflepuff(Hufflepuff[] studentsOfHufflepuff) { // метод для вывода информации о студентах Пуффендуй
        System.out.println("Количество студентов Пуффендуй: " + studentsOfHufflepuff.length);// выводим информацию о количестве студентов Пуффендуй
        for (int i = 0; i < studentsOfHufflepuff.length; i++) {
            System.out.println(studentsOfHufflepuff[i]);
        }
        System.out.println();
    }

    public void printStudentsOfRavenclaw(Ravenclaw[] studentsOfRavenclaw) {// метод для вывода информации о студентах Когтевран
        {
            System.out.println("Количество студентов Когтевран: " + studentsOfRavenclaw.length);// выводим информацию о количестве студентов Пуффендуй
            for (int i = 0; i < studentsOfRavenclaw.length; i++) {
                System.out.println(studentsOfRavenclaw[i]);
            }
            System.out.println();
        }
    }
}
