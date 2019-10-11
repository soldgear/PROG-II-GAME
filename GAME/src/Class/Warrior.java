/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author soldgear
 */
public class Warrior extends Character{
    
    public Warrior(String name){
            super(name);
            setHealthPoints(200);
            setEnergyPoints(100);
            setAttackDamage(8);
            setMagicDamage(0);
            setAttackSpeed(1.1);
    }
    @Override
    public void attack(Character enemy){
        double damage = getAttackDamage() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage); 
        System.out.println(enemy.getName()+"-> HP -"+damage);
        if (enemy.getHealthPoints() <= 0){
            this.setExperience(enemy.getBounty());
        }
    } 
}
