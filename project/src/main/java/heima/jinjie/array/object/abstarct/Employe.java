package heima.jinjie.array.object.abstarct;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/30 15:31
 */

/**
 * 雇员（Employe）案例
 *  需求：程序员（programmer）,姓名，id，薪水，工作类容
 *       项目经理（Manger）姓名，id，薪水，工作类容,奖金
 *
 */
public abstract class Employe {
    String name;//姓名
    String id;//id
    double pay;//薪水
    //工作
    public abstract void work();
}
