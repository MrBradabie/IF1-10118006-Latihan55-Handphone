 
package if1.pkg10118006.latihan55.handphone;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 */
public class BlackBerry extends Handphone{
    
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
}
