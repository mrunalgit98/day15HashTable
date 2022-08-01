import java.util.Map;
import java.util.TreeMap;

public class HashTable {


    static void count(String str){
        Map<String,Integer>map =new TreeMap<>();
        String arr[]=str.split("");
        for(int i=0 ;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().equals("avoidable"))
            continue;
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str="paranoids are not paranoids because they are paranoid but they keep putting themselves deliberately into paranoid avoidable situation";
        count(str);

    }
}
