

public class Giai_phuong_trinh_bac_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.prinfln("a= "); float a=s.nextFloat();
        System.out.prinfln("b= "); float b=s.nextFloat();
        System.out.prinfln("c= "); float c=s.nextFloat();
        if(a==0){
            if(b==0){
                if(c==0)
                    System.out.println("PT VSN");
                    else System.out.println("PT vo nghiem");

            }
            else{
                float x=(float)(-b)/c;
                System.out.println("Nghiem cua phuong trinh la x=%.1f",x);

            }
        }
        else{
            float delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("PT VO NGHIEM");

            }
            else if(delta==0){
                System.out.println("PT CO NGHIEM KEP x=%.1f",-b/(2*a));
            }
            else{
                float x1=(float)(((-b)+Math.sqrt(delta))/2*a);
                float x2=(float)(((-b)-Math.sqrt(delta))/2*a);
                System.out.println("x1=%.1f",x1);
                System.out.println("x1=%.1f",x2);

            }
        }
    }
}
