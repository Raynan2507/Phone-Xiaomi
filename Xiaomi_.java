
package xiaomi_;


public class Xiaomi_ implements Phone{

   private int volume;
    private boolean isPowerOn;

    public Xiaomi_() {
        // set volume awal
        this.volume = 50;
    }
     
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone Hidup");
        System.out.println("Be The Best With Us");
        System.out.println("Android version 10");
    }
     @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Tewas");
}
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume = 100%");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Dimohon Di nyalakan");
        }
    }
    
     @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Dimohon Di nyalakan");
        }
    }
      public int getVolume() {
        return this.volume;
    }
}

    

