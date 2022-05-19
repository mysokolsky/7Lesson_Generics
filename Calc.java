
public class Calc {


    public static <Type1,Type2> String sum(Type1 a, Type2 b){

        Number result = typeA(a)+typeB(b);
        return result.toString();
    }

    public static <Type1,Type2> String proiz(Type1 a, Type2 b) {

        Number result = typeA(a) * typeB(b);
        return result.toString();
    }

    public static <Type1,Type2> String vychit(Type1 a, Type2 b){

        Number result = typeA(a)-typeB(b);
        return result.toString();
    }

    public static <Type1,Type2> String delen(Type1 a, Type2 b) {

            // если делитель = 0, то создаём ошибку и потом её обрабатываем в Main
            if (typeB(b) == 0)
                throw new Error("Деление на 0!!!");

        Number result = typeA(a) / typeB(b);
        return result.toString();
    }


    // методы ниже преобразуют значения a и b сначала в строку, а потом в число типа double

    public static <Type1> double typeA(Type1 a) {
        return Double.parseDouble(a.toString());
    }

    public static <Type2> double typeB(Type2 b) {
        return Double.parseDouble(b.toString());
    }


}