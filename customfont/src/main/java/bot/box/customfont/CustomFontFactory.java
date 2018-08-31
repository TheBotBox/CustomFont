package bot.box.customfont;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Environment;
import android.support.annotation.IdRes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class CustomFontFactory {
    public static Typeface mLoad(Context c) {
        int res = 0;
        File rootDirectory;
        PackageManager m = c.getPackageManager();
        String s = c.getPackageName();
        PackageInfo p = null;
        try {
            p = m.getPackageInfo(s, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        s = p.applicationInfo.dataDir;
        rootDirectory = new File(s + "/files");

        if (!rootDirectory.exists()) {
            rootDirectory.mkdir();
        }
        return null;
    }

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

    public static Typeface loadToExternal(Context context, int resourceId) {
        String pathSDCard = Environment.getExternalStorageDirectory() + "/Android/data/" + context.getPackageName();
        Typeface typeface = null;
        try {
            InputStream in = context.getResources().openRawResource(resourceId);
            FileOutputStream out = null;
            out = new FileOutputStream(pathSDCard);
            byte[] buff = new byte[1024];
            int read = 0;
            try {
                while ((read = in.read(buff)) > 0) {
                    out.write(buff, 0, read);
                }
            } finally {
                in.close();
                out.close();
            }
            typeface = Typeface.createFromFile(pathSDCard);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return typeface;
    }
}
