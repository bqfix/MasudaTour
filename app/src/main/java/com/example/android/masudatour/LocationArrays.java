package com.example.android.masudatour;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Class to hold methods to access lists of location for each fragment
 */
public class LocationArrays {

    public static ArrayList<Location> getRestaurants(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.sakuraya), context.getString(R.string.sakuraya_descrip), new int[] {R.drawable.sakuraya1,R.drawable.sakuraya2,R.drawable.sakuraya3,R.drawable.sakuraya4,R.drawable.sakuraya5}, context.getString(R.string.sakuraya_address), context.getString(R.string.sakuraya_hours), context.getString(R.string.sakuraya_url)),
                new Location(context.getString(R.string.ganesha), context.getString(R.string.ganesha_descrip), new int[] {R.drawable.ganesha1,R.drawable.ganesha2,R.drawable.ganesha3,R.drawable.ganesha4,R.drawable.ganesha5}, context.getString(R.string.ganesha_address), context.getString(R.string.ganesha_hours), context.getString(R.string.ganesha_url)),
                new Location(context.getString(R.string.yagura), context.getString(R.string.yagura_descrip), new int[] {R.drawable.yagura1,R.drawable.yagura2}, context.getString(R.string.yagura_address), context.getString(R.string.yagura_hours), context.getString(R.string.yagura_url)),
                new Location(context.getString(R.string.kakinoki), context.getString(R.string.kakinoki_descrip), new int[] {R.drawable.kakinoki1,R.drawable.kakinoki2,R.drawable.kakinoki3,R.drawable.kakinoki4,R.drawable.kakinoki5}, context.getString(R.string.kakinoki_address), context.getString(R.string.kakinoki_hours), context.getString(R.string.kakinoki_url)),
                new Location(context.getString(R.string.saku), context.getString(R.string.saku_descrip), new int[] {R.drawable.saku1,R.drawable.saku2,R.drawable.saku3,R.drawable.saku4}, context.getString(R.string.saku_address), context.getString(R.string.saku_hours), context.getString(R.string.saku_url)),
                new Location(context.getString(R.string.saku_yakiniku), context.getString(R.string.saku_yakiniku_descrip), new int[] {R.drawable.sakuyakiniku1,R.drawable.sakuyakiniku2,R.drawable.sakuyakiniku3,R.drawable.sakuyakiniku4,R.drawable.sakuyakiniku5}, context.getString(R.string.saku_yakiniku_address), context.getString(R.string.saku_yakiniku_hours), context.getString(R.string.saku_yakiniku_url)),
                new Location(context.getString(R.string.yasumasa), context.getString(R.string.yasumasa_descrip), new int[] {R.drawable.yasumasa1,R.drawable.yasumasa2,R.drawable.yasumasa3,R.drawable.yasumasa4,R.drawable.yasumasa5}, context.getString(R.string.yasumasa_address), context.getString(R.string.yasumasa_hours), context.getString(R.string.yasumasa_url)),
                new Location(context.getString(R.string.tenshin), context.getString(R.string.tenshin_descrip), new int[] {R.drawable.tenshin1,R.drawable.tenshin2,R.drawable.tenshin3,R.drawable.tenshin4,R.drawable.tenshin5}, context.getString(R.string.tenshin_address), context.getString(R.string.tenshin_hours), context.getString(R.string.tenshin_url)),
                new Location(context.getString(R.string.kikkouya_udon), context.getString(R.string.kikkouya_udon_descrip), new int[] {R.drawable.kikkouya1,R.drawable.kikkouya2,R.drawable.kikkouya3,R.drawable.kikkouya4,R.drawable.kikkouya5,R.drawable.kikkouya6,R.drawable.kikkouya7}, context.getString(R.string.kikkouya_udon_address), context.getString(R.string.kikkouya_udon_hours), context.getString(R.string.kikkouya_udon_url)),
                new Location(context.getString(R.string.meiju), context.getString(R.string.meiju_descrip), new int[] {R.drawable.meiju1,R.drawable.meiju2,R.drawable.meiju3,R.drawable.meiju4}, context.getString(R.string.meiju_address), context.getString(R.string.meiju_hours), context.getString(R.string.meiju_url))
        ));
    }

    public static ArrayList<Location> getSightseeing(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.manyo), context.getString(R.string.manyo_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.manyo_address), context.getString(R.string.manyo_hours), context.getString(R.string.manyo_url)),
                new Location(context.getString(R.string.kakinomoto), context.getString(R.string.kakinomoto_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.kakinomoto_address), context.getString(R.string.kakinomoto_hours), context.getString(R.string.kakinomoto_url)),
                new Location(context.getString(R.string.banryu), context.getString(R.string.banryu_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.banryu_address), context.getString(R.string.banryu_hours), context.getString(R.string.banryu_url)),
                new Location(context.getString(R.string.grand_toit), context.getString(R.string.grand_toit_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.grand_toit_address), context.getString(R.string.grand_toit_hours), context.getString(R.string.grand_toit_url)),
                new Location(context.getString(R.string.ikoji), context.getString(R.string.ikoji_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.ikoji_address), context.getString(R.string.ikoji_hours), context.getString(R.string.ikoji_url)),
                new Location(context.getString(R.string.takatsu_river), context.getString(R.string.takatsu_river_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.takatsu_river_address), context.getString(R.string.takatsu_river_hours), context.getString(R.string.takatsu_river_url)),
                new Location(context.getString(R.string.mito_onsen), context.getString(R.string.mito_onsen_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.mito_onsen_address), context.getString(R.string.mito_onsen_hours), context.getString(R.string.mito_onsen_url)),
                new Location(context.getString(R.string.hikimi_gorge), context.getString(R.string.hikimi_gorge_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.hikimi_gorge_address), context.getString(R.string.hikimi_gorge_hours), context.getString(R.string.hikimi_gorge_url)),
                new Location(context.getString(R.string.tsuchida), context.getString(R.string.tsuchida_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.tsuchida_address), context.getString(R.string.tsuchida_hours), context.getString(R.string.tsuchida_url)),
                new Location(context.getString(R.string.nanao), context.getString(R.string.nanao_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.nanao_address), context.getString(R.string.nanao_hours), context.getString(R.string.nanao_url))
        ));
    }

    public static ArrayList<Location> getShopping(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.kinuya), context.getString(R.string.kinuya_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.kinuya_address), context.getString(R.string.kinuya_hours), context.getString(R.string.kinuya_url)),
                new Location(context.getString(R.string.youme_town), context.getString(R.string.youme_town_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.youme_town_address), context.getString(R.string.youme_town_hours), context.getString(R.string.youme_town_url)),
                new Location(context.getString(R.string.aeon), context.getString(R.string.aeon_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.aeon_address), context.getString(R.string.aeon_hours), context.getString(R.string.aeon_url)),
                new Location(context.getString(R.string.juntendo), context.getString(R.string.juntendo_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.juntendo_address), context.getString(R.string.juntendo_hours), context.getString(R.string.juntendo_url)),
                new Location(context.getString(R.string.dorothy), context.getString(R.string.dorothy_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.dorothy_address), context.getString(R.string.dorothy_hours), context.getString(R.string.dorothy_url)),
                new Location(context.getString(R.string.bunkado), context.getString(R.string.bunkado_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.bunkado_address), context.getString(R.string.bunkado_hours), context.getString(R.string.bunkado_url)),
                new Location(context.getString(R.string.uniqlo), context.getString(R.string.uniqlo_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.uniqlo_address), context.getString(R.string.uniqlo_hours), context.getString(R.string.uniqlo_url)),
                new Location(context.getString(R.string.geo), context.getString(R.string.geo_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.geo_address), context.getString(R.string.geo_hours), context.getString(R.string.geo_url)),
                new Location(context.getString(R.string.yamada_denki), context.getString(R.string.yamada_denki_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.yamada_denki_address), context.getString(R.string.yamada_denki_hours), context.getString(R.string.yamada_denki_url)),
                new Location(context.getString(R.string.meirindo), context.getString(R.string.meirindo_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.meirindo_address), context.getString(R.string.meirindo_hours), context.getString(R.string.meirindo_url))
        ));
    }

    public static ArrayList<Location> getEvents(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.daffodil_park), context.getString(R.string.daffodil_park_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.daffodil_park_address), context.getString(R.string.daffodil_park_hours), context.getString(R.string.daffodil_park_url)),
                new Location(context.getString(R.string.super_kagura), context.getString(R.string.super_kagura_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.super_kagura_address), context.getString(R.string.super_kagura_hours), context.getString(R.string.super_kagura_url)),
                new Location(context.getString(R.string.masuda_matsuri), context.getString(R.string.masuda_matsuri_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.masuda_matsuri_address), context.getString(R.string.masuda_matsuri_hours), context.getString(R.string.masuda_matsuri_url)),
                new Location(context.getString(R.string.manyo_matsuri), context.getString(R.string.manyo_matsuri_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.manyo_matsuri_address), context.getString(R.string.manyo_matsuri_hours), context.getString(R.string.manyo_matsuri_url)),
                new Location(context.getString(R.string.mito_fireflies), context.getString(R.string.mito_fireflies_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.mito_fireflies_address), context.getString(R.string.mito_fireflies_hours), context.getString(R.string.mito_fireflies_url)),
                new Location(context.getString(R.string.gionsai), context.getString(R.string.gionsai_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.gionsai_address), context.getString(R.string.gionsai_hours), context.getString(R.string.gionsai_url)),
                new Location(context.getString(R.string.suigosai), context.getString(R.string.suigosai_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.suigosai_address), context.getString(R.string.suigosai_hours), context.getString(R.string.suigosai_url)),
                new Location(context.getString(R.string.hassaku_matsuri), context.getString(R.string.hassaku_matsuri_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.hassaku_matsuri_address), context.getString(R.string.hassaku_matsuri_hours), context.getString(R.string.hassaku_matsuri_url)),
                new Location(context.getString(R.string.airport_marathon), context.getString(R.string.airport_marathon_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.airport_marathon_address), context.getString(R.string.airport_marathon_hours), context.getString(R.string.airport_marathon_url)),
                new Location(context.getString(R.string.masuda_local_goods), context.getString(R.string.masuda_local_goods_descrip), new int[] {R.drawable.dogs}, context.getString(R.string.masuda_local_goods_address), context.getString(R.string.masuda_local_goods_hours), context.getString(R.string.masuda_local_goods_url))
        ));
    }




}
