import java.util.Arrays;

public class Main {
static boolean isRepetitive(int arr[], int value){
    for (int i = 0 ; i<arr.length;i++){
        if(value==arr[i])
            return false;
    }
    return true;

}
    public static void main(String[] args) {
int[] dizi = {1,1,5,6,9,85,4,5,5,4,4,8,9,3,2,5,6,8,7,1,55,22,2,22,5,55};
int[] tekrareden = new int[dizi.length];

int counter = 0;                                       // bu sayac isrepetitive fonksiyonunun sayacı 26. satırda kullandık o fonksiyonu

for (int i=0;i< dizi.length;i++){
    int sayac = 1 ;             // sayac 1 dedik çünkü her sayı birkere tekrar ediyor artarsa altta artırıyoruz. bunu buraya koyduk çünkü !! i değişince 0 lanmasını istiyoruz.
for (int j = 0 ; j < dizi.length; j++){
                                                                         // standart çiftli loopumuzu oluşturduk hersayıyı dönüp bakıcaz
    if ((i!=j) && (dizi[i]==dizi[j]) ){
        sayac++;
    }
}
    if (isRepetitive(tekrareden, dizi[i])){
        /*   projenin benim için canalıcı noktası bura oldu burada konsola yazdırma işlemi döngü devam ederken tekrareden[] arrayında eşleşen eleman varsa
        döngü false veriyor ve
        sout fonksiyonu çalışmıyor böylelikle tekrar eden sayılar sadece 1 defa konsola yazdırılıyor. */
        tekrareden[counter]=dizi[i];
        counter++;
        System.out.println(dizi[i] + " sayısı "+ sayac + " kadar tekrar edildi");
    }
}

    }
}