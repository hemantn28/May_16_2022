package strings;

public class A {

    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Learn Java");
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder=new StringBuilder("Java Learned");
        System.out.println(stringBuilder.reverse());

        int l,i;
        String str="Learn Python";
        String str2="";
        l=str.length();

        for (i=l-1; i>=0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
    }
}
