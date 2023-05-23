package day09.test;

public class TestException {
    public static void main(String[] args)  {
        int age=555;
        int many =1000000000;
        try {
            judgeAge(age);
        } catch (MyAgeOutExpection e) {
            e.printStackTrace();
        }
        //System.out.println("不是说不会中断执行吗");
        //withdrawals(many);
    }

    private static void judgeAge(int age) throws MyAgeOutExpection {
        if (age <=0||age>150) {
            throw new MyAgeOutExpection("你真是活见鬼了");
        }else {
            System.out.println(4656);
        }
    }

    private static void withdrawals(int many) {
        int total = 999;
        if (total - many <=100000) {
             throw new NoMuchManyException("差"+(many-total)+"元,你真是长得丑,还想的美,自己有多少钱心里没点数吗");
        }else if (total-many >0) {
            System.out.println("恭喜你大聪明,取钱成功");
        }else {
            throw new NoMuchManyException("还好,兄弟差的不多,再攒个一两年就行了");
        }
    }


}

