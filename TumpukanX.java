
/**
 *
 * @author fikri
 */
public class TumpukanX {
    private int ukuranMaks;
    private long[] arrayTumpukan;
    private int atas;
    
    public TumpukanX (int s){
        ukuranMaks = s;
        arrayTumpukan = new long[ukuranMaks];
        atas = -1;
    }
    
    public void push(long j) {
        arrayTumpukan[++atas] = j;
    }
    
    public long pop(){
        return arrayTumpukan[atas--];
    }
    
    public long peek() {
        return arrayTumpukan[atas];
    }
    
    public boolean apaKosong(){
        return (atas == -1);
    }
    public boolean apaPenuh(){
        return (atas == ukuranMaks-1);
    }
}

class UjiTumpukan {
    public static void main(String[] args) {
        TumpukanX tumpukan = new TumpukanX(10);
        tumpukan.push(20);
        tumpukan.push(40);
        tumpukan.push(60);
        tumpukan.push(80);
        
        while( !tumpukan.apaKosong() ) {
            long nilai = tumpukan.pop();
            System.out.print(nilai);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
