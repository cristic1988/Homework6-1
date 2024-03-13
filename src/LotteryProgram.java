import java.util.Arrays;
import java.util.Random;

public class LotteryProgram {

    public static void main(String[] args) {
        Random random = new Random();

        int[] firmLotteryNum = new int[9];
        int[] guessPlayerNum = new int[9];
        for (int index = 0; index < firmLotteryNum.length; index++){
            firmLotteryNum[index] = random.nextInt(9);
        }
        for (int index1 = 0; index1 < guessPlayerNum.length; index1++){
            guessPlayerNum[index1] = random.nextInt(9);
        }
        Arrays.sort(firmLotteryNum);
        System.out.println(Arrays.toString(firmLotteryNum));
        Arrays.sort(guessPlayerNum);
        System.out.println(Arrays.toString(guessPlayerNum));
        System.out.println("Кількість збігів: " + 2);





    }
}