/*
 * Copyright (c) 2016. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package com.tg8.netSpider;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tg8.entity.TPlace;
import com.tg8.repo.PlaceRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import com.tg8.netSpider.BDData;

/**
 * Created by zj on 15/12/9.
 */
@SuppressWarnings("all")
@RestController
@RequestMapping(value = "/v1/place")
public class PlaceCollections {

    @Autowired
    private PlaceRepository placeRepository;

    @RequestMapping(value = "/original", method = RequestMethod.GET)
    public void getbadmintonInfo() throws IOException {

        for(int j=60;j<61;j++) {

            String webUrl = "http://www.dongsport.com/venue/list-10031-0-0L20-0-0-0-0-0-" + j + ".html";

            Document doc = Jsoup.connect(webUrl).timeout(0).get();
            Elements items = doc.select(".v_l_text");
            Elements scriptsList = doc.select("script");
            Element script = scriptsList.get(14);
            String mapshtml = script.html();
            int firsrIndex = mapshtml.indexOf('[');
            int lastIndex = mapshtml.indexOf(']');

            String mapcontent = mapshtml.substring(firsrIndex, lastIndex + 1);
            // 处理数据
            mapcontent = mapcontent.replaceAll("\r\n", "")
                    .replace(" ", "")
                    .replace("'", "")
                    .replace("custId", "\"custId\"")
                    .replace("custName", "\"custName\"")
                    .replace("longitude", "\"longitude\"")
                    .replace("latitude", "\"latitude\"")
                    .replace("e\":", "e\":\"")
                    .replace("d\":", "d\":\"")
                    .replace(",\"", "\",\"")
                    .replace("}", "\"}");

            System.out.println(mapcontent);

            Gson g = new Gson();

            List<BDData> bdDataList = g.fromJson(mapcontent, new TypeToken<List<BDData>>() {
            }.getType());

            for (Element item : items) {
                Element itemA = item.select("a").get(0);
                Element itemLi = item.select("li").get(0);
                String name = itemA.text();
                System.out.println(name);

                String address = itemLi.text();
                System.out.println(address);

                String longitude = null;
                String latitude = null;

                for (BDData bdData : bdDataList) {
                    if (name.equals(bdData.getCustName().trim())) {
                        longitude = bdData.getLongitude();
                        System.out.println(longitude);

                        latitude = bdData.getLatitude();
                        System.out.println(latitude);
                    }
                }

                TPlace tPlace = new TPlace();

                tPlace.setName(name);
                tPlace.setPlace(address);
                tPlace.setLongitude(longitude);
                tPlace.setLatitude(latitude);
                placeRepository.saveAndFlush(tPlace);

            }
        }
    }
}
