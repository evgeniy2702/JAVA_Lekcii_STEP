package DesingPattern.MVC_Pattern;

import DesingPattern.MVC_Pattern.View.ConsoleHelper;

public class Run {

    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.getBookView().showBookMenu();
    }
}
