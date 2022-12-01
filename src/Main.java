import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     double[] list={2.0,4.0,3.0};
     double toplam=0;

     for(int i=0; i<list.length;i++){
         toplam+=1/list[i];
     }
        System.out.println("ort:"+(toplam));
    }}
