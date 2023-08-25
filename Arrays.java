import java.util.Scanner;

public class Arrays {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[]= new int[size];

        for (int i = 0; i < size; i++) {
           numbers[i]= sc.nextInt();
        }
        
        //  System.out.print(numbers[i]+" " ); 
        int key;
        System.out.println("Enter the key to search: ");
        key= sc.nextInt();
            
        for (int i = 0; i < size; i++) {
        if (key==numbers[i]) {
            System.out.println("Number"+key+"is in"+i+"Position" );
        }
        }
        }
        

    }

        
}
