/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_9.no2.MyBook;

import java.util.ArrayList;

/** Nama    : IKA
 *  Kelas   : TI21F
 *  MatKul  : PBO
 */
public class BukuKu{
    public static void main(String[] args) {
        Buku buku1=new Buku("Sherlock Holmes", "Arthur Conan Doyle", 1892);
        Buku buku2=new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009);
        Buku buku3=new Buku("Ranah 3 Warna", "Ahmad Fuadi", 2009);
        Buku buku4=new Buku("Rantau 1 Muara", "Ahmad Fuadi", 2013);

        ArrayList<Buku> BukuAku=new ArrayList<Buku>();
        BukuAku.add(buku1);
        BukuAku.add(buku2);
        BukuAku.add(buku3);
        BukuAku.add(buku4);

        for(Buku buku: BukuAku){
            buku.infoBuku();
        }
    }
}
