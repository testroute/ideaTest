package config;
import org.apache.log4j.*;
import org.apache.log4j.net.SMTPAppender;

import java.io.File;
import java.io.IOException;
import java.net.URL;
//import org.apache.log4j.nt.*;
//import org.apache.log4j.net.*;
/**
 * @author
 */
public class logConfig
{
    public static void main(String args[])throws Exception
    {
        getLog logger =new getLog();
        Logger log = logger.getLog();
        log.info("this is ok wg");
//        PropertyConfigurator.configure("C:\\java_programe\\testng\\XunitDemo\\src\\test\\java\\config\\log4j.properties");
//        Logger logger1 = Logger.getLogger("console");
//        logger1.debug("debug!!!");
//        logger1.info("info!!!");
//        logger1.warn("warn!!!");
//        logger1.error("error!!!");
//        logger1.fatal("fatal!!!");
////在NT系统日志输出
//        Logger logger2 = Logger.getLogger("NTlog");
//        //NTEventLogAppender nla = new NTEventLogAppender();
//        logger2.debug("debug!!!");
//        logger2.info("info!!!");
//        logger2.warn("warn!!!");
//        logger2.error("error!!!");
//        //只有这个错误才会写入2000日志
//        logger2.fatal("fatal!!!");
    }

}
class getLog{
    public Logger  getLog() throws IOException {

        File File = new File(this.getClass().getResource("./").getPath());
        String File_Path = String.valueOf(File).concat("\\log4j.properties");
        //File_Path = File_Path.replaceAll("\\\\", "\\\\\\\\");
        System.out.println(File_Path);
        //PropertyConfigurator.configure(File_Path);
        PropertyConfigurator.configure(File_Path);
        //在后台输出
        Logger logger = Logger.getLogger("console");
        logger.info("wg");
        return logger;
    }
}