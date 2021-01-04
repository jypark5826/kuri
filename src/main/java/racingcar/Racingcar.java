package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Racingcar {
    private List<String> carList;
    static int tryNum;
    Scanner sc = new Scanner(System.in);

    public void setTryNum() {
        System.out.println("시도할 횟수는 몇회인가요?");
        tryNum = sc.nextInt();

    }

   public List<String> getName(String s) {
        return carList = Arrays.asList(s.split(","));
    }

    public int carNameCheck(){
        return carList.size();
    }
}