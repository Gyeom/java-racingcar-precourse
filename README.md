# 자동차 경주 게임

## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇번의 이동을 할 것인지를 입력 할 수 있어야 한다.
* 전진하는 조건은 0에서 9사이에서 random값을 구한 후 random 값이 4이상 일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
* 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
* 사용자가 잘못된 값을 입력 할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    * Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 기능 구현 체크리스트

### Car

- 자동차를 생성할 수 있다. [V] 
  - `이름` 필드를 가진다. [V] 
    - 이름은 1자 이상 5자 이하만 가능하다 [V]
  - `위치` 필드를 가진다. [V]
- 자동차를 전진할 수 있다. [V]

### Cars

- 경주에 참여하는 자동차들로 구성된다. [V]
  - 자동차 이름은 쉼표(,)로 구분되서 입력된다. [V]
    - 최소 2대의 자동차는 입력해야 한다. [V]
    - 동일한 이름은 입력할 수 없다. [V]
- 자동차들을 전진할 수 있다. [V]
- 경기 종류 후 우승 자동차를 조회할 수 있다. [V]

### Engine

- 자동차가 전진할지 멈출지 결정할 수 있다. [V] 
  - 0 에서 9 사이의 Random 값을 구한다. [V] 
    - 4 이상이면 `전진` 한다. [V]
    - 3 이하이면 `정지` 한다. [V]

### Winners

- 우승 자동차 세트를 구할 수 있다. [V]

### RacingGame

- 경주게임을 생성할 수 있다. [V] 
  - `자동차 세트` 필드를 가진다. [V] 
  - `시도 횟수` 필드를 가진다. [V]
      - 시도 횟수는 1 이상이어야 한다. [V]
- 경주 게임을 시작할 수 있다. [ ]

### ConsoleView

- 사용자에게 자동차 이름을 입력받는다. [ ]
- 사용자에게 시도 횟수를 입력받는다. [ ]
- 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 에러 메시지 출력 후 입력을 다시 받는다. [ ]

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 자동차 | Car | 경주에 참여하는 자동차 |
| 자동차 세트 | Cars | 경주에 참여하는 자동차 n개로 구성 |
| 엔진 | Engine | 자동차의 이동 여부를 결정 |
| 우승 자동차 | Winners | 경주에서 우승한 자동차 |
| 경주 게임 | RacingGame | 경주 게임을 관리하는 단위 |