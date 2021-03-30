/**
 * class Main
 * @author Kelompok 7
 * @version 30 Maret 2021
 */
public class Main{
     public static void main (String args[]){
         Pensiun nipPensiun = new Pensiun();
         Cuti nipCuti = new Cuti();
         Aktif nipAktif = new Aktif();
         Sakit nipSakit = new Sakit();
         
         Data nip1 = new Data();
         Data nip2 = new Data();
         Data nip3 = new Data();
         Data nip4 = new Data();

         nip1.InsertTo(nipPensiun);
         nip2.InsertTo(nipCuti);
         nip3.InsertTo(nipAktif);
         nip4.InsertTo(nipSakit);

         nip1.MemasukkanData();
         nip2.MemasukkanData();
         nip3.MemasukkanData();
         nip4.MemasukkanData();
    }
}