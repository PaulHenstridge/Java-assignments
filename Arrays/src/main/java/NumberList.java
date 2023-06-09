import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<Integer>();
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumber(int num) {
        this.numbers.add( num);
    }

    public int getTotal(){
        int total = 0;
//        for(int i=0; i < getNumberCount(); i++){
//            total += this.numbers.get(i);
//        }
        for(int number : this.numbers) total += number;
        return total;
    }
}
