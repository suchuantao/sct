package com.rest.demo.sum;

public class Hero {
    String name;//名字
    int attackDamage;//物理攻击
    int abilityPower;//法术强度
    int armor;//护甲
    int magicResistance;//抗魔
    float attackSpeed;//攻击速度
    int cooldownReduction;//冷却缩减
    int criticalStrike;//暴击lv
    int moveSpeed;//移动速度
    int hp;//血量
    int mp;//蓝量
}
 class Hero1{
    public void DestroyTower(){
        System.out.println("正在拆塔");
    }
    public void keng(){
        System.out.println("坑了下队友");
    }
    public void Dance(){
        System.out.println("正在跳舞");
    }

     public static void main(String[] args) {
         Hero hero =new Hero();
         hero.name="哈哈哈";
         hero.attackDamage=34;
         hero.abilityPower=56;
         hero.armor=223;
         hero.magicResistance=42;
         hero.attackSpeed=45.64f;
         hero.cooldownReduction=31;
         hero.criticalStrike=23;
         hero.moveSpeed=22;
         hero.hp=22;
         hero.mp=32;
         System.out.println(hero.name);
         System.out.println(hero.abilityPower);
     }

}
