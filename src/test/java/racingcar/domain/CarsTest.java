package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.ui.ConsoleMessage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@DisplayName("자동차 세트 도메인 테스트")
class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("car1,car2,car3");
    }

    @Test
    @DisplayName("자동차 세트 생성 성공")
    void constructor() {
        // when
        assertThat(cars.getCarCount()).isEqualTo(3);
    }

    @ParameterizedTest(name = "{displayName} [input : {arguments}]")
    @ValueSource(strings = {" ", ",", "car1,", ",car1"})
    @DisplayName("1개 이하의 자동차 이름으로 자동차 세트를 생성하면 예외를 발생한다.")
    void constructorException1(String input) {
        // when & then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Cars(input))
                .withMessageMatching(ConsoleMessage.CARS_INVALID_NAMES_ERROR.getMessage());
    }

    @Test
    @DisplayName("동일한 이름으로 자동차 세트를 생성하면 예외를 발생한다.")
    void constructorException2() {
        // when & then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Cars("car1,car1"))
                .withMessageMatching(ConsoleMessage.CARS_DUPLICATED_NAMES_ERROR.getMessage());
    }
}
