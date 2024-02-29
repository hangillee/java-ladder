# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 요구사항

* 사람 이름 (Name)
    * 최대 5글자까지 부여할 수 있다.
    * 이름을 반환한다.
    * 이름의 길이는 최소 2글자여야 한다.

* 사람 이름들 (Names)
    * 중복을 허용하지 않는다.
    * 첫 번째 사람 이름을 반환한다.
    * 전체 이름 개수를 반환한다.
    * 특정 위치의 이름을 반환한다.
    * 이름 개수는 2개 이상이어야 한다.

* 사다리 높이 (Height)
    * 사다리 높이는 1 이상의 정수여야 한다.

* 라인 (Line)
    * 라인 폭은 사람 이름을 기준으로 한다.
    * 가로 라인은 겹치지 않도록 해야 한다.

* 사다리 라인들 (Lines)
    * 사다리의 라인들을 모아둔 일급 컬렉션.
    * 사용자가 입력한 사다리 높이 만큼 라인을 생성한다.

* 좌표 (Point)
    * 사다리의 가로 라인 시작점 역할을 가진다.
    * 현재 라인 시작점에서 가로로 이동할 수 있는지 판단한다.

* 좌표 생성기 (PointGenerator)
    * 구현 객체 RandomPointGenerator
    * 가로 라인이 겹치지 않도록 좌표를 무작위로 생성한다.

* 실행 결과 (Result)
    * 각 실행 결과 당, 최대 5글자까지 입력할 수 있다.
    * 결과를 반환한다.

* 실행 결과들 (Results)
    * 실행 결과를 모아둔 일급 컬렉션.
    * 사용자로부터 `all`이 입력되면 전체 실행 결과를 반환한다.
    * 사용자로부터 `사람 이름`이 입력되면 해당 사람의 실행 결과를 반환한다.
    * 실행 결과들은 사람 이름의 개수와 동일해야 한다.
    * 사람 이름과 실행 결과를 매핑한 결과를 반환한다.

* 이동자 (Mover)
    * 사다리를 타고 이동하는 역할을 한다.
    * 사다리 높이만큼 이동한다.
    * 실행 결과들, 사람 이름들과 협력하여 최종 결과를 도출한다.

* 입력
    * 사람 이름
    * 사다리 높이

* 출력
    * 사다리 모양과 사람 이름을 함께 출력

* Parser
    * 사용자로부터 입력 받은 이름을 쉼표(,)를 기준으로 구분해서 반환한다.
    * 사용자로부터 입력 받은 사다리 높이가 제대로 된 숫자값인지 검증해서 반환한다.