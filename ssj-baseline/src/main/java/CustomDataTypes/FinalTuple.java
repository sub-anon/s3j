package CustomDataTypes;

import org.apache.flink.api.java.tuple.Tuple10;
import org.apache.flink.api.java.tuple.Tuple11;
import org.apache.flink.api.java.tuple.Tuple12;

public class FinalTuple extends Tuple12<Integer,String,Integer,String,Integer,Integer,Long,Long,Integer,Double[],Integer,String> {

    public FinalTuple(){}

    public FinalTuple(Integer t0, String t1, Integer t2, String t3, Integer t4, Integer t5, Long t6, Long t7, Integer t8, Double[] t9, Integer t10, String t11){
        super(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
    }


    public Integer size(){
        return (Integer.BYTES * 6) + (Long.BYTES * 2) + (this.f9.length * Double.BYTES) + this.f1.getBytes().length + this.f3.getBytes().length + this.f11.getBytes().length;
    }


}
