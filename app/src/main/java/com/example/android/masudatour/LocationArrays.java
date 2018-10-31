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
                new Location(context.getString(R.string.ebisuken), context.getString(R.string.ebisuken_descrip), new int[] {R.drawable.dogs})
        ));
    }


}
