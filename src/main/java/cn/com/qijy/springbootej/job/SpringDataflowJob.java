package cn.com.qijy.springbootej.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qijunyu on 2018/1/19.
 */
public class SpringDataflowJob implements DataflowJob {

    @Override
    public List<Foo> fetchData(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                List<Foo> data = null;// get data from database by sharding item 0
                return data;
            case 1:
                List<Foo> data1 = null;// get data from database by sharding item 1
                return data1;
            case 2:
                List<Foo> data2 = null;// get data from database by sharding item 2
                return data2;
            default:
                return new ArrayList<>();
            // case n: ...
        }
    }

    @Override
    public void processData(ShardingContext shardingContext, List data) {
        // process data
        // ...
    }
}
