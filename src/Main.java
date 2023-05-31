public class Main {
    public static void main(String[] args) {
//        Задача 1
        sayHello(10);
        sayHello(-3);
        sayHello(0);
//        Задача 2
        checkName("Вячеслав");
        checkName("Марина");
        checkName("");
//        Задача 3
        showMultiple(new int[]{9, 999, 36, 59});
        showMultiple(new int[]{0, 21});
        showMultiple(new double[]{15.0, -17, -12});
        showMultiple(new double[]{0.0, 3});
    }

    //    Реализация задачи 1
    static void sayHello(int a) {
        if (a > 7) System.out.println("Привет");
    }

    //    Реализация задачи 2
    static void checkName(String name) {
        if (name.equals("Вячеслав")) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }

    //    Реализация задачи 3
    static void showMultiple(int[] nums) {
        for (int i : nums) {
            if (i % 3 == 0 && i != 0) System.out.println(i);
        }
    }
    static void showMultiple(double[] nums) {
        for (double i : nums) {
            if (i % 3 == 0 && i != 0) System.out.println(i);
        }
    }
}

//    Задача 4: последовательность [ ((())()(())] ] неправильная
//    Варианты изменения последовательности [ ((())()(())] ], чтобы она стала правильной:

//1.//      [ ((())) () [(())] ]
//2.//      [ ((())) () (()) [] ]
//3.//      [ [( (()) () ) (())] ]
//4.//      [ ( (()) () ) (()) ] []
//5.//      [ ((()) ()) (())] []