package MyPack;
class Balance{
String name;
double bal;
Balance(String n,double b)
{
name=n;
bal=b;
}
void show()
{
if(bal>0)
System.out.println("----->"+name+":"+bal);
}
}
class Account
{
public static void main(String args[])
{
Balance c[]=new Balance[3];
c[0]=new Balance("Om",20);
c[1]=new Balance("Om",200);
c[2]=new Balance("Om",2000);

for(int i=0;i<3;i++)
c[i].show();
}
}

