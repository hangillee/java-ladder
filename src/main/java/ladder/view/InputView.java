package ladder.view;

import java.util.Scanner;

import static ladder.view.constants.InputViewMessages.*;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] getNames() {
        System.out.println(GET_NAME_MESSAGE);
        return scanner.nextLine().split(DELIMITER);
    }

    public static String[] getDrawResults() {
        System.out.println(GET_DRAW_RESULT_MESSAGE);
        return scanner.nextLine().split(DELIMITER);
    }

    public static int getCountOfLines() {
        System.out.println(GET_COUNT_OF_LINES_MESSAGE);
        return scanner.nextInt();
    }

    public static String getResult() {
        System.out.println(GET_RESULT_MESSAGE);
        return scanner.nextLine();
    }
}