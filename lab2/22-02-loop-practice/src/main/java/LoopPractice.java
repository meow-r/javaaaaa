/**
 * Lab02 练习 2 — 循环语法综合练习
 *
 * 考察内容：for 循环 · while 循环 · continue · break · 累加器模式
 *
 * 说明：
 *   本文件为完型填空题，请将标有"填空N"的占位符替换为正确的表达式或语句，
 *   使所有测试通过。不允许修改方法签名。
 */
public class LoopPractice {

    /**
     * 区间求和：计算从 from 到 to（含两端）的所有整数之和。
     *
     * 示例：
     *   sumRange(1, 5)  →  15   (1+2+3+4+5)
     *   sumRange(3, 3)  →  3
     *   sumRange(5, 1)  →  0    (from > to 时返回 0)
     *
     * @param from 起始值（含）
     * @param to   终止值（含）
     * @return 区间内所有整数之和
     */
    public static int sumRange(int from, int to) {
        int sum = 0;

        // 填空1：将 true 替换为 for 循环的终止条件
        //        循环变量 i 从 from 开始，每次加 1，直到超过 to 为止
        //        提示：i <= to
        for (int i = from; true /* 填空1 */; i++) {

            // 填空2：将空语句替换为累加语句
            //        将当前的 i 加到 sum 上
            //        提示：sum += i
            ; /* 填空2 */
        }

        return sum;
    }

    /**
     * 统计奇数个数：统计 1 到 n（含 n）中奇数的个数。
     *
     * 要求：使用 for 循环 + continue 跳过偶数（不能用其他方式直接判断奇数）。
     *
     * 示例：
     *   countOdd(5)  →  3   (1, 3, 5)
     *   countOdd(6)  →  3   (1, 3, 5)
     *   countOdd(0)  →  0
     *
     * @param n 上界（含），保证 n >= 0
     * @return 1 到 n 中奇数的个数
     */
    public static int countOdd(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            // 填空3：将 false 替换为"跳过偶数"的条件
            //        当 i 是偶数时，执行 continue 跳过本次循环
            //        提示：i % 2 == 0
            if (false /* 填空3 */) {
                continue;
            }
            count++;
        }

        return count;
    }

    /**
     * 各位数字之和：将整数 n 的每一位数字累加后返回结果。
     *
     * 要求：使用 while 循环逐位处理。
     *
     * 示例：
     *   digitSum(123)  →  6   (1+2+3)
     *   digitSum(9)    →  9
     *   digitSum(100)  →  1
     *   digitSum(0)    →  0
     *
     * @param n 非负整数
     * @return 各位数字之和
     */
    public static int digitSum(int n) {
        int sum = 0;

        // 填空4：将 false 替换为 while 循环的条件
        //        当 n 还有剩余位数时继续循环
        //        提示：n > 0
        while (false /* 填空4 */) {

            // 填空5：将 0 替换为"取出 n 当前个位数字"的表达式
            //        提示：n % 10 可以得到个位数字（如 123 % 10 = 3）
            int digit = 0; /* 填空5 */
            sum += digit;

            // 填空6：将空语句替换为"去掉已处理的个位"的语句
            //        提示：n /= 10 将 123 变为 12，再下一轮取出 2
            ; /* 填空6 */
        }

        return sum;
    }

    /**
     * 查找首个目标值：在数组 arr 中找到第一个等于 target 的元素，返回其下标。
     * 若不存在，返回 -1。
     *
     * 要求：使用 for 循环，找到后立即返回（不需要 break）。
     *
     * 示例：
     *   findFirst([3, 1, 4, 1, 5], 1)  →  1   (下标 1 处的元素是 1)
     *   findFirst([3, 1, 4, 1, 5], 9)  →  -1  (不存在)
     *   findFirst([], 1)               →  -1  (空数组)
     *
     * @param arr    整数数组
     * @param target 目标值
     * @return 第一个等于 target 的元素的下标，不存在时返回 -1
     */
    public static int findFirst(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            // 填空7：将空语句替换为"找到目标时返回当前下标"的语句
            //        条件：arr[i] == target
            //        操作：return i
            ; /* 填空7 */
        }

        return -1; // 遍历完未找到
    }

    /**
     * 可在此处手动测试，运行 main 方法查看输出是否与注释一致。
     */
    public static void main(String[] args) {
        System.out.println(sumRange(1, 5));   // 预期：15
        System.out.println(sumRange(3, 3));   // 预期：3
        System.out.println(sumRange(5, 1));   // 预期：0
        System.out.println("---");
        System.out.println(countOdd(5));      // 预期：3
        System.out.println(countOdd(6));      // 预期：3
        System.out.println(countOdd(0));      // 预期：0
        System.out.println("---");
        System.out.println(digitSum(123));    // 预期：6
        System.out.println(digitSum(9));      // 预期：9
        System.out.println(digitSum(100));    // 预期：1
        System.out.println(digitSum(0));      // 预期：0
        System.out.println("---");
        System.out.println(findFirst(new int[]{3, 1, 4, 1, 5}, 1));  // 预期：1
        System.out.println(findFirst(new int[]{3, 1, 4, 1, 5}, 9));  // 预期：-1
        System.out.println(findFirst(new int[]{7}, 7));               // 预期：0
        System.out.println(findFirst(new int[]{}, 1));                // 预期：-1
    }
}
