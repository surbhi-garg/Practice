class ApplicationConfigurations
{
    String dataSource;
    int connectionPool;
    private static ApplicationConfigurations applicationConfigurations;
    private ApplicationConfigurations(String dataSource,int connectionPool)
    {
        this.dataSource=dataSource;
        this.connectionPool=connectionPool;
    }
    public static ApplicationConfigurations getInstance()
    {
        if(applicationConfigurations==null)
            applicationConfigurations=new ApplicationConfigurations("reap",10);
        return applicationConfigurations;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(ApplicationConfigurations.getInstance());
        System.out.println(ApplicationConfigurations.getInstance());
    }
}
