package review;
public class TestRun {

    static String name = "Ishani";
    //String name2 = "Ishani";

    public static void main(String[] args) {
        System.out.println(name.indexOf('a'));

        //output is -1
        System.out.println(name.indexOf('n', 'I'));

        System.out.println(name.indexOf("sha"));

        System.out.println(name.substring(2));

        /*
         *  > num of 'd' in entire string
         *  > how many words with more than 5 chars
         */

        String delta = "So, the Delta variant is a variant of concern that WHO is tracking and monitoring around the world. It's a variant of concern because we know it has increased transmissibility. This has been demonstrated by several countries. And we know that where the Delta variant is identified, it really rapidly takes off and spreads between people more efficiently than even the Alpha variant that was first detected around December, January 2021. As of today, the Delta variant has been reported in 96 countries and we expect that the Delta variant will continue to spread. There are a number of factors that are contributing to increased transmission around the world. The first are these variants of concern, including the Delta variant. The second factor is that we have increased social mixing and increased social mobility, which increases the number of contacts that individuals have. The third factor is the relaxation or the inappropriate use of public health and social measures. Proven public health and social measures that we know prevent infections, reduce the spread of somebody who is infected with the virus to others and save lives. And the fourth factor is the uneven and inequitable distribution of vaccines";

    }

}
