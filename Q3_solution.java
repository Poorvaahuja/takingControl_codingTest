class Result {

    /*
     * Complete the 'steadyGene' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING gene as parameter.
     */

    public static int steadyGene(String gene) {
    // Write your code here
         // count for each element
            // if the count if >2 replace one, and search for the other extra member
            
        int n = gene.length();
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch: gene.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
            if(freqMap.get(ch) >2)
                return pairReplacement(gene, n/4);
        }
     }
    String pairReplacement(String gene, int freq){
        Map<Character, Integer> freqMap = new HashMap();
        for(char ch: gene.toCharArray()){
            if(freqMap.get(ch) == freq){
                pairReplacement.append(ch);
                freqMap.put(ch, 0);
            }
        }
        return pairReplacement.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String gene = bufferedReader.readLine();

        int result = Result.steadyGene(gene);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
