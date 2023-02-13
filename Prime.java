class Prime
{
 public static void main( String args[] )
{
 int num,i=2,count=0;
 num = Integer.parseInt(args[0]);
while(i<num)
{
 if(num%i == 0)
{
 count++;
 break;
}
i++;
} 
 
if(count == 0)
{
System.out.println(num+" is a Prime Number");
}
else
{
System.out.println(num+" is not a Prime Number");
}

}
}