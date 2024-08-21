public class mergeoftwosorted{

    public static void merge(int[] arr1, int[] arr2, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] result = new int[arr1.length + arr2.length];

        merge(arr1, arr2, result);

        System.out.println("Merged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
