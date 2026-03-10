# Lab02 练习 2 — 循环语法综合练习

## 考察内容

- `for` 循环的三段式结构（初始化 / 条件 / 更新）
- `while` 循环（不知道循环次数时使用）
- `continue`：跳过本次循环，进入下一次
- `break`：立即退出整个循环
- 累加器模式（accumulator pattern）
- 循环内的计数器维护

## 方法说明

### `sumRange(int from, int to)` — 区间求和

用 `for` 循环计算从 `from` 到 `to`（含两端）的所有整数之和。

```
sumRange(1, 5)  →  15   （1+2+3+4+5）
sumRange(3, 3)  →  3
sumRange(5, 1)  →  0    （from > to 时返回 0）
```

### `countOdd(int n)` — 统计奇数个数

用 `for` + `continue` 统计 1 到 n（含 n）中奇数的个数。

```
countOdd(5)   →  3   （1, 3, 5）
countOdd(6)   →  3   （1, 3, 5）
countOdd(1)   →  1
countOdd(0)   →  0
```

### `digitSum(int n)` — 各位数字之和

用 `while` 循环将整数 `n` 的每一位数字累加。`n` 保证为非负整数。

```
digitSum(123)   →  6   （1+2+3）
digitSum(9)     →  9
digitSum(100)   →  1
digitSum(0)     →  0
```

### `findFirst(int[] arr, int target)` — 查找首个目标值

用 `for` 循环遍历数组，找到第一个等于 `target` 的元素，返回其下标。
若不存在，返回 `-1`。

```
findFirst([3, 1, 4, 1, 5], 1)   →  1
findFirst([3, 1, 4, 1, 5], 9)   →  -1
findFirst([7], 7)               →  0
findFirst([], 1)                →  -1
```

## 完型填空说明

| 编号 | 所在方法 | 要填写的内容 |
|------|---------|------------|
| 填空1 | `sumRange` | `for` 循环的终止条件（`i <= to`） |
| 填空2 | `sumRange` | 累加语句（`sum += i`） |
| 填空3 | `countOdd` | `continue` 的触发条件（跳过偶数） |
| 填空4 | `digitSum` | `while` 循环的条件（`n > 0`） |
| 填空5 | `digitSum` | 取出个位数字（`n % 10`） |
| 填空6 | `digitSum` | 去掉已处理的个位（`n / 10`） |
| 填空7 | `findFirst` | 找到目标时返回当前下标 |

> **提示**：`digitSum` 中的"逐位取出"是循环的经典模式：
> `n % 10` 取个位，`n / 10` 去掉个位，循环直到 `n == 0`。

## 提交与测试

```bash
# 编译并运行所有测试
mvn test

# 仅运行明测试
mvn test -Dtest=LoopPracticeTest
```
