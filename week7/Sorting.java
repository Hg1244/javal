package week7;
public class Sorting{
public static void main(String[] args){
int a[ ]={2,3,5,7,91};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){ 
if(a[i]>a[j]){
int temp=a[i];
 a[i]=a[j];
a[j]=temp;
}
}
}
}

