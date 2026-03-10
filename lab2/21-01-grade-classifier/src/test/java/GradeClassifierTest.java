import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * 明测试用例 — GradeClassifier
 *
 * 这些测试对学生可见，用于验证基本逻辑是否正确。
 * 提交前请确保所有明测试通过：mvn test -Dtest=GradeClassifierTest
 */
public class GradeClassifierTest {

    // -----------------------------------------------------------------------
    // classify() — 典型分数测试
    // -----------------------------------------------------------------------

    @Test
    public void testClassify_优秀_典型() {
        assertEquals("优秀", GradeClassifier.classify(95));
    }

    @Test
    public void testClassify_良好_典型() {
        assertEquals("良好", GradeClassifier.classify(82));
    }

    @Test
    public void testClassify_及格_典型() {
        assertEquals("及格", GradeClassifier.classify(67));
    }

    @Test
    public void testClassify_不及格_典型() {
        assertEquals("不及格", GradeClassifier.classify(45));
    }

    @Test
    public void testClassify_无效分数_负数() {
        assertEquals("无效分数", GradeClassifier.classify(-1));
    }

    @Test
    public void testClassify_无效分数_超出上界() {
        assertEquals("无效分数", GradeClassifier.classify(101));
    }

    // -----------------------------------------------------------------------
    // classify() — 边界值测试（刚好在分界线上）
    // -----------------------------------------------------------------------

    @Test
    public void testClassify_边界_优秀下界() {
        // 90 分是"优秀"的最低分
        assertEquals("优秀", GradeClassifier.classify(90));
    }

    @Test
    public void testClassify_边界_良好下界() {
        // 75 分是"良好"的最低分
        assertEquals("良好", GradeClassifier.classify(75));
    }

    @Test
    public void testClassify_边界_及格下界() {
        // 60 分是"及格"的最低分
        assertEquals("及格", GradeClassifier.classify(60));
    }

    @Test
    public void testClassify_边界_不及格上界() {
        // 59 分刚好不及格
        assertEquals("不及格", GradeClassifier.classify(59));
    }

    // -----------------------------------------------------------------------
    // isPassed() — 通过判断测试
    // -----------------------------------------------------------------------

    @Test
    public void testIsPassed_刚好通过() {
        assertTrue(GradeClassifier.isPassed(60));
    }

    @Test
    public void testIsPassed_刚好不通过() {
        assertFalse(GradeClassifier.isPassed(59));
    }

    @Test
    public void testIsPassed_无效分数不通过() {
        assertFalse(GradeClassifier.isPassed(-1));
    }

    // -----------------------------------------------------------------------
    // toGPA() — GPA 换算测试
    // -----------------------------------------------------------------------

    @Test
    public void testToGPA_优秀档() {
        assertEquals(4.0, GradeClassifier.toGPA(90), 0.001);
    }

    @Test
    public void testToGPA_良好档() {
        assertEquals(3.0, GradeClassifier.toGPA(80), 0.001);
    }

    @Test
    public void testToGPA_无效分数() {
        assertEquals(-1.0, GradeClassifier.toGPA(-1), 0.001);
    }
}
