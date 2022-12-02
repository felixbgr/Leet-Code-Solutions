class Solution1342 {
    public int numberOfSteps(int num) {
        int counter = 0;
        while(num != 0){
            switch (num % 2){
                case 0 -> {
                    num /= 2;
                    counter++;
                }
                default -> {
                    num -=1;
                    counter ++;
                }
            }
        }
        return counter;
    }
}