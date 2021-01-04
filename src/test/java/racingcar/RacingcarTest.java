package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class RacingcarTest {
    private Racingcar racingcar;

    @BeforeEach
    void setting() {
        racingcar = new Racingcar();
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "234"})
    void abc(String str){
        System.out.println(str);
    }

    @Test
    void getName() {
        assertThat(racingcar.getName("pobi,crong,honux")).isEqualTo(Arrays.asList("pobi","crong","honux"));
    }

    @Test
    void carNameCheck() {
        racingcar.getName("pobi, crong, honux");
        assertThat(racingcar.carNameCheck()).isLessThan(5);
    }

    @Test
    void randomNumber() {
        assertThat(RandomNumber.generate()).isBetween(0, 10);
    }



}