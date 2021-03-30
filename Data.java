/**
 * class Data
 * @author Kelompok 7
 * @version 30 Maret 2021
 */
 
public class Data {
   private Status nip;
   
   public Data() {
       nip = null; 
    }
    
    public void InsertTo(Status nomornip) {
        nip = nomornip;
    }
    
   public void MemasukkanData() {
       if(nip != null) {
        nip.MemprosesData();
        }
        else {
        System.out.println("Harap masukkan nip anda");
        }
    }
     
}
