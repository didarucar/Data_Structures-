package Arrays;

public class OrderArray {
    private  long[] dizi;
    private  int elemanSayisi;



    public OrderArray(int max){
        dizi=new  long[max];
        elemanSayisi=0;
    }
    public  int size(){

        return  elemanSayisi;
    }
    public  void  insert(long value){
        int j;


        for ( j = 0; j <elemanSayisi ; j++)
            if (dizi[j]>value)
                break;


        for (int k = 0; k < elemanSayisi; k++)
            dizi[k]=dizi[k+1];
        dizi[j]=value;
        elemanSayisi++;

        }
       /* public  boolean delete(long value){
        int j=find(value);
        if (j==elemanSayisi)
            return false;
        else {
            for (int k = j; k <elemanSayisi ; k++)
                dizi[k]=dizi[k+1];
            elemanSayisi--;
            return  true;*/
                public  int find(long searchKey){
                    int lowerBound=0;
                    int upperBound=elemanSayisi-1;
                    int curln;
                    while (true){
                        curln=(lowerBound+ upperBound)/2;
                        if (dizi[curln]==searchKey)
                            return curln;
                        else if (lowerBound>upperBound)
                            return elemanSayisi;
                        else {
                            if (dizi[curln]<searchKey)
                                lowerBound=curln+1;
                            else
                                upperBound=curln-1;
                        }

                    }

                }



    public  void  display(){
       for (int j = 0; j <elemanSayisi ; j++) {
           System.out.print(dizi[j]+" ");
           System.out.print("");

       }
    }
}




