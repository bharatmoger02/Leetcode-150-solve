import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;

    public static void main(String[] args) {
        InsertDeleteGetRandom obj = new InsertDeleteGetRandom();
        System.out.println("Insert 1: " + obj.insert(1));
        System.out.println("Remove 2: " + obj.remove(2));
        System.out.println("Insert 2: " + obj.insert(2));
        System.out.println("Random: " + obj.getRandom());
        System.out.println("Remove 1: " + obj.remove(1));
        System.out.println("Insert 2: " + obj.insert(2));
        System.out.println("Random: " + obj.getRandom());
    }



    public InsertDeleteGetRandom()
    {
        this.list=new ArrayList<>();
        this.map=new HashMap<>();
        this.random=new Random();
    }

    public boolean insert(int val)
    {
        if(map.containsKey(val))
            return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    public boolean remove(int val)
    {
        if(!map.containsKey(val))
            return false;
        int lastElement = list.get(list.size()-1);
        int index = map.get(val);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom()
    {
        int n = random.nextInt(list.size());
        return list.get(n);
    }
}
