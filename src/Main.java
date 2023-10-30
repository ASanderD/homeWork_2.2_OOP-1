public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер", 95, 95, 95, 95, 95);
        GryffindorStudent hermionaGreyndger = new GryffindorStudent("Гермиона Грейнджер", 85, 90, 85, 70, 75);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Уизли", 75, 70, 70, 85, 65);

        SlytherinStudent drakoMalfoy = new SlytherinStudent("Драко Малфой", 90, 80, 50, 30, 95, 30, 100);
        SlytherinStudent grahamMontague = new SlytherinStudent("Грэхэм Монтегю", 70, 70, 30, 90, 55, 20, 50);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гойл", 50, 30, 70, 85, 65, 60, 70);


        HufflepuffStudent zachariahSmith = new HufflepuffStudent("Захария Смит", 60, 60, 50, 30, 95);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори", 50, 30, 30, 90, 55);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 50, 60, 70, 85, 65);


        RavenclawStudent zhouChang = new RavenclawStudent("Чжоу Чанг", 85, 80, 50, 30, 95, 30);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 70, 70, 30, 90, 55, 20);
        RavenclawStudent marcusBelbi = new RavenclawStudent("Маркус Белби", 50, 30, 70, 85, 65, 60);

        //Вызовы методов по заданию
        harryPotter.compareStudentsOfGryffindor(ronWeasley);
        zachariahSmith.compareStudentsOfHufflepuff(cedricDiggory);
        harryPotter.printInfoAboutStudents();
        drakoMalfoy.printInfoAboutStudents();
        drakoMalfoy.compareStudentsOfSlitherin(grahamMontague);

        /*4. Реализуйте метод, который сравнивает двух любых учеников Хогвартса
        по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        - Пример
        Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.*/

        harryPotter.compareStudentsBasicProperties(drakoMalfoy);
    }
}
