import java.util.ArrayList;

public class Pintu extends Item{
    //UNTUK ATRIBUT DI DAPAT DARI CLASS ITEM

    //constrcutor
    public Pintu() {
        //init pilihan
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");
    }

    @Override
    public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencoba membuka pintu. TERKUNCI!");
            }
        }
    }

    //karena sudah ada di class parent nya maka yang ini akan di jadikan komen
    //sistemnya juga di class ini methodnya tidak ada maka akan mengecek ke parent nya
    //public void setObjGameInfo(GameInfo objGameInfo) {
    ////    this.objGameInfo = objGameInfo;
    //}

    @Override
    public ArrayList<String> getAksi() {
       return arrAksi;
    }

}
