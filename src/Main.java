public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = { //создание массива объектов типа Hogwarts
                new Hogwarts("Гарри", "Поттер", "Гриффиндор",95,95),
                new Hogwarts("Гермиона", "Грейнджер", "Гриффиндор",90,90),
                new Hogwarts("Рон", "Уизли", "Гриффиндор",75,70),
                new Hogwarts("Драко", "Малфой", "Слизерин",85,80),
                new Hogwarts("Грэхэм", "Монтегю", "Слизерин",70,70),
                new Hogwarts("Грегори", "Гойл", "Слизерин",50,30),
                new Hogwarts("Захария", "Смит", "Пуффендуй",60,60),
                new Hogwarts("Седрик", "Диггори", "Пуффендуй",50,30),
                new Hogwarts("Джастин", "Финч-Флетчли", "Пуффендуй",50,60),
                new Hogwarts("Чжоу", "Чанг", "Когтевран",70,80),
                new Hogwarts("Падма", "Патил", "Когтевран",50,40),
                new Hogwarts("Маркус", "Белби", "Когтевран",60,50),
        };

        Gryffindor[] studentsOfGryffindor = {//создание массива объектов типа Gryffindor
                new Gryffindor("Гарри", "Поттер", "Гриффиндор",95,95,95,95,95),
                new Gryffindor("Гермиона", "Грейнджер", "Гриффиндор",85,90,85,70,75),
                new Gryffindor("Рон", "Уизли", "Гриффиндор",75,70,70,85,65),
        };

        Slytherin[] studentsOfSlytherin = {//создание массива объектов типа Slytherin
                new Slytherin("Драко", "Малфой", "Слизерин",90,80,50,30,95,30,100),
                new Slytherin("Грэхэм", "Монтегю", "Слизерин",70,70,30,90,55,20,50),
                new Slytherin("Грегори", "Гойл", "Слизерин",50,30,70,85,65,60,70),
        };

        Hufflepuff[] studentsOfHufflepuff = { //создание массива объектов типа Hufflepuff
                new Hufflepuff("Захария", "Смит", "Пуффендуй",60,60,50,30,95),
                new Hufflepuff("Седрик", "Диггори", "Пуффендуй",50,30,30,90,55),
                new Hufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй",50,60,70,85,65),
        };

        Ravenclaw[] studentsOfRavenclaw = { //создание массива объектов типа Ravenclaw
                new Ravenclaw("Чжоу", "Чанг", "Когтевран", 85, 80, 50, 30, 95, 30),
                new Ravenclaw("Падма", "Патил", "Когтевран", 70, 70, 30, 90, 55, 20),
                new Ravenclaw("Маркус", "Белби", "Когтевран", 50, 30, 70, 85, 65, 60),
        };

        //Вызовы методов по заданию

        PrintStudents printStudents = new PrintStudents();
        printStudents.printStudentsOfHogwarts(students);
        printStudents.printStudentsOfGryffindor(studentsOfGryffindor);
        printStudents.printStudentsOfSlytherin(studentsOfSlytherin);
        printStudents.printStudentsOfHufflepuff(studentsOfHufflepuff);
        printStudents.printStudentsOfRavenclaw(studentsOfRavenclaw);

        CompareStudents compareStudents = new CompareStudents();
        compareStudents.compareStudentsOfGryffindor(studentsOfGryffindor, "Грейнджер", "Поттер");
        compareStudents.compareStudentsOfSlytherin(studentsOfSlytherin,"Гойл","Монтегю");
        compareStudents.compareStudentsOfHufflepuff(studentsOfHufflepuff,"Диггори","Смит");
        compareStudents.compareStudentsOfRavenclaw(studentsOfRavenclaw,"Чанг","Белби");
        System.out.println();
        compareStudents.compareStudentsOfHogwarts(students, "Смит", "Белби");

        System.out.println();
        studentsOfRavenclaw[0].setWise(99); //изменение одного из свойств студента
        System.out.println(studentsOfRavenclaw[0]);// вывод в консоль информации о студенте с учетом изменений

    }
}