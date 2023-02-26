package org.digi.marvel.numbers;

class Solution
{
    String result = "";

    String generateIncreasingNum(int start, String out, int n)
    {
        if (n == 0)
        {
            System.out.print(out + " ");
            result = result + out + " ";
            return result;
        }
        for (int i = start; i <= 9; i++)
        {
            String str = out + Integer.toString(i);
            generateIncreasingNum(i, str, n - 1);
        }
        return result;
    }

    public String run(int input) {
        String result = "";
        Solution obj = new Solution();
        if (input >= 1 && input <= 9) {
            result = obj.generateIncreasingNum(1, " ", input);
            System.out.print("result ::" + result);

        } else {
            result = "Please enter a valid number between 1 to 9";
        }
        return result;
    }

}

