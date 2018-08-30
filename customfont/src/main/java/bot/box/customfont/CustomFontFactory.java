package bot.box.customfont;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.IdRes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class CustomFontFactory {


    public static Typeface load(Context context, int res) {
        Typeface typeface;
        InputStream is = null;

        String path = context.getCacheDir() + "/temp" + System.currentTimeMillis() + ".raw";

        try {
            is = context.getResources().openRawResource(res);
        } catch (Resources.NotFoundException e) {
        }

        try {
            byte[] sBuffer = new byte[is.available()];
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
            int l;
            while ((l = is.read(sBuffer)) > 0) {
                bos.write(sBuffer, 0, l);
            }
            bos.close();

            typeface = Typeface.createFromFile(path);

            new File(path).delete();
        } catch (IOException e) {
            return null;
        }
        return typeface;
    }

    public static Typeface load(Context context, int res,String file) {
        Typeface typeface;
        InputStream is = null;

        String path = context.getCacheDir() + "/temp" + System.currentTimeMillis() + ".raw";

        try {
            is = context.getResources().openRawResource(res);
        } catch (Resources.NotFoundException e) {
        }

        try {
            byte[] sBuffer = new byte[is.available()];
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
            int l;
            while ((l = is.read(sBuffer)) > 0) {
                bos.write(sBuffer, 0, l);
            }
            bos.close();

            typeface = Typeface.createFromFile(path);

            new File(path).delete();
        } catch (IOException e) {
            return null;
        }
        return typeface;
    }
}
