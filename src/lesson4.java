import java.util.Objects;

public class lesson4 {
    public static void main(String[] args) {
        String ahead = "String"; //создание строковой переменной
        String ahead1 = new String("String"); //второй вариант создания строковой переменной
        String ahead2 = new String(new char[]{'S','t','r','i','n','g'});// создание переменной путем массива char
        String ahead3 = new String(new char[]{'S','t','r','i','n','g'},2,4);// создание переменной путем массива char c обозначением перемнных в массиве

        System.out.println(ahead3);
        System.out.println(ahead.length());//Ориентация размера стринговой переменной

        char[] result = ahead.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        } // данный метод используется для преобразования стрингового значения в массив симоволов с дальнейшим перечислением


        String bowl = " ";
        String s = null;
        System.out.println(bowl);
        System.out.println(bowl.length());
        System.out.println(bowl.isEmpty());// проверка на пустоту значения
        System.out.println(bowl.isBlank());//проверка на пустоту и наличие пробелов
        System.out.println(Objects.isNull(s));//проверка на null
        System.out.println(String.join(" + ",bowl,ahead,ahead3));// перечисление обьектов через джоин

        byte b = 10;
        System.out.println(String.valueOf(b));//изменение цифрового значения в строковое
        System.out.println(ahead.compareTo("String"));//находит количество отличий между стринговыми перменными

        System.out.println("pink".equals("pink"));//сравнивает строковые переменные
        System.out.println("pink".equals("Pink"));
        System.out.println("pink".equalsIgnoreCase("Pink"));//сравнивает строковые переменные игнорируя капс

        String number = "380687080522";
        System.out.println(number.startsWith("380"));//проверка на начало префиксного значения
    }
}
