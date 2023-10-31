class loop2
{
 public static void main(String[] args) 
{

int fact=2; 
int i=1;
int num=5;

do{
fact*=i;
i++;
}
while(i<=num);
System.out.println(fact);
}
}