package day04.test;

public class StringTest3 {
    public static void main(String[] args) {
        String str = "学习很枯燥";
        str += "生活很烦恼" + "而我却不思考";
        System.out.println(str.indexOf('我'));
        System.out.println(str.indexOf("我"));//
        System.out.println(str.contains("生活"));
        byte[] bytes = str.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);

        }
        //char[] chars = str.toCharArray();
       /* for (int i = 0; i < chars.length; i++) {
            System.out.print(" " + chars[i]);
        }*/
        System.out.println();
        String s = new String(bytes);
        System.out.println(s);
    }
}
