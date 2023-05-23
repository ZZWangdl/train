package day01.test;

/**
 * @author 王龙
 * @version 1.0
 * @project train
 * @description
 * @date 2022-11-06 19:12:44
 */
public class Teacher {
    /*编写教师类。

（1）包括工号，姓名，学生成绩的一维数组；
（2）设计一个能初始化工号，姓名等特征的构造方法；另一个构造方法能初始化所有教师特征；
（3）行为包括：
(i)计算所有学生的总分；
(ii)计算所有学生的平均分；
(iii)输出教师的工号、姓名、总分和平均分；
并编写测试类Test，控制台接收用户输入的工号，姓名以及学生的成绩，并输出总分和平均分。*/
    private String teacherNo;
    private String name;
    private int[] grade;
//初始化教师所有的特征
    public Teacher(String teacherNo, String name, int[] grade) {
        this.teacherNo = teacherNo;
        this.name = name;
        this.grade = grade;
    }
//初始化教师的工号和姓名
    public Teacher(String teacherNo, String name) {
        this.teacherNo = teacherNo;
        this.name = name;
    }

    /**
     * 计算学生的总分
     *
     * @param grades 学生成绩数组
     * @return
     */
    public double sum(int[] grades) {
        double gradeSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];
        }
        return gradeSum;
    }

    /**
     * 计算学生成绩的平均分
     *
     * @return
     */
    public double avg(int[] grade) {
        double gradeAvg = sum(grade) / grade.length;
        return gradeAvg;
    }

    /**
     * 输出教师基本信息和学生的总成绩和平均分
     * @return
     */
    public String showInfo(){
        double sum = this.sum(grade);
        double avg = this.avg(grade);
        String info = "工号为:"+teacherNo+"\n姓名为:"+name+"\n学生总成绩为"+sum+"\n学生的平均成绩是"+avg;
        return info;
    }
}
