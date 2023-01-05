class Program10 {
    public static void main(String args[]) {
        int a[] = new int[10];
        int i, t, j;
        for (i = 0; i < args.length; i++) {
            a[i] = Integer.valueOf(args[i]);
        }
        System.out.println("Unsorted Array is:");
        for (i = 0; i < args.length; i++) {
            System.out.println(a[i] + "\t"); // PRINTING UNSORTED ELEMENTS
        }
        for (i = 0; i < args.length; i++) // SORTING THE ELEMENTS IN ARRAY
        {
            for (j = 0; j < args.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }

        }
        System.out.println("Sorted Array:");
        for (i = 0; i < args.length; i++) {
            System.out.println(a[i] + "\t"); //// PRINTING SORTED ELEMENTS
        }
    }
}