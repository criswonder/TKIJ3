package dynamic_programming_40;

public class DynamicProgramming40 {


    static class Version1 {
        public int maxW = Integer.MIN_VALUE; // 结果放到 maxW 中
        public int[] weight = {2, 2, 4, 6, 3};  // 物品重量
        public int n = 5; // 物品个数
        public int w = 9; // 背包承受的最大重量
        public boolean[][] mem = new boolean[5][10]; // 备忘录,默认值 false

        public void f(int i, int cw) { // 调用 f(0, 0)
            if (cw == w || i == n) { // cw==w 表示装满了,i==n 表示物品都考察完了
                if (cw > maxW) maxW = cw;
                return;
            }
            if (mem[i][cw]) return; // 重复状态
            mem[i][cw] = true; // 记录 (i, cw) 这个状态
            f(i + 1, cw); // 选择不装第 i 个物品
            if (cw + weight[i] <= w) {
                f(i + 1, cw + weight[i]); // 选择装第 i 个物品
            }
        }

        //weight: 物品重量,n: 物品个数,w: 背包可承载重量
        public int knapsack(int[] weight, int n, int w) {
            boolean[][] states = new boolean[n][w + 1]; // 默认值 false

            // 第一行的数据要特殊处理,可以利用哨兵优化
            states[0][0] = true;
            states[0][weight[0]] = true;

            for (int i = 1; i < n; ++i) { // 动态规划状态转移
                for (int j = 0; j <= w; ++j) {// 不把第 i 个物品放入背包
                    if (states[i - 1][j] == true) states[i][j] = states[i - 1][j];
                }
                for (int j = 0; j <= w - weight[i]/*第i个物品还没有放入,背包里的重量最多是w-weight[i]种情况,考察j>w-weight[i]的情况没有意义,背包会装满*/; ++j) {// 把第 i 个物品放入背包
                    if (states[i - 1][j] == true) states[i][j + weight[i]] = true;
                }
            }
            for (int i = w; i >= 0; --i) { // 输出结果
                if (states[n - 1][i] == true) return i;
            }
            return 0;
        }

        public static int knapsack2(int[] items, int n, int w) {
            boolean[] states = new boolean[w + 1]; // 默认值 false

            // 第一行的数据要特殊处理,可以利用哨兵优化
            states[0] = true;
            states[items[0]] = true;

            for (int i = 1; i < n; ++i) { // 动态规划
                for (int j = w - items[i]; j >= 0; --j) {// 把第 i 个物品放入背包 //为什么这里要从大到小循环：第i轮循环中新设置的值会干扰到后面的设值。
                    if (states[j] == true) states[j + items[i]] = true;
                }
            }
            for (int i = w; i >= 0; --i) { // 输出结果
                if (states[i] == true) return i;
            }
            return 0;
        }
    }

    static class Version2 {
        private int maxV = Integer.MIN_VALUE; // 结果放到 maxV 中
        private int[] weight = {2, 2, 4, 6, 3};  // 物品的重量
        private int[] value = {3, 4, 8, 9, 6}; // 物品的价值
        private int n = 5; // 物品个数
        private int w = 9; // 背包承受的最大重量

        public void f(int i, int cw, int cv) { // 调用 f(0, 0, 0)
            if (cw == w || i == n) { // cw==w 表示装满了,i==n 表示物品都考察完了
                if (cv > maxV) maxV = cv;
                return;
            }
            f(i + 1, cw, cv); // 选择不装第 i 个物品
            if (cw + weight[i] <= w) {
                f(i + 1, cw + weight[i], cv + value[i]); // 选择装第 i 个物品
            }
        }

    }


    public static void main(String[] args) {
        Version1 nest = new Version1();
        nest.knapsack(nest.weight, nest.n, nest.w);
    }

}
