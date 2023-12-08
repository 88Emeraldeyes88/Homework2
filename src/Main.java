// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            var dog = 8.0;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
            var weightFirstBoxer = 78.2;
            var weightSecondBoxer = 82.7;
            var totalWeight = weightFirstBoxer + weightSecondBoxer;
            System.out.println("Общая масса двух боксеров" + totalWeight + "кг");
            var weightDifference = weightSecondBoxer - weightFirstBoxer;
            System.out.println("Разница между массами боксеров" + weightDifference + "кг!");
            var massDifference = (weightSecondBoxer - weightFirstBoxer) % totalWeight;
            System.out.println("Разница масс боксеров" + massDifference + " кг");
            var totalTime = 640;
            var woker = 8;
            var totalslWokers = totalTime / woker;
            System.out.println("Всего работников в компании - " + totalslWokers + " человек");
            totalslWokers = totalslWokers + 94;
            System.out.println(totalslWokers);
            var totalWorkingHourse = totalslWokers * 8;
            System.out.println("Если в компании работает" + totalslWokers + " человек, то всего" + totalWorkingHourse + " часов работы может быть поделено между сотрудниками");





        }
    }
}