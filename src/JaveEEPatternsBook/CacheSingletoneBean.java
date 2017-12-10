package JaveEEPatternsBook;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Startup
@Singleton
public class CacheSingletoneBean {

    private Map<Integer, String> myCache;

    @PostConstruct
    public void start(){
        myCache = new HashMap<>();
    }

    public void addUser(Integer id, String name){
        myCache.put(id, name);
    }

    public String getName(Integer id){
        return myCache.get(id);
    }

}
