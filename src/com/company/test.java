package com.company;

import java.util.Scanner;
/*
*   此类为test测试类
*
* */
public class test {
    public static void main(String[] args) {
        test tea =new test();
        int number;
        Student st= new Student("张三","01","一班");
        st.show();//输出学生信息
        System.out.println("=================");
        tea.Scan();//输入上课数字

        System.out.println("若要开始点名请输入1，跳过请输入2");
        Scanner in= new Scanner(System.in);
        int b=in.nextInt();//输入数字
        if(b==1){

             Tercher te= new Tercher();
             int a= te.callName();
//            System.out.println("随机生成数字是"+a);

            if(a==2){
                System.out.println("你被老师随机点到名，请回答问题");
            }else {
                System.out.println("你未被老师随机点到名，请继续上课听讲");
            }

        }





    }


    public void Scan(){


        Scanner in= new Scanner(System.in);
        System.out.println("输入数字1 为下课 ，输入数字2为上课");

        test test = new test();//学生上下课
        int a=in.nextInt();
        if(a==1){
            test.inphoneON();
            System.out.println("学生已下课");

        }else if(a==2){
            System.out.println("学生以上课");
            test.inphoneOFF();
        }else {

            System.out.println("输入错误");
        }

    }
    public void inphoneON(){
        inphone a= new inphone();
        a.powerON();
        a.receiveMessages();
        a.call();
        a.faceTime();
        a.newWork();
        a.MIUI();
    }
    public void inphoneOFF(){
        inphone a= new inphone();
        a.powerOFF();

    }
}
