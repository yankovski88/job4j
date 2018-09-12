package ru.job4j.DummyBotTest;

import org.junit.Test;
import ru.job4j.DummyBot.DummyBot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."),
                is("Привет, умник")

        );
    }
    @Test
    public void whenBuyBot(){
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("123"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}