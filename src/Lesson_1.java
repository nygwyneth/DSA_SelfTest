class Lesson_1 {
    public static void main(String[] args) {
        // linearSearch();
        // selectionSort();
        // binarySearch();
        // squareRoot();
        // linearSearchArray();
    }

    // LINEAR SEARCH
    public static void linearSearch() {
        int numbers[] = {12, 13, 4, 6, 52, 4, 5, 43, 56};
        int x = 40;
        int result = findNumber(numbers, x);
        
        if (result == -1) System.out.println("Not found!");
        else System.out.println("Found! \nPosition: " + result);
    }
    
    public static int findNumber(int A[], int x) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) return i;
        }
        return -1;
    }

    // SELECTION SORT
    public static void selectionSort() {
        Integer numbers[] = {9, 7, 8, 8, 26, 27, 28, 29, 1};
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        sortNumbers(numbers);
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void sortNumbers(Integer Array[]) {
        for (int i = 0; i < Array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j].compareTo(Array[k]) < 0) {
                    k = j;
                }
            }
            Integer tmp = Array[i];
            Array[i] = Array[k];
            Array[k] = tmp;
        }
    }

    // BINARY SEARCH
    public static void binarySearch() {
        int numbers[] = {5, 9, 11, 17, 21, 81};
        int x = 81;

        int result = findNumBS(numbers, x);
        
        if (result == -1) System.out.println("Not found");
        else System.out.println("Found! \nPosition: " + result);
    }

    public static int findNumBS(int arr[], int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    // COMPUTE SQUARE ROOT
    public static void squareRoot() {
        System.out.println(getSquareRoot(9, 0.1));
    }

    public static double getSquareRoot(double n, double epsilon) {
        double low, hi, mid = 0, cur = 0;

        if (n < 1) {
            low = n;
            hi = 1;
        } else {
            low = 0;
            hi = n;
        }

        while (hi - low > epsilon) {
            mid = low + (hi - low) / 2.0;
            cur = mid * mid;

            if (cur == n) return mid;
            else if (cur > n) hi = mid;
            else low = mid;
        }

        return mid;
    }

    // SELF TEST: LINEAR SEARCH IN 2D ARRAY
    public static void linearSearchArray() {
        int numbers[][] = {
            {13, 17, 43, 76},
            {18, 14, 9, 21},
            {1, 7, 6, 45},
            {9, 65, 80, 33}
        };
        int n = 6;
        int result = findInArray(numbers, n);

        if (result == -1) System.out.println("Element " + n + " is not in the list");
        else System.out.println("Element " + n + " is in index " + (result - 1));

    }

    public static int findInArray(int arr[][], int n) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                pos++;
                if (arr[i][j] == n) {
                    return pos;
                }
            }
        }
        return -1;
    }
}