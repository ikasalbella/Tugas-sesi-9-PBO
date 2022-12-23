/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_9.no1;

/** Nama    : IKA
 *  Kelas   : TI21F
 *  MatKul  : PBO
 */
public class Mahasiswa<A,B,C>{
    private A nim;
    private B name;
    private C clas;

    public A getNim(){
        return nim;
    }

    public void setNim(A nim){
        this.nim=nim;
    }

    public B getName(){
        return this.name;
    }

    public void setName(B name){
        this.name=name;
    }

    public C getClas(){
        return clas;
    }

    public void setClas(C clas){
        this.clas=clas;
    }
}    

