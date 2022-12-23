/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_9.no2.Game;

/** Nama    : IKA
 *  Kelas   : TI21F
 *  MatKul  : PBO
 */
public class Marksman extends Hero{
    private String nama;
    private float hp=2500;
    private float attack=130;
    private float defense=15;

    Marksman(String nama,float hp,float attack,float defense){
        this.nama=nama;
        this.hp=hp;
        this.attack=attack;
        this.defense=defense;
    }
    Marksman(String nama){
        this.nama=nama;
    }
    
    @Override
    String getName() {
        return this.nama;
    }
    @Override
    float getHp() {
        return this.hp;
    }
    @Override
    float getAttack() {
        return this.attack;
    }
    @Override
    float getDefense() {
        return this.defense;
    }

    @Override
    public void infoHero() {
        System.out.println(
            getName()+" :"+
            "\n\tHP\t: "+getHp()+
            "\n\tAttack\t: "+getAttack()+
            "\n\tDefense\t: "+getDefense()
        );
        System.out.println("");
    }
}
    

