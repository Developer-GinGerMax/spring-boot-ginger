package net.ginger.api.UserService.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

class MyUtilTest {
    @Mock
    MyUtil myUtil;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        myUtil = new MyUtil();
    }

    @DisplayName("입력한 날자까지 앞으로 며칠 남았는가?")
    @Test
    void howLongRemain() {
        System.out.println(myUtil.howLongRemain(LocalDate.now(),"12","25"));
    }

    @Test
    void usedTime() {
        System.out.println(myUtil.usedTime("9","30","00","18","00","00"));
    }
}