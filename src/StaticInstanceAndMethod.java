public class StaticInstanceAndMethod {
    // 这里的main函数为静态函数，它不需要将类实例化为对象即可调用，如这里的main函数可以直接通过类名.main()进行调用。
    public static void main() {
        Person p1 = new Person("xiaoming", 11);
        Person p2 = new Person("xiaohong", 12);
        Person p3 = new Person("xiaowang", 13);
        p1.number = 1;
        p2.number = 2;
        System.out.println("p1.number:" + p1.number + "\np2.number:" + p2.number);
        System.out.printf("count:"+Person.count);
    }
}

class Person{
    public String name;
    public int age;
    // 定义静态字段number,静态字段不属于实例对象，静态字段属于类，访问静态字段推荐使用Person.number
    public static int number;
    // 静态字段count，统计创建示例个数
    public static int count;

    // 构造方法
    public  Person(){
        count++;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public static int getCount(){
        return count;
    }
}
