public class BinarySearch {
    //returns the index of the target (if it exists in data)
    private static int binarySearch(int[] data, int target, int low, int high) {
        System.out.println("high : " + high + "low : " + low);
        if (low > high) {
            return -1;
        }

        //1. calculate mid value

        int mid = (high + low) / 2; //index
        System.out.println("midpoint index: " + mid);
        int midVal = data[mid];

        //2. handle 3 cases: equal to, lesser than, greater than

        if (midVal == target) {
            return mid;
        } else if (target > midVal) {
            low = mid + 1;
            return binarySearch(data, target, low, high);
        } else { //if (target < midVal)
            high = mid - 1;
            return binarySearch(data, target, low, high);
        }
        
    }

    public static int find(int[] data, int target) {
        return binarySearch(data, target, 0, data.length-1);
    }

    public static void main(String[] args) {
        int[] data = new int[8];
        data[0] = 1;
        data[1] = 5;
        data[2] = 7;
        data[3] = 11;
        data[4] = 15;
        data[5] = 17;
        data[6] = 22;
        data[7] = 300;

        int index = find(data, 1);
        System.out.println(index);

        //int index2 = find(data, 99);
        //System.out.println(index2);
    }
}
