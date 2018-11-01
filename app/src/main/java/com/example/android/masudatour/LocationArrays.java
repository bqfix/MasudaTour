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
                new Location(context.getString(R.string.sakuraya), context.getString(R.string.sakuraya_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.ganesha), context.getString(R.string.ganesha_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.yagura), context.getString(R.string.yagura_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.kakinoki), context.getString(R.string.kakinoki_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.saku), context.getString(R.string.saku_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.saku_yakiniku), context.getString(R.string.saku_yakiniku_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.yasumasa), context.getString(R.string.yasumasa_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.tenshin), context.getString(R.string.tenshin_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.kikkouya_udon), context.getString(R.string.kikkouya_udon_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.meiju), context.getString(R.string.meiju_descrip), new int[] {R.drawable.dogs})
        ));
    }

    public static ArrayList<Location> getSightseeing(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.manyo), context.getString(R.string.manyo_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.kakinomoto), context.getString(R.string.kakinomoto_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.banryu), context.getString(R.string.banryu_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.grand_toit), context.getString(R.string.grand_toit_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.ikoji), context.getString(R.string.ikoji_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.takatsu_river), context.getString(R.string.takatsu_river_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.mito_onsen), context.getString(R.string.mito_onsen_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.hikimi_gorge), context.getString(R.string.hikimi_gorge_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.tsuchida), context.getString(R.string.tsuchida_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.nanao), context.getString(R.string.nanao_descrip), new int[] {R.drawable.dogs})
        ));
    }

    public static ArrayList<Location> getShopping(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.kinuya), context.getString(R.string.kinuya_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.youme_town), context.getString(R.string.youme_town_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.aeon), context.getString(R.string.aeon_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.juntendo), context.getString(R.string.juntendo_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.dorothy), context.getString(R.string.dorothy_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.bunkado), context.getString(R.string.bunkado_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.uniqlo), context.getString(R.string.uniqlo_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.geo), context.getString(R.string.geo_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.yamada_denki), context.getString(R.string.yamada_denki_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.meirindo), context.getString(R.string.meirindo_descrip), new int[] {R.drawable.dogs})
        ));
    }

    public static ArrayList<Location> getEvents(Context context) {
        return new ArrayList<Location>(Arrays.asList(
                new Location(context.getString(R.string.daffodil_park), context.getString(R.string.daffodil_park_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.super_kagura), context.getString(R.string.super_kagura_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.masuda_matsuri), context.getString(R.string.masuda_matsuri_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.manyo_matsuri), context.getString(R.string.manyo_matsuri_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.mito_fireflies), context.getString(R.string.mito_fireflies_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.gionsai), context.getString(R.string.gionsai_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.suigosai), context.getString(R.string.suigosai_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.hassaku_matsuri), context.getString(R.string.hassaku_matsuri_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.airport_marathon), context.getString(R.string.airport_marathon_descrip), new int[] {R.drawable.dogs}),
                new Location(context.getString(R.string.masuda_local_goods), context.getString(R.string.masuda_local_goods_descrip), new int[] {R.drawable.dogs})
        ));
    }




}
