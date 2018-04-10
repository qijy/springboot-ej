package cn.com.qijy.springbootej.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * Created by qijunyu on 2018/1/18.
 */
@Component
public class SpringSimpleJob1 implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                System.out.println("This is my Case 0 Test1! This is My 0 Service!");
                break;
            case 1:
                System.out.println("This is my Case 1 Test1! This is My 1 Service!");
                break;
            case 2:
                System.out.println("This is my Case 2 Test1!");
                break;
            // case n: ...
        }
    }

}
