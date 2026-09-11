public class CountEven {
public static void main(String[] args){
int[] numbers = {4, 7, 2, 9, 1};
int count = 0;
for(int num : numbers){
 if(num % 2 == 0){
  count ++;
}
}
System.out.println(count);
}
}
