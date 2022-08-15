package h_2;

public class h_2 {
    public static void main(String[] args) {
        String str1 = "hello i am javist";
        String str2 = "java";
        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);
        System.out.print("1. The smallest window in the string containing all characters of the other string: "
                + SearchSmallWind(str1, str2) + "\n");
        System.out.println("2. Whether one row is a rotation of another: " + SpinLine(str1, str2));
        System.out.println("3. "+Reverse(str1));
        int a = 3; int b = 56;
        System.out.println("4. "+NumberToString(a, b));
        System.out.println("5. "+ReplaceTheSymbol(a, b));
        System.out.println("6. "+ReplaceTheSymbol2(a, b));
        
    }

    // Task 1
    // Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей
    // все символы другой строки

    static String SearchSmallWind(String first, String second) {
        int in_str[] = new int[256];
        int out_str[] = new int[256];

        for (int i = 0; i < second.length(); i++)
            out_str[second.charAt(i)]++;
        int ctr = 0, start = 0, start_index = -1, min_length = Integer.MAX_VALUE;
        for (int j = 0; j < first.length(); j++) {
            in_str[first.charAt(j)]++;
            if (out_str[first.charAt(j)] != 0 && in_str[first.charAt(j)] <= out_str[first.charAt(j)])
                ctr++;
            if (ctr == second.length()) {
                while (in_str[first.charAt(start)] > out_str[first.charAt(start)]
                        || out_str[first.charAt(start)] == 0) {
                    if (in_str[first.charAt(start)] > out_str[first.charAt(start)] || out_str[first.charAt(start)] == 0)
                        in_str[first.charAt(start)]--;
                    start++;
                }
                int length_window = j - start + 1;
                if (min_length > length_window) {
                    min_length = length_window;
                    start_index = start;

                }
            }
        }
        return first.substring(start_index, start_index + min_length);
    }

    // Task 2
    // Напишите программу на Java, чтобы проверить, являются ли две данные строки
    // вращением друг друга.


    static boolean SpinLine(String str1,String str2) {
    return (str1.length() == str2.length()) && ((str1+str1).contains(str2));
    }

    // Task 3
    // Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии

    static String Reverse(String str1){
        if (str1.length() == 0) {
            return "";
        }
        return str1.charAt(str1.length()-1) + Reverse(str1.substring(0,str1.length()-1));
    }
    
    // Task 4
    // Дано два числа, например 3 и 56, необходимо составить следующие строки: 
    // 3 + 56 = 59; 3 – 56 = -53; 3 * 56 = 168. 

    static String NumberToString(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" + ").append(b+" = ").append(a+b+"\n");
        num.append("   "+a).append(" - ").append(b+" = ").append(a-b+"\n");
        num.append("   "+a).append(" * ").append(b+" = ").append(a*b+"\n");
        return num.toString();
    }

    // Task 5
    // Замените символ “=” на слово “равно”
    // Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt()

    static String ReplaceTheSymbol(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" + ").append(b+" = ").append(a+b+"\n");
        num.deleteCharAt(7);
        num.insert(7, " равно ");
        return num.toString();
    }

    // Task 6
    // Замените символ “=” на слово “равно”
    // Используйте методы StringBuilder.replace()

    static String ReplaceTheSymbol2(int a,int b){
        StringBuilder num = new StringBuilder();
        num.append(a).append(" - ").append(b+" = ").append(a-b+"\n");
        num.replace(7, 8, "равно");
        return num.toString();
    }

}
