import MyPack.*;

class Pac
{
public static void main(String args[])
{
Account1 c[]=new Account1[3];
c[0]=new Account1("Om",20);
c[1]=new Account1("Om",200);
c[2]=new Account1("Om",2000);

for(int i=0;i<3;i++)
c[i].show();
}
}