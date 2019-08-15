package coba;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Panjang : ");
        int len = input.nextInt();

        System.out.println("Masukan angka :");
        for (int x = 0; x < len; x++) {
            long b = input.nextLong();
            long w = input.nextLong();
            long bc =input.nextLong();
            long wc = input.nextLong();
            long z = input.nextLong();

            long result = taumBday(b, w, bc, wc, z);
            System.out.println(result);
        }
    }

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        long ret = 0;

        if (bc == wc) {
            ret = b * bc + w * wc;
        } else if (z > wc && z > bc) {
            ret = b * bc + w * wc;
        } else {
            if (bc < wc && bc+z < wc) {
                ret = b * bc + w * (bc + z);
            } else if (bc > wc && bc > wc+z){
                ret = b * (wc + z) + w * wc;
            }else{
                ret = b * bc + w * wc;
            }
        }
        return ret;
    }
}


