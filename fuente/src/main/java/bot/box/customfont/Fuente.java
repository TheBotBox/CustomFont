package bot.box.customfont;


import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class Fuente {
    /*
    * ALIEN Fuente
    * */
    public static class ALIEN {
        public static Typeface alien_dude(Context context) {
            return FuenteFactory.load(R.raw.aliendude, context);
        }

        public static Typeface begok(Context context) {
            return FuenteFactory.load(R.raw.begok, context);
        }

        public static Typeface daedra(Context context) {
            return FuenteFactory.load(R.raw.daedra, context);
        }

        public static Typeface quirky_robot(Context context) {
            return FuenteFactory.load(R.raw.quirky_robot, context);
        }

        public static Typeface kahles(Context context) {
            return FuenteFactory.load(R.raw.kahles, context);
        }

    }

    /*
    * ANIMAL Fuente
    * */
    public static class ANIMAL {
        public static Typeface zoologic(Context context) {
            return FuenteFactory.load(R.raw.zoologic, context);
        }
    }

    /*
    * STENCIL Fuente
    * */
    public static class STENCIL {

        public static Typeface black_ops(Context context) {
            return FuenteFactory.load(R.raw.black_ops, context);
        }

        public static Typeface capture_small(Context context) {
            return FuenteFactory.load(R.raw.capture_small, context);
        }

        public static Typeface cut_outs(Context context) {
            return FuenteFactory.load(R.raw.cut_outs, context);
        }

        public static Typeface manchest(Context context) {
            return FuenteFactory.load(R.raw.manchest, context);
        }

        public static Typeface aero_matics(Context context) {
            return FuenteFactory.load(R.raw.aero_matics, context);
        }
    }

    /*
    * BITMAP PIXEL Fuente
    * */
    public static class BITMAP_PIXEL {
        public static Typeface karmatic(Context context) {
            return FuenteFactory.load(R.raw.karmatic, context);
        }

        public static Typeface arcade(Context context) {
            return FuenteFactory.load(R.raw.arcade, context);
        }

        public static Typeface vcr_osd(Context context) {
            return FuenteFactory.load(R.raw.vcr_osd, context);
        }

        public static Typeface starmap(Context context) {
            return FuenteFactory.load(R.raw.starmap, context);
        }

        public static Typeface sabo(Context context) {
            return FuenteFactory.load(R.raw.sabo, context);
        }
    }

    /*
    * BLACKLETTER Fuente
    **/
    public static class BLACKLETTER {

        public static Typeface blackknight(Context context) {
            return FuenteFactory.load(R.raw.blackknight, context);
        }

        public static Typeface germania_shadow(Context context) {
            return FuenteFactory.load(R.raw.germania_shadow, context);
        }
    }

    /*
    * CALLIGRAPHY Fuente
    * */
    public static class CALLIGRAPHY {
        public static Typeface southern_aire(Context context) {
            return FuenteFactory.load(R.raw.southern_aire, context);
        }

        public static Typeface magnolia(Context context) {
            return FuenteFactory.load(R.raw.magnolia, context);
        }

        public static Typeface alex_brush(Context context) {
            return FuenteFactory.load(R.raw.alex_brush, context);
        }
    }

}
