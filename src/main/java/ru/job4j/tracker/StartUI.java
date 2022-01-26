package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ");
            UserAction userAction = userActions[select];
            run = userAction.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] userActions) {
        out.println("Menu");
        for (int j = 0; j < userActions.length; j++) {
            System.out.println(j + ". " + userActions[j].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] userActions = {
                new CreateAction(output), new ShowAllAction(output), new EditAction(output),  new DeleteItemAction(output),
                new FindItemByIdAction(output), new FindItemByNameAction(output), new ExitAction()
        };
        new StartUI(output).init(input, tracker, userActions);
    }
}