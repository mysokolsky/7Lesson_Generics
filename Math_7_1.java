//#1 Создать класс для математических вычислений:
// Содержит 4 статических метода на сложение, вычитание, умножение, деление.
// Обработать ошибку деления на ноль. Методы должны быть Generic и принимать данные в разных форматах (строка, число)
//


public class Math_7_1 {

    public static void main(String[] args) {

        // выбираем 2 переменные  a и b. Они могут принимать значения типов чисел или строк


        String a = "15";
        Long b = 0L;
        String result;


//       так и не понял, зачем нам делать объект, если он вообще не нужен оказался
//        Calc<Integer,String> calc = new Calc<>();

        System.out.println();
        System.out.println("Программа Калькулятор!");
        System.out.println();


        System.out.print("Сложение:  a + b = " + a + " + " + b + " = ");
        result = Calc.sum(a,b);
        System.out.println(result);

        System.out.print("Вычитание:  a - b = " + a + " - " + b + " = ");
        result = Calc.vychit(a,b);
        System.out.println(result);

        System.out.print("Умножение:  a * b = " + a + " * " + b + " = ");
        result = Calc.proiz(a,b);
        System.out.println(result);


        System.out.print("Деление:   a / b = " + a + " / " + b + " = ");
        try {
            result = Calc.delen(a, b);
            System.out.println(result);
        } catch (Error e) {
            System.out.println();
            System.out.println();
            System.out.println("Делитель = 0.  На 0 делить нельзя!!!  Выберите другое число!");
        }


    }
}




