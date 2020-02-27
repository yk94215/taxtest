
package main.resources;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOpen {
   private static final File file = new File("D:\\培训文档\\极客学院\\TDD\\TDD-taxi\\src\\main\\resources\\testData.txt");
     public static String[] getLine() throws IOException {
         StringBuffer stringBuffer = new StringBuffer();
         String encoding="GBK";
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),encoding));
         String lineTxt = null;
         List<String> list = new ArrayList<>();

         while((lineTxt = bufferedReader.readLine()) != null){
             System.out.println(lineTxt);
             list.add(lineTxt);
         }
         bufferedReader.close();

          System.out.println("------"+list.get(0).split(",")[0].toString().split("公里")[0].toString());

         return null;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(FileOpen.getLine());
        System.out.println(file);
    }
}
