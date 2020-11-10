package heima.jinjie.array.object.abstarct;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/30 14:13
 */
public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.barking();

        BaseTeacher baseTeacher=new BaseTeacher();
        baseTeacher.name="冯老师";
        baseTeacher.teach();
        JobTeacher jobTeacher=new JobTeacher();
        jobTeacher.name="苍老师";
        jobTeacher.teach();

        Programmer programmer=new Programmer();
        programmer.work();
        Manger manger=new Manger();
        manger.work();
    }
}
