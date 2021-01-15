package com;

import java.util.ArrayList;

public class lin {
    private static final int LIN=10;
    String name;
    String sex;
    int age;
    String add;
    String pwd;
    String brithday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "lin{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", pwd='" + pwd + '\'' +
                ", brithday='" + brithday + '\'' +
                '}';
    }

    public void method(){
        //模板五
        ArrayList list = new ArrayList();
        list.add(434);
        list.add(434);
        list.add(4324);
        if (list == null) {
            
        }
        //inn
        if (list != null) {
            
        }
        //變形;xxx.nn
        if (list != null) {

        }

        //變形:xx.n
    }
    //模板一：psvm
    public static void main(String[] args) {
       /* System.out.println("hellowworld!!");
        System.out.println("args = [" + args + "]");
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);*/
        String[] a = new String[]{"林", "进", "豪"};
        /*for (int i = 0; i <a.length ; i++) {
            String str=a[i];
            System.out.print(str+" ");
        }*/
        //变形iter
       /* for (String s : a) {
            System.out.println(s);
        }*/
        //变形二
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            System.out.print(s + "   ");
        }
        //模板四
        ArrayList list= new ArrayList();
       list.add(0,123);
        list .add(434);
        list.add(479347 );
        for (Object o : list) {
            
        }

        //变形list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形三list.forr逆序的循環
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }




}

    /*
    * 快捷键的使用
    *1	执行(run)	alt+r
2	提示补全 (Class Name Completion)	alt+/
3	单行注释	ctrl + /
4	多行注释	ctrl + shift + /
5	向下复制一行 (Duplicate Lines)	ctrl+alt+down
6	删除一行或选中行 (delete line)	ctrl+d
7	向下移动行(move statement down)	alt+down
8	向上移动行(move statement up)	alt+up
9	向下开始新的一行(start new line)	shift+enter
10	向上开始新的一行 (Start New Line before current)	ctrl+shift+enter
11	如何查看源码 (class)	ctrl + 选中指定的结构 或
ctrl + shift + t
12	万能解错/生成返回值变量	alt + enter
13	退回到前一个编辑的页面 (back)	alt + left
14	进入到下一个编辑的页面(针对于上条) (forward)	alt + right
15	查看继承关系(type hierarchy)	F4

    * */


