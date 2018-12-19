package dev.jz.memory;

/**
 * vm 参数 -verbose:gc 打印gc
 * -Xms20m -Xms20m -Xmn10m  堆最大20m，最小20m，新生代10m
 * -XX:+PrintGCDetails  打印gc 和上面相似
 * -XX:+SurvivorRatio=8  新生代 eden和survivor8:1
 * -XX:PretenureSizeThreshold=3145728  不支持2m类似的赋值，大于该值的直接分配到老年代
 * -XX:MaxTenuringThreshold=1 移到老年代需要的年龄
 * -XX:+PrintTenuringDistribution
 * -XX:-HandlePromotionFailure=false 是否允许担保失败，失败了引发full gc，通常是minor gc
 */
public class TestAllocation {
    private static  final int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];


    }
}
