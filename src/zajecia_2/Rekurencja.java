package zajecia_2;

public class Rekurencja {
    int iter = 0;

    public Rekurencja (int a){
        iter = a;
    }
    public int fibonacci(int iter){
        if  (iter ==0){
            return 0;
        }
        if (iter == 1){
            return 1;
        }
        else {
        return fibonacci(iter-1)+ fibonacci(iter-2);
        }
    }
}
