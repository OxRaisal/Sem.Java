import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Random random = new Random();

        int[] arr = new int[]{1, 1, 0, 1,1,1,1,1,1,1, 0, 1, 1, 1};
//        arr[0] = 1;
//        arr[1] = 1;

        int count = 0; //Счетчик количества подряд идущих 1
        int maxLength = 0; //Счетчик последней макс цепочки единичек

        for (int i = 0; i < arr.length; i++) {  //i = i + 1 и тоже самое что i += 1
            if (arr[i] == 1) {
                count++;
                if (count > maxLength) { //если текущая цепочка больше итоговой
                    maxLength = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println("Resul: " + maxLength);
    }
}
