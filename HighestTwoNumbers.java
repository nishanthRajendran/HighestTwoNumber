public class HighestTwoNumbers {
    void Number() {
        int[] num = {11, 22, 45, 92, 21, 54, 79, 11};
        int temp;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("First Largest ::" + num[n - 1]);
        System.out.println("Second Largest::" + num[n - 2]);
    }
    public static void main(String[] args) {
        HighestTwoNumbers high=new HighestTwoNumbers();
        high.Number();
    }
}
