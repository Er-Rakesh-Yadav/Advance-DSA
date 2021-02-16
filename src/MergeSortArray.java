public class MergeSortArray {

    private static void printMethod(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] mergeSort(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        int midPoint = array.length / 2;
        int[] left = new int[midPoint];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[j];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);

        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[resultPointer]) {
                    result[leftPointer] = left[leftPointer];
                } else {
                    result[rightPointer] = right[rightPointer];
                }
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {1, 25, 56, 20, 5, 6};
        System.out.println("Initial Array:");
        printMethod(array);
        MergeSortArray.mergeSort(array);
        System.out.println("Sorted Array:");
        printMethod(array);
    }
}
