import java.util.*;
public class HM{
public static void main(String[]args){

Map<String,Integer> map=new HashMap<String,Integer>();
map.put("aaa",101);
map.put("bbb",102);
map.put("ccc",103);
map.put("ddd",104);
map.put("eee",105);

System.out.println(map);

//get all the key used 
Set<String> keyset=map.keySet();
System.out.println(keyset);

//get value of particular key 
int num=map.get("aaa");
System.out.println(num);

for(String key:keyset){
System.out.println(key +" ->"+map.get(key));
}


}
}