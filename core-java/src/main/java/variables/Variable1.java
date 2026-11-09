package variables;

public class Variable1 {

        boolean b1;
        byte by;
        char ch;
        short sh;
        int i;
        long l;
        float f;
        double d;
        String name;

//    public void display(b1+"\t"+by+"\t"+ch+"\t"+sh+"\t"+i+"\t"+l+"\t"+f+"\n"+d+"\t"+name) {
//
//    }

    @Override
    public String toString() {
        return "Variable1{" +
                "b1=" + b1 +
                ", by=" + by +
                ", ch=" + ch +
                ", sh=" + sh +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Variable1 vb=new Variable1();
       vb.b1=true;
       vb.by=122;
       vb.ch='a';
        System.out.println(vb);
        //vb.display();
    }

}
