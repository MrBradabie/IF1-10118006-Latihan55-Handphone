 
package if1.pkg10118006.latihan55.handphone;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 */
public class Nokia extends Handphone{
    
    private String wpKeyStore;

    public Nokia(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
    
    
}
