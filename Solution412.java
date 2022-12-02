import java.util.List;

class Solution412 {
    public List<String> fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            result[i-1] = "";
            if(i % 3 == 0){
                result[i-1] += "Fizz";
            }
            if(i%5==0){
                result[i-1] += "Buzz";
            }
            if (result[i-1].equals("")){
                result[i-1] = Integer.toString(i);
            }
        }
        return List.of(result);
    }
}
