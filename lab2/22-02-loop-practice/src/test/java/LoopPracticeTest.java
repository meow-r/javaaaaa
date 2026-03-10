import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 明测试用例 — LoopPractice
 *
 * 这些测试对学生可见，用于验证基本逻辑是否正确。
 * 提交前请确保所有明测试通过：mvn test -Dtest=LoopPracticeTest
 */
public class LoopPracticeTest {

    // -----------------------------------------------------------------------
    // sumRange() — 区间求和
    // -----------------------------------------------------------------------

    @Test
    public void testSumRange_典型() {
        assertEquals(15, LoopPractice.sumRange(1, 5));
    }

    @Test
    public void testSumRange_单个数() {
        assertEquals(3, LoopPractice.sumRange(3, 3));
    }

    @Test
    public void testSumRange_from大于to() {
        assertEquals(0, LoopPractice.sumRange(5, 1));
    }

    @Test
    public void testSumRange_从零开始() {
        assertEquals(10, LoopPractice.sumRange(0, 4));
    }

    // -----------------------------------------------------------------------
    // countOdd() — 统计奇数个数
    // -----------------------------------------------------------------------

    @Test
    public void testCountOdd_奇数上界() {
        assertEquals(3, LoopPractice.countOdd(5));
    }

    @Test
    public void testCountOdd_偶数上界() {
        // 1 到 6 中奇数是 1、3、5，共 3 个
        assertEquals(3, LoopPractice.countOdd(6));
    }

    @Test
    public void testCountOdd_零() {
        assertEquals(0, LoopPractice.countOdd(0));
    }

    @Test
    public void testCountOdd_一() {
        assertEquals(1, LoopPractice.countOdd(1));
    }

    // -----------------------------------------------------------------------
    // digitSum() — 各位数字之和
    // -----------------------------------------------------------------------

    @Test
    public void testDigitSum_三位数() {
        assertEquals(6, LoopPractice.digitSum(123));
    }

    @Test
    public void testDigitSum_单位数() {
        assertEquals(9, LoopPractice.digitSum(9));
    }

    @Test
    public void testDigitSum_含零() {
        assertEquals(1, LoopPractice.digitSum(100));
    }

    @Test
    public void testDigitSum_零() {
        assertEquals(0, LoopPractice.digitSum(0));
    }

    // -----------------------------------------------------------------------
    // findFirst() — 查找首个目标值
    // -----------------------------------------------------------------------

    @Test
    public void testFindFirst_存在_非首位() {
        assertEquals(1, LoopPractice.findFirst(new int[]{3, 1, 4, 1, 5}, 1));
    }

    @Test
    public void testFindFirst_不存在() {
        assertEquals(-1, LoopPractice.findFirst(new int[]{3, 1, 4, 1, 5}, 9));
    }

    @Test
    public void testFindFirst_单元素数组_命中() {
        assertEquals(0, LoopPractice.findFirst(new int[]{7}, 7));
    }

    @Test
    public void testFindFirst_空数组() {
        assertEquals(-1, LoopPractice.findFirst(new int[]{}, 1));
    }
}
