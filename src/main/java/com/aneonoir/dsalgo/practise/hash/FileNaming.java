package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * link: https://app.codesignal.com/arcade/intro/level-12/sqZ9qDTFHXBNrQeLC
 * TODO: good one, with amazing catch.
 *
 */
public class FileNaming {
    String[] fileNaming(String[] names) {

        Map<String,Integer> hash=new HashMap<>();
        String result[]= new String[names.length];
        for(int i=0;i<names.length;i++){
            if(hash.containsKey(names[i])){
                Integer val=hash.get(names[i]);
                hash.put(names[i],val+1);
                hash.put(names[i]+"("+val+")",val);
                result[i]=names[i]+"("+val+")";
            }else{
                hash.put(names[i],1);
                result[i]=names[i];
            }
        }
        return result;
    }

}
