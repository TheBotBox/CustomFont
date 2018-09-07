package bot.box.customfont;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static android.content.ContentValues.TAG;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class FuenteFactory {

    public static Typeface load(int resource, Context context) {
        Typeface sResTypeface;
        InputStream sInputStream = null;

        String sOutPath = context.getCacheDir() + "/fuente" + System.currentTimeMillis() + ".raw";

        try {
            sInputStream = context.getResources().openRawResource(resource);
        } catch (Resources.NotFoundException e) {
        }

        try {
            byte[] sBuffer = new byte[sInputStream.available()];
            BufferedOutputStream sBOutStream = new BufferedOutputStream(new FileOutputStream(sOutPath));
            int l;
            while ((l = sInputStream.read(sBuffer)) > 0) {
                sBOutStream.write(sBuffer, 0, l);
            }
            sBOutStream.close();

            sResTypeface = Typeface.createFromFile(sOutPath);

            new File(sOutPath).delete();
        } catch (IOException e) {
            return null;
        }
        return sResTypeface;
    }
}
