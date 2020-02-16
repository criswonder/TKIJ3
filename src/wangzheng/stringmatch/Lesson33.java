package stringmatch;

public class Lesson33 {


    private static final int SIZE = 256; // 全局变量或成员变量

    private void generateBC(char[] b, int m, int[] bc) {
        for (int i = 0; i < SIZE; ++i) {
            bc[i] = -1; // 初始化bc
        }
        for (int i = 0; i < m; ++i) {
            int ascii = (int) b[i]; // 计算b[i]的ASCII值
            bc[ascii] = i;
        }
    }

    /**
     *
     * @param a 主串a
     * @param n a的长度
     * @param b 模式串b
     * @param m b的长度
     * @return
     */
    public int bm(char[] a, int n, char[] b, int m) {
        int[] bc = new int[SIZE]; // 记录模式串中每个字符最后出现的位置
        generateBC(b, m, bc); // 构建坏字符哈希表
        int i = 0; // i表示主串与模式串对齐的第一个字符
        while (i <= n - m) {
            int j;
            for (j = m - 1; j >= 0; --j) { // 模式串从后往前匹配
                if (a[i + j] != b[j]) break; // 坏字符对应模式串中的下标是j
            }
            if (j < 0) {
                return i; // 匹配成功，返回主串与模式串第一个匹配的字符的位置
            }
            // 这里等同于将模式串往后滑动j-bc[(int)a[i+j]]位
            i = i + (j - bc[(int) a[i + j]]);
        }
        return -1;
    }


    // b表示模式串，m表示长度，suffix，prefix数组事先申请好了

    /**
     * generateGS GS=Good Suffix
     * @param b 模式串
     * @param m 模式串长度
     * @param suffix
     * @param prefix
     */
    private void generateGS(char[] b, int m, int[] suffix, boolean[] prefix) {
        for (int i = 0; i < m; ++i) { // 初始化
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; ++i) { // b[0, i]
            int j = i;
            int k = 0; // 公共后缀子串长度
            while (j >= 0 && b[j] == b[m-1-k]) { // 与b[0, m-1]求公共后缀子串
                --j;
                ++k;
                suffix[k] = j+1; //j+1表示公共后缀子串在b[0, i]中的起始下标
            }
            if (j == -1) prefix[k] = true; //如果公共后缀子串也是模式串的前缀子串
        }
    }
}
