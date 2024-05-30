package day240530.practice.teach;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //1. 获取URL实例
            URL url = new URL("http://www.baidu.com/img/bd_logo1.png");
            //2. 建立与服务器端的连接
            urlConnection = (HttpURLConnection) url.openConnection();
            //3. 获取输入流、创建输出流
            is = urlConnection.getInputStream();
            File file = new File("logo.jpg");
            fos = new FileOutputStream(file);
            //4. 读写数据
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("图片下载完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //5. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (urlConnection != null)
                urlConnection.disconnect();
        }
    }
}
