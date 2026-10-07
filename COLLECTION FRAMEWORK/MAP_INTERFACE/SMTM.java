import java.util.*;
public class SMTM{
public static void main(String[]args){

Map<String,Integer> map=new TreeMap<String,Integer>();
map.put("aaa",101);
map.put("bbb",102);
map.put("ccc",103);
map.put("ddd",104);
map.put("eee",105);
map.put("fff",106);

System.out.println(map);

Set<String> keyset=map.keySet();
System.out.println(keyset);

int i=map.get("aaa");
System.out.println(i);

for(String key:keyset){
System.out.println(key);
}
}
}