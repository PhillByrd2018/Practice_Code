import java.util.*;

public class GoogleMockBarcode {

    public static String fixBarcode(String S, int K){

        if (S == null || S.equals("")){
            return null;
        } else {

            S = S.replace("-", "");
//            System.out.println(S.length());
            if (S.length() <= K) {
                return S.toUpperCase();
            } else {
                S = S.toUpperCase();

                String returnString = "";
                for (int i = S.length() - K; i >= 0; i -= K) {
                    if (i == 0) { // k=2 "rr-uu-tt-hh"
                        returnString = S.substring(0, K) + returnString;
                    } else if (i < K) {
                        returnString = S.substring(0, i) + returnString;
                    } else {
                        returnString = "-" + S.substring(i, i + K) + returnString;
                    }
                }
                return returnString;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(fixBarcode("as987-sd-879-asdgrwe", 3)); //expect "AS-987-SD8-79A-SDG-RWE"
        System.out.println(fixBarcode("Bas987-sd-879-asdgrwe", 9)); //expect "BAS987SD8-79ASDGRWE"
        System.out.println(fixBarcode("as9", 4)); //expect "AS9"
        System.out.println(fixBarcode("", 4)); //expect null
        System.out.println(fixBarcode(null, 4)); //expect null
        System.out.println(fixBarcode("ee-e", 4)); //expect eee
        System.out.println(fixBarcode("ee-e-", 4)); //expect eee
    }

}


