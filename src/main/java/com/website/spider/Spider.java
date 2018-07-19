package com.website.spider;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author 小新
 * @date 2018/7/19
 */

public class Spider {

    private static final String URL = "https://leaseconsumer.souche.com//v1/secondCarSearchApi/querySecondCarListV2.json?page=1&pageSize=40&brandCode=&brandKey=&seriesCode=&keyWord=&prepaidAmount=&newPrice=0-100000&installment=&carAge=&mileage=&color=&carShapeCode=&orderBy=&cityCode=&cityName=&provinceCode=&provinceName=&newPriceName=10%25E4%25B8%2587%25E4%25BB%25A5%25E5%2586%2585";

    private static final String FILE = "E:\\data.txt";

    public static void main(String[] args) throws IOException {

        HttpClient httpclient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(URL);
        httpGet.addHeader("Content-Type", "application/json; charset=utf-8");

        HttpResponse response = httpclient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
//            System.out.println(result);

            ResultVo resultVo = JSON.parseObject(result, new TypeReference<ResultVo>() {
            });

            if (resultVo != null) {
                if ("200".equals(resultVo.getCode())) {
                    List<ItemVo> itemVos = Optional.ofNullable(resultVo.getData()).map(DataVo::getItems).orElse(null);
                    final String[] line = {null};
                    if (itemVos != null && itemVos.size() > 0) {
                        itemVos.forEach(e -> {
                            line[0] = e.getBrandName() + "|" + e.getSeriesName() + "|" + e.getMileage() + "|" + e.getFirstLicensePlateDate() + "\r\n";
//                            System.out.println(line[0]);
                            write(line[0]);
                        });
                    }
                    System.out.println("------------------干完活了-------------");
                    read();
                } else {
                    System.out.println("啊呀呀，出错了呀");
                }
            }

        }

    }

    public static void write(String line) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE, true)));
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read() {

        BufferedReader reader = null;
        String line;
        Set<String> set = new HashSet<>();
        try {
            reader = new BufferedReader(new FileReader(FILE));
            while ((line = reader.readLine()) != null) {
                set.add(line);
                System.out.println(line);
            }
            System.out.println(set.size() + "   ===================");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
