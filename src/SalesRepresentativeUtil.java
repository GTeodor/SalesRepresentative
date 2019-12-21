/**
 * This class is developed for executing a bubble sort algorithm
 * on objects of SalesRepresentative data type
 */

public class SalesRepresentativeUtil {
    public static void main(String[] args) {

        SalesRepresentative guy1 = new SalesRepresentative("guy 1",10, 500);
        SalesRepresentative guy2 = new SalesRepresentative("guy 2",7, 800);
        SalesRepresentative guy3 = new SalesRepresentative("guy 3",5,400);
        SalesRepresentative guy4 = new SalesRepresentative("guy 4",7,1000);


        SalesRepresentative [] reps = {guy1, guy2,guy3,guy4};
        SalesRepresentative [] sortedReps = SalesRepresentativeUtil.sort(reps);

        for (SalesRepresentative salesRepresentative: sortedReps) {
            System.out.println(salesRepresentative);
        }
    }

    /**
     * This method is develop to sort an array of objects of
     * SalesRepresentative data type using a bubble sort algorithm
     *
     * @param reps will be the name of the arrays of object
     * @return the sorted array in a descending order with
     * the most revenue generated via sales the first object
     */

    public static SalesRepresentative [] sort(SalesRepresentative[] reps) {
        int n = reps.length;
        SalesRepresentative temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(reps[j-1].wortOfSales() < reps[j].wortOfSales()){
                    // Swap elements
                    temp = reps[j-1];
                    reps[j-1] = reps[j];
                    reps[j] = temp;
                }
            }
        }
        return reps;
    }
}
