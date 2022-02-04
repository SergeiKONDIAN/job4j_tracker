package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
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
        int[] selected = new int[4];
        for (int i = 0; i < 4; i++) {
            selected[i] = input.askInt("Enter menu:");
        }
        int[] answer = {0, 1, 4, 10};
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