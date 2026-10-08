import org.junit.jupiter.api.*;

public class JUnitTest {
    @DisplayName("1 + 2는 3이다")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;
        Assertions.assertEquals(sum, a + b); // 값이 같은지 확인
    }

    @DisplayName("1 + 3는 4이다.")
    @Test
    public void junitFailedTest() {
        int a = 1;
        int b = 3;
        int sum = 3;
        Assertions.assertEquals(sum, a + b);
    }
    @BeforeEach
    public void prepare(){
        System.out.println("테스트 준비");
    }
    @AfterAll
    public static void cleanAll(){
        System.out.println("최종 마무리");
    }
}