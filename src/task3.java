public class task3 {
    public static void main(String[] args) {
        System.out.println(solutions(1,0,-1));
        System.out.println(findZip("zip zip"));
        System.out.println(checkPerfect(12));
        System.out.println(flipEndChars("ziz"));
        System.out.println(isValidHexCode("#CD_C5C"));
        int [] array1 = {9};
        int [] array2 = {4};
        System.out.println(same(array1,array2));
        System.out.println(isKaprekar(297));
        System.out.println(longestZero("000000100"));
        System.out.println(nextPrime(111));
        System.out.println(rightTriangle(70,130,110));
    }
    public static int solutions(int a, int b, int c) {
        double D = Math.pow(b,2) - (4 * a * c);
        int k =- 1;
        if (((a==0) && (b==0) && (c==0)) || ((a==0) && (b==0)))
            k = 0;
        else if ((a==0) && (b != 0))
            k = 1;
        else if (D==0)
            k = 1;
        else if (D>0)
            k = 2;
        else if (D<0)
            k = 0;
        return k;
    }
    public static int findZip(String A) {
        int k = 0;
        int t = -1;
        for (int i = 0; i < A.length(); i++) {
            if (i < A.length() - 2)
                if ((A.charAt(i) == 'z') && (A.charAt(i + 1) == 'i') && (A.charAt(i + 2) == 'p')) {
                    k += 1;
                    t = i;
                }
        }
        if (k > 1)
            return t;
        else
            return -1;
    }
    public static boolean checkPerfect (int N) {
        int sum = 0;
        for (int i = 1; i < N; i++){
            if (N % i == 0)
                sum += i;
        }
        if (sum == N)
            return true;
        else
            return false;
    }
    public static String flipEndChars(String A) {
        if (A.length() < 2)
            return  "Incompatible";
        else if (A.charAt(0) == A.charAt(A.length()-1))
            return "Two's a pair";
        else {
            char a = A.charAt(0);
            char b = A.charAt(A.length() - 1);
            A = A.substring(1, A.length() - 1);
            A = b + A + a;
            return A;
        }
    }
    public static boolean isValidHexCode(String A) {
        if ((A.charAt(0) != '#') && (A.length() != 6))
            return false;
        else
            for (int i = 1; i < A.length()-1; i++) {
                if (!((A.charAt(i) >= 'A') && (A.charAt(i)) <= 'F') && !((A.charAt(i) >= 'a') && (A.charAt(i)) <= 'f') && !((A.charAt(i) >= '0') && (A.charAt(i)) <= '9'))
                    return false;
            }
        return true;
    }
    public static boolean same(int[] array1, int[] array2) {
        int k1 = array1.length , k2 = array2.length;
        for (int i = 1; i < array1.length; i++ ) {
            for (int j = 0; j < i; j++)
                if (array1[i] == array1[j])
                    k1 -= 1;
        }
        for (int i = 1; i < array2.length; i++ ) {
            for (int j = 0; j < i; j++)
                if (array2[i] == array2[j])
                    k2 -= 1;
        }
        if (k1 == k2)
            return true;
        else
            return false;
    }
    public static boolean isKaprekar (int A){
        int B = A * A;
        String C = Integer.toString(B);
        if (C.length()==1)
            if (B == A)
                return true;
            else
                return false;
        else {
            String D = C.substring(0, C.length() / 2);
            String E = C.substring(D.length(), C.length());
            if ((Integer.parseInt(D) + Integer.parseInt(E)) == A)
                return true;
            else
                return false;
        }
    }
    public static String longestZero(String A)
    {
        String max = "" ;
        String k = "";
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0')
                k += "0";
            else if (A.charAt(i) == '1')
                k = "";
            if (max.length() < k.length())
                max = k;
        }
        return (max);
    }
    public static int nextPrime (int N)
    {
        for (int i = 2; i < N; i++ )
            if (N % i == 0) {
                N += 1;
                i = 2;
            }
        return N ;
    }
    public static boolean rightTriangle(int X, int Y, int Z) {
        if ((X > Y) && (X > Z)) {
            if (X * X == (Z * Z + Y * Y))
                return true;
        }
        if ((X < Y) && (Y > Z)) {
            if (Y * Y == (Z * Z + X * X))
                return true;
        }
        if ((Z > Y) && (X < Z)) {
            if (Z * Z == (X * X + Y * Y))
                return true;
        }
        return false;
 }
}
