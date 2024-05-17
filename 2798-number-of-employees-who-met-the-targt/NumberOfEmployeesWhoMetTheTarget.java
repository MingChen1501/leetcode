public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3 ,4};
        int target = 2;
        System.out.println(numOfEmployees(hours, target));
    }

    private static int numOfEmployees(int[] hours, int target) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                result++;
            }
        }
        return result;
    }
}
