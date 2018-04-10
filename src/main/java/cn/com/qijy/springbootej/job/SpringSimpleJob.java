package cn.com.qijy.springbootej.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * Created by qijunyu on 2018/1/18.
 */
@Component
public class SpringSimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                System.out.println("This is my Case 0 Test! This is My 0 Service!");
                break;
            case 1:
                System.out.println("This is my Case 1 Test! This is My 1 Service!");
                break;
            case 2:
                System.out.println("This is my Case 2 Test!");
                break;
            // case n: ...
        }
    }

//    public byte[] image2byte(String path){
//        byte[] data = null;
//        FileImageInputStream input = null;
//        try {
//            input = new FileImageInputStream(new File(path));
//            ByteArrayOutputStream output = new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//            int numBytesRead = 0;
//            while ((numBytesRead = input.read(buf)) != -1) {
//                output.write(buf, 0, numBytesRead);
//            }
//            data = output.toByteArray();
//            output.close();
//            input.close();
//        }
//        catch (FileNotFoundException ex1) {
//            ex1.printStackTrace();
//        }
//        catch (IOException ex1) {
//            ex1.printStackTrace();
//        }
//        return data;
//    }


    /*public static void main(String[] args) throws IOException {
        List<CompanyHasImgModel> list = new ArrayList<CompanyHasImgModel>();
//        list.add(new CompanyHasImgModel("百度", "D:\\pic\\IMG_0568.JPG", "北京市海淀区西北旺东路10号院百度科技园1号楼"));
//        list.add(new CompanyHasImgModel("阿里巴巴", "D:\\pic\\IMG_0581.JPG", "北京市海淀区西北旺东路10号院百度科技园1号楼"));
//        list.add(new CompanyHasImgModel("Lemur", "D:\\pic\\IMG_0586.JPG", "亚马逊热带雨林"));
//        list.add(new CompanyHasImgModel("一众", "D:\\pic\\IMG_0607.JPG", "山东济宁俺家"));

        URL url = new URL("http://d.wl.motorsc.com/group2/M00/02/06/Co9PNVpgFh-ALZXXAADDay--Upg135.png");
//        URL url = new URL("http://bpic.588ku.com/element_origin_min_pic/17/12/25/5296828180d0869d34634a881acad6a1.jpg");
//        InputStream inputStream = url.openStream();
//        int available = inputStream.available();
//        DataInputStream dataInputStream = new DataInputStream(url.openStream());
        BufferedImage bufferImg = ImageIO.read(url);
        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
        ImageIO.write(bufferImg, "jpg", byteArrayOut);
        byte[] data = byteArrayOut.toByteArray();
        byteArrayOut.close();
//        String imageName = "D:/images/" + 1 + ".jpg";
//        BufferedInputStream bis = new BufferedInputStream(dataInputStream);
//        FileInputStream  input = new FileInputStream (new File("D:\\excel\\1.jpg"));
//        FileImageInputStream  input1 = new FileImageInputStream ();
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//        byte[] bytes = new byte[bis.available()];
//        bis.read(bytes);
//        dataInputStream.close();
//        bis.close();
//        FileOutputStream fileOutputStream = new FileOutputStream(new File(imageName));
//        byte[] bytes = new byte[dataInputStream.available() * 10];
//        inputStream.read(bytes);
//        dataInputStream.read(bytes);
//        byte[] buffer = new byte[1024];
//        int length;
//
//        while ((length = dataInputStream.read(buffer)) > 0) {
//            output.write(buffer, 0, length);
//        }
//        inputStream.close();
//        dataInputStream.close();

        list.add(new CompanyHasImgModel("百度", data, "北京市海淀区西北旺东路10号院百度科技园1号楼"));

        File savefile = new File("D:/excel/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), CompanyHasImgModel.class, list);
        FileOutputStream fos = new FileOutputStream("D:/excel/ExcelExportHasImgTest.exportCompanyImg2.xls");
        workbook.write(fos);
//        dataInputStream.close();
//        output.close();
        fos.close();
    }*/
}
