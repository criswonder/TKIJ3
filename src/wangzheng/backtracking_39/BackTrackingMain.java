package backtracking_39;

public class BackTrackingMain {
    static int maxW = Integer.MIN_VALUE; // 存储背包中物品总重量的最大值

    //i 表示考察到哪个物品了；
    //cw 表示当前已经装进去的物品的重量和；
    //items 表示每个物品的重量；
    //n 表示物品个数。总的物品个数
    // w 背包重量；
    // 假设背包可承受重量 100，物品个数 10，物品重量存储在数组 a 中，那可以这样调用函数：
    // f(0, 0, a, 10, 100)
    public static void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) { // cw==w 表示装满了 ;i==n 表示已经考察完所有的物品
            if (cw > maxW) maxW = cw;
            System.out.println("cw=" + cw + ",i=" + i + ",maxW=" + maxW);
            return;
        }
        f(i + 1, cw, items, n, w);
        if (cw + items[i] <= w) {// 已经超过可以背包承受的重量的时候，就不要再装了
//            System.out.println(i + ":" + items[i]);
            f(i + 1, cw + items[i], items, n, w);
        }
    }

    public static void main(String[] args) {
        int[] items = {8, 9, 33, 2, 11, 33, 23, 12, 9, 5, 6, 7, 3, 4};
        f(0, 0, items, items.length, 20);
    }

}
