package algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercitiiAlgoritm {
    public int calculateSum(int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+i;

        }
        return sum;
    }



public int calcuteEvenNumberSum(int n) {
    int sum2 = 0;
    for (int i = n; i >= 0; i--) {
        if (i % 2 == 0) {
            sum2 = sum2 + i;
        }
    }
    return sum2;
}

public boolean lastDigit(int x, int y){
        boolean rez;
        if(x%10==y%10){
            rez=true;
        }
        else rez=false;
    return rez;
    }

public boolean even(int x){
        boolean rez;
        if(x%2==0){
            rez=true;
        }
        else rez=false;
        return rez;
}



public static void rest(int pret, int bani){
        int restDeDat=bani-pret;
        int div100=restDeDat/100;
        int rest1=restDeDat-(div100*100);
        int div50=rest1/50;
        int rest2=rest1-(div50*50);
        int div10=rest2/10;
        int rest3=rest2-(div10*10);
        int div5=rest3/5;
        int rest4=rest3-(div5*5);
        double div1Ban=rest4/0.01;

    System.out.println("Bancnote de 100="+div100);
    System.out.println("Bancnote de 50="+div50);
    System.out.println("Bancnote de 10="+div10);
    System.out.println("Bancnote de 5="+div5);
    System.out.println("Monezi de 1 ban="+div1Ban);
}


//ex 87
    public boolean equalsFirstLast(int[]a){
        boolean rez;
        if(a.length>=1 && a[0]==a[a.length-1]){
            rez=true;
        }
        else rez=false;
        return rez;
    }

//ex 88
    public int[] rotateArray(int[]a){

        if(a.length==3){
            int cont=a[0];
            a[0]=a[1];
            a[1]=a[2];
            a[2]=cont;
            return a;
        }
        return new int[]{0,0,0};
    }

    //ex 88 modificat
    public int[] rotateBiggerArray(int[]a){
        int cont=a[0];
        for(int i=1; i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=cont;
        return a;
    }

    //ex 89
    public boolean sameElements(int[]a, int[]b){
        boolean rez;
        if(a[0]==b[0]||a[a.length-1]==b[b.length-1]){
            rez=true;
        }
        else rez=false;
        return rez;
    }

    //ex 90
    public int sumOfArrayElem(int[]a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        return sum;
    }

    //ex 91
    public int[] reverseArray(int[]a){
        int[]b=a;
        for(int i=0; i<a.length; i++){
            a[i]=b[a.length-1-i];
            System.out.println(a[i]+"___________________");
        }

        return a;
    }

    public static double pay(double payment, int totalTime){

        double salary=8*payment;
        if(totalTime>8){
            int overTime=totalTime-8;
            double overTimeSalary=1.5*overTime*payment;
            return salary+overTimeSalary;

        }
        return salary;
    }


    public Map<String, Integer> pairCounts(List<String> wordList){
        Map<String, Integer> pereche= new HashMap<>();
        for(String s:wordList) {
            for(int i=0; i<s.length()-1; i++){
                String pair=s.substring(i,i+2);
                if(pereche.containsKey(pair)){
                    int laValoare=pereche.get(pair);
                    pereche.put(pair,laValoare+1);
                }else{
                    pereche.put(pair,1);
                }

            }
        }
        return pereche;
    }







    public static void main(String[] args){

       double rez=pay(2,10);
        System.out.println(rez);
        List<String> wordList=new ArrayList<>();

        int result=justForTest(18);

        }



    public static int justForTest(int param){
        int t;
        int a=20;
        int b=10;
        int c=b*2;
        int d=a+2*b-c;
        if(d>param){
            t=11;
        }
        else{
            t=22;
        }
        boolean boo=false;
        while(t<13){
            System.out.println(t);
            t++;
        }
        int[] sir=new int[3];
        sir[0]=0;
        sir[1]=1;
        sir[2]=2;
        boo=sir.length==3;
        return t*2;


    }








}


