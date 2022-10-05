package racingcar.ui;

public enum ConsoleMessage {

    CAR_NAME_ERROR("자동차 이름은 공백을 제외한 1자 이상, 5자 이하로 입력해야 합니다."),
    CARS_INVALID_NAMES_ERROR("유효한 이름으로 2개 이상 입력해야 합니다."),
    CARS_DUPLICATED_NAMES_ERROR("동일한 이름은 입력할 수 없습니다.");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
