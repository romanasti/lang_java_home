
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class h_1 {
  public static void main(String[] args) {
    int i = randomNumber();
    System.out.println("Случайное число = " + i);
    int n = countBit(i);
    System.out.printf("Старший бит числа = %d \nКратные = ", n);
    ArrayList<Integer> m1 = multiples(i, n);
    System.out.println(m1);
    ArrayList<Integer> m2 = non_rate(i, n);
    System.out.printf("Некратные = %s\n", m2);
    WriteToFile1(m1);
    WriteToFile2(m2);

  }
  // Task 1
  // Выбросить случайное целое число и сохранить в i

  static int randomNumber() {
    int num = (int) (Math.random() * 100) + 1;
    return num;
  }

  // Task 2
  // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

  static int countBit(int n) {
    int res = 1;
    while (n != 1) {
      n >>= 1;
      res++;
    }
    return res;
  }

  // Task 3
  // Найти все кратные n числа большие i и сохранить в массив m1

  static ArrayList<Integer> multiples(int i, int n) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int x = 1;
    while (x <= i) {
      if (x % n == 0)
        arr.add(x);
      x++;
    }
    return arr;
  }

  // Task 4
  // Найти все некратные n числа меньшие i и сохранить в массив m1

  static ArrayList<Integer> non_rate(int i, int n) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int x = 1;
    while (x <= i) {
      if (x % n != 0)
        arr.add(x);
      x++;
    }
    return arr;
  }

  // Task 5
  // Сохранить оба массива в файлы с именами m1 и m2 соответственно

    static void WriteToFile1(ArrayList<Integer> arr) {
      try (BufferedWriter writter = new BufferedWriter(new FileWriter("multiple"))) {
        for (Integer c : arr) {
          writter.write(c + "\n");
        }
      }
          catch (IOException ex) {
        ex.printStackTrace();
      }
    }

    static void WriteToFile2(ArrayList<Integer> arr) {
      try (BufferedWriter writter = new BufferedWriter(new FileWriter("non_rate"))) {
        for (Integer c : arr) {
          writter.write(c + "\n");
        }
      }
          catch (IOException ex) {
        ex.printStackTrace();
      }
    }

}
