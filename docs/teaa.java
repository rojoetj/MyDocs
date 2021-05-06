package java_linear_search;

public class Main {

    public static void main(String[] args) {
	System.out.println(recursiveLinearSearch(new int[]{10,20,30,40,50,60,70,20,90},0,90));
	System.out.println(recursiveBinarySearch(new int[]{10,20,30,40,50,50,70,80,90},0,8,110));
    }

    public static int recursiveLinearSearch(int[] a,int i, int x)
    {
        if(i > a.length-1) return -1;
        else if (a[i]==x) return i;
        else return recursiveLinearSearch(a, i + 1, x);

        }

        public static int recursiveBinarySearch( int[] a, int p, int r, int x)
        {
            System.out.println(p + "----" + r);
            int q;
            if(p>r) return -1;
            else {
                q = (p + r) / 2;
                if(a[q]==x) return q;
                    else if (x>a[q]) return recursiveBinarySearch(a,q+1,r,x);
                    else return recursiveBinarySearch(a,p,q-1,x);
                }
        }
    }

