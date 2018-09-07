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

}
