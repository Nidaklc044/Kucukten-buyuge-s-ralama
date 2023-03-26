package algobirbüt;
public class Algobirbüt{
public static void main(String[] args) {

int[]sayilar={5,3,99};
int enId,n=sayilar.length;
int en,temp;
for(int i=0;i<n;i++){
    en=sayilar[i];
    enId=i;
    for(int j=i;j<n;j++){
        if(sayilar[j]<=en){
            en=sayilar[j];
            enId=j;
            
        }
    }
    temp=sayilar [i];
    sayilar [i]=sayilar[enId];
    sayilar[enId]=temp;
}
    for(int i=0;i<n;i++){
        System.out.println(sayilar[i]);
    }
    
}

}

