package java_steps.step3;

public class OperatorsForWhileIfSwitch {
    static void demoSimple(int myPetsNum) {
        if (myPetsNum > 5) {
            System.out.println("I have " + myPetsNum);
            System.out.println("You are crazy!");
        }else{
            System.out.println("How nice!");
        }
    }

    static void demoExt(int... myPetsNames) {

        //for можно использовать по-разному, например со счётчиком циклов
        for (int counter = 0; counter < myPetsNames.length; counter++) {
            System.out.println(myPetsNames[counter]);
        }

        //или с указателем на элемент коллекции - массива или списка
        for (int myPetsName : myPetsNames) {
            System.out.println(myPetsName);
        }

        //оператор цикла
        int index = 0;
        while (index < myPetsNames.length) {
            System.out.println(myPetsNames[index]);
            index++;
        }

        //оператор цикла который выполняется хотя бы один раз
        int index2 = 0;
        do {
            System.out.println(myPetsNames[index2]);
        } while (++index2 < myPetsNames.length);


        //оператор условия
        if (myPetsNames.length >= 5) {
            System.out.println("You are crazy!");
        } else if (myPetsNames.length == 4) {
            System.out.println("You are strange.");
        } else if (myPetsNames.length == 3) {
            System.out.println("What a zoo!");
        } else if (myPetsNames.length == 2) {
            System.out.println("Why so much?");
        } else
            System.out.println("How nice!");


        //можно использовать оператор ветвления
        if (myPetsNames.length >= 5) {
            System.out.println("You are crazy!");
        } else {
            switch (myPetsNames.length) {
                case 4:
                    System.out.println("You are strange.");
                    break;
                case 3:
                    System.out.println("What a zoo!");
                    break;
                case 2:
                    System.out.println("Why so much?");
                    break;
                case 1:
                    System.out.println("How nice!");
                    break;
            }
        }
    }
}