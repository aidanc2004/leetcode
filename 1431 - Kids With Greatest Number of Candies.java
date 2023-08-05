class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // array to store if it is the greatest
        List<Boolean> greatest = new ArrayList<Boolean>();

        // get max out of all kids
        int max = 0;
        for (int num : candies)
            if (num > max) max = num;

        // check if a kid will have the greatest amount of candies when given
        // the extra candies
        for (int num : candies)
            greatest.add(num + extraCandies >= max);

        return greatest;
    }
}