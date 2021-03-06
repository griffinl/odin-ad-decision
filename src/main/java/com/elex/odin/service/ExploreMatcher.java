package com.elex.odin.service;

import com.elex.odin.entity.ADMatchMessage;
import com.elex.odin.entity.InputFeature;
import com.elex.odin.utils.Constant;

import java.util.Random;

/**
 * Author: liqiang
 * Date: 14-10-24
 * Time: 下午1:51
 * 探索系统
 */
public class ExploreMatcher implements ADMatcher {

    @Override
    public ADMatchMessage match(InputFeature inputFeature) throws Exception {

        int len = AdvertiseManager.adIDs.size();

        Random random = new Random();
        int adID  = AdvertiseManager.adIDs.get(random.nextInt(len));

        return new ADMatchMessage(0, String.valueOf(adID), Constant.TAG.EXPLORE);
    }
}
