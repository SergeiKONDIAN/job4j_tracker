package ru.job4j.tracker;

public class StartUI {

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
        System.out.println("Menu");
        for (int j = 0; j < userActions.length; j++) {
            System.out.println(j + ". " + userActions[j].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] userActions = {
                new CreateAction(), new ShowAllAction(), new EditAction(),  new DeleteItemAction(),
                new FindItemByIdAction(), new FindItemByNameAction(), new ExitAction()
        };
        new StartUI().init(input, tracker, userActions);
    }
}