package stringclass;

public class StringMain {
    public static void main(String[] args) {
        // heapメモリに生成される。
        // そのメモリアドレスを変数に入れそこを指す
        // constant poolに入る
        String str1 = new String("abc");
        String str2 = new String("abc");
        // == addressの位置を比べる
        // false
        System.out.println(str1 == str2);

        String constStr1 = "test";
        String constStr2 = "test";

        // true
        System.out.println(constStr1 == constStr2);

        // immutable
        String java = "java";
        String android = "android";
        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));


        // StringBuilder , StringBuffer
        String bufStr = new String("java"); // heap3214 ＜ー俺が任意に付けたもの
        System.out.println(System.identityHashCode(bufStr));

        StringBuilder builder = new StringBuilder(bufStr); // heap1001 ＜ー俺が任意に付けたもの
        System.out.println(System.identityHashCode(builder));

        builder.append(" and");
        builder.append(" android");
        System.out.println(System.identityHashCode(builder)); // heap1001

        String bufStr2 = builder.toString();
        System.out.println(bufStr2);
    }

}
