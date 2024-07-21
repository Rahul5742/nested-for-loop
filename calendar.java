public class calendar {
    public static void main(String[] args) {
        System.out.println("calendar:");

        for (int i =1; i <= 1; i++) {

            System.out.println(i + " year of 2080 ");

            for (int j = 1; j <= 12; j++) {
                System.out.println(j+"month");

                if(j==1) {
                    System.out.println("january:");

                } else if(j==2){
                    System.out.println( "february:");

                } else if(j==3){
                    System.out.println( "march:");

                } else if(j==4){
                    System.out.println( "april:");

                } else if(j==5){
                    System.out.println( "may:");

                } else if(j==6){
                    System.out.println( "june:");

                } else if(j==7){
                    System.out.println( "july:");

                } else if(j==8){
                    System.out.println( "august:");

                } else if(j==9){
                    System.out.println( "september:");

                } else if(j==10){
                    System.out.println( "october:");

                } else if(j==11){
                    System.out.println( "november:");

                } else if(j==12){
                    System.out.println( "december:");

                }

                for (int k = 1; k <= 4; k++) {

                    System.out.println(k + " week ");

                    System.out.print(" sunday ");
                    System.out.print(" monday ");
                    System.out.print(" tuesday ");
                    System.out.print(" wednesday ");
                    System.out.print(" thrusday ");
                    System.out.print(" friday ");
                    System.out.print(" saturday ");
                    System.out.println();



                    for (int l = 1; l <= 28; l++) {

                        System.out.print(" "+l+" ");
                        System.out.print(" ");
                    }

                    System.out.println();
                }
            }
        }
    }
}

