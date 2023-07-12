package com.sparta.junit5practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RepeatTest {

    @RepeatedTest(value = 5, name = "반복 테스트 {currentRepetition} / {totalRepetitions}") //메서드를 반복해서 돌릴 수 있음 - name 옵션으로 네이밍 가능
    void repeatTest(RepetitionInfo info) {
        System.out.println("테스트 반복 : " + info.getCurrentRepetition() + " / " + info.getTotalRepetitions());
    }

    @DisplayName("파라미터 값 활용하여 테스트 하기")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9}) //전달해주고 싶은 파라미터값
    void parameterTest(int num) { //전달되는 파라미터의 수만큼 실행이 됨!
        System.out.println("5 * num = " + 5 * num);
    }
}
