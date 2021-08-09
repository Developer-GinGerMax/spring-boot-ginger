package net.ginger.api.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock Man man;
    @Mock BusinessMan businessMan;
    @BeforeEach
    void setUp() {
        man = new Man("이순신");
        businessMan = new BusinessMan("구글","개발자");
    }
    @DisplayName("상속 예제")
    @Test
    public void test_showName(){
        assertEquals("홍길동",businessMan.getName());
    }
}