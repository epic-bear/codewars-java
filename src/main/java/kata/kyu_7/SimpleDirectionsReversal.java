package kata.kyu_7;

public class SimpleDirectionsReversal {

    public static String [] solve(String [] arr){

        String[] direction = new String[arr.length];
        String[] x = new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            String[] sp = arr[i].split(" ");
            direction[i] = sp[0];
            x[i]="";
            for (int j = 1; j <sp.length ; j++) {
                x[i] += sp[j]+" ";
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (direction[i].startsWith("Right")){
               direction[i] = direction[i].replaceFirst("Right","Left");
            }
            else if (direction[i].startsWith("Left")){
                direction[i] = direction[i].replaceFirst("Left","Right");
            }
        }
        String[] result = new String[arr.length];
        result[0]=direction[0]+" "+x[arr.length-1];
        for (int i = 1; i <arr.length ; i++) {
            result[i]= direction[arr.length-i];
            result[i] += " "+x[arr.length-1-i];
        }
        for (int i = 0; i <arr.length ; i++) {

            result[i]=result[i].trim();
        }
        return result;
    }
}
