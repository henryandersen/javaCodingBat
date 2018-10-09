public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));

        System.out.println(nextMethod(true));
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking == true && (hour < 7 || hour > 20));
    }
    public String frontTimes(String str, int n) {
        int frontLength = 3;
        if(str.length() < 3){
            frontLength = str.length();
        }
        String front = str.substring(0,frontLength);
        String result = "";
        for(int i =0; i< n; i++){
            result = result + front;
        }
        return result;
    }
    public String middleTwo(String str) {
        int mid = str.length()/2;

        return str.substring(mid-1,mid + 1);;
    }
    public int[] swapEnds(int[] nums) {
        int last = nums[nums.length -1];
        int first = nums[0];
        nums[0] = last;
        nums[nums.length -1] = first;
        return nums;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep == true){
            return false;
        }
        if(isMorning==true){
            return(isMom == true);
        }
        return true;
    }
    public int roundSum(int a, int b, int c) {
        int d = round10(a);
        int e = round10(b);
        int f = round10(c);
        return d + e + f;

    }
    public int round10(int num){
        int last = num % 10;
        if(last < 5){
            num = num - last;
            return num;
        }
        num = num + 10 - last;
        return num;
    }
    public String getSandwich(String str) {
        int length = str.length();
        String empty = "";
        boolean found = false;
        int begin = 0;
        int end = 0;
        String tempStr = "";
        if (length < 11) {
            return empty;
        }
        for (int i = 0; i < length - 4; i++) {
            tempStr = str.substring(i, i + 5);
            if (tempStr.equals("bread") && found == true) {
                end = i;
            }
            if (tempStr.equals("bread") && found == false) {
                begin = i + 5;
                found = true;
            }
        }
        String sol = str.substring(begin, end);
        return sol;
    }
    public int sumNumbers(String str) {
        int length = str.length();
        int sum = 0;
        String num = "";
        for(int i = 0; i<length; i++){
            if(Character.isDigit(str.charAt(i)) == true){
                if(i < length-1 && Character.isDigit(str.charAt(i+1))){
                    num += str.charAt(i);
                }else{
                    num += str.charAt(i);
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return sum;
    }
    public boolean has77(int[] nums) {
        int length = nums.length;
        for(int i =0;i< length; i++){
            if(nums[i] == 7){
                if(i < length - 1 && nums[i+1] == 7){
                    return true;
                }
                if(i < length -2 && nums[i+2] == 7){
                    return true;
                }
            }
        }
        return false;
    }
    public int[] fix45(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
                    j++;
                }
                nums[j] = nums[i + 1];
                nums[i + 1] = 5;
            }
        }
        return nums;
    }
}
