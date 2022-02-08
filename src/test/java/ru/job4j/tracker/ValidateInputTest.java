package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInputOne() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidInputMutiplyOne() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "4", "10"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected0 = input.askInt("Enter menu:");
        int selected1 = input.askInt("Enter menu:");
        int selected4 = input.askInt("Enter menu:");
        int selected10 = input.askInt("Enter menu:");
        int[] answer = { 0, 1, 4, 10};
        int[] selected = new int[]{selected0, selected1, selected4, selected10};
        assertThat(selected, is(answer));
    }

    @Test
    public void whenInvalidInputMinusOne() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-11"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-11));
    }
}